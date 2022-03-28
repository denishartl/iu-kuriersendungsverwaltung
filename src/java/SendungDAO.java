
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hartlden
 */
public class SendungDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("kuriersendungsverwaltung");
    
    public List<Sendung> findAll() {
        EntityManager em = emf.createEntityManager();
        Query abfrage = em.createQuery("select s from Sendung s");
        List<Sendung> alleSendungen = abfrage.getResultList();
        em.close();
        return alleSendungen;
    }
    
    public List<Sendung> findByStatus(int status) {
        EntityManager em = emf.createEntityManager();
        Query abfrage = em.createQuery("select s from Sendung s where status = " + status);
        List<Sendung> alleSendungen = abfrage.getResultList();
        em.close();
        return alleSendungen;
    }
    
    public Sendung findById(int id) throws IndexOutOfBoundsException {
        EntityManager em = emf.createEntityManager();
        Query abfrage = em.createQuery("select s from Sendung s where id = " + id);
        try {
          return (Sendung)abfrage.getResultList().get(0);  
        }
        catch (IndexOutOfBoundsException ex) {
            throw ex;
        }
        finally {
            em.close();
        }
    }
    
    public Sendung findSendung(Sendung sendung) {
        EntityManager em = emf.createEntityManager();
        return em.merge(sendung);
        //em.refresh(a);
    }
    
    public void saveSendung(Sendung sendung) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(sendung);
        t.commit();
    }
}
