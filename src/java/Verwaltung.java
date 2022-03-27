
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
    private EmpfaengerDAO empfaengerDao;

    public Verwaltung() {
       sendungDao = new SendungDAO();
       empfaengerDao = new EmpfaengerDAO();
    }

    public static Verwaltung getInstance(){
        return instance;
    }
    
    public List<Empfaenger> getAllEmpfaenger() {
        return empfaengerDao.findAll();
    }
    
    public Empfaenger getEmpfaenger(Empfaenger empfaenger) {
        return empfaengerDao.findEmpfaenger(empfaenger);
    }
    
    public void saveEmpfaenger(Empfaenger empfaenger) {
        empfaengerDao.saveEmpfaenger(empfaenger);
    }
    
    public Sendung getSendung(Sendung sendung) {
        return sendungDao.findSendung(sendung);
    }
    
    public List<Sendung> getSendungen() {
        return sendungDao.findAll();
    }
    
    public List<Sendung> getSendungenByStatus(int status) {
        return sendungDao.findByStatus(status);
    }
    
    public void saveSendung(Sendung sendung) {
        sendungDao.saveSendung(sendung);
    }
    
}
