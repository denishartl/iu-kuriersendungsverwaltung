
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hartlden
 */
public class BriefmarkeDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("kuriersendungsverwaltung");
    
    public void saveBriefmarke(Briefmarke briefmarke) {
        System.out.println("Made it to DAO");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(briefmarke);    
        t.commit();
    }
}
