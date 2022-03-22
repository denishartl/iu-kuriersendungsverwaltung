
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;






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
    private SendungDAO sendungDao;
    private String name = "fucker";

    public Verwaltung() {
       sendungDao = new SendungDAO();
    }

    public static Verwaltung getInstance(){
        return instance;
    }
    
    public List<Sendung> getSendungen() {
        return sendungDao.findAll();
    }
    
}
