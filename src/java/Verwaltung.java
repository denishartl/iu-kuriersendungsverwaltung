
import javax.annotation.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.persistence.EntityManagerFactory;
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
@ManagedBean
@ApplicationScoped
public class Verwaltung {
  //private List<Artikel> sortiment = new ArrayList<Artikel>();
    private static Verwaltung instance = new Verwaltung();
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kuriersendungsverwaltung");

    public Verwaltung() {

    }

    public static Verwaltung getInstance(){
        return instance;
    }
}
