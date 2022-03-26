
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

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

    public Verwaltung() {
       sendungDao = new SendungDAO();
    }

    public static Verwaltung getInstance(){
        return instance;
    }
    
    public List<Sendung> getSendungen() {
        return sendungDao.findAll();
    }
    
    public List<Sendung> getSendungenByStatus(int status) {
        return sendungDao.findByStatus(status);
    }
    
}
