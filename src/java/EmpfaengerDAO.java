
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author hartlden
 */
public class EmpfaengerDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("kuriersendungsverwaltung");

    public List<Empfaenger> findAll() {
        EntityManager em = emf.createEntityManager();
        Query abfrage = em.createQuery("select e from Empfaenger e");
        List<Empfaenger> alleEmpfaenger = abfrage.getResultList();
        em.close();
        return alleEmpfaenger;
    }

    public Empfaenger findEmpfaenger(Empfaenger empfaenger) throws IndexOutOfBoundsException {
        EntityManager em = emf.createEntityManager();
        Query abfrage = em.createQuery("select e from Empfaenger e\n"
                + "WHERE NACHNAME = '" + empfaenger.getNachname() + "'\n"
                + "AND    VORNAME = '" + empfaenger.getVorname() + "'\n"
                + "AND    STRASSE = '" + empfaenger.getStrasse() + "'\n"
                + "AND    PLZ = " + empfaenger.getPlz() + "\n"
                + "AND    ORT = '" + empfaenger.getOrt() + "'");
        try {
            return (Empfaenger) abfrage.getResultList().get(0);
        } catch (IndexOutOfBoundsException ex) {
            throw ex;
        } finally {
            em.close();
        }
    }

    public void saveEmpfaenger(Empfaenger empfaenger) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(empfaenger);
        t.commit();
    }
}
