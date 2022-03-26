
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
}
