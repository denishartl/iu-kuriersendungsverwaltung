
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
    private static Verwaltung instance = new Verwaltung();
    private BriefmarkeDAO briefmarkeDao;
    private SendungDAO sendungDao;
    private EmpfaengerDAO empfaengerDao;

    public Verwaltung() {
       briefmarkeDao = new BriefmarkeDAO();
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
    
    public String getSendungStatusById(int sendungId, Map<String,Object> sendungStatusMap) {
        try {
            int status = (sendungDao.findById(sendungId)).getStatus();
            for (Map.Entry<String, Object> e : sendungStatusMap.entrySet()) {
                if (Integer.parseInt(e.getValue().toString()) == status) {
                    return e.getKey();
                }
            }
            return "Sendungsstatus unbekannt!";
        }
        catch (IndexOutOfBoundsException ex) {
            return "Sendung nicht gefunden!";
        }    
    }
    
    public void saveSendung(Sendung sendung) {
        sendungDao.saveSendung(sendung);
    }
    
    public void saveBriefmarken(List<Briefmarke> briefmarken) {
        System.out.println("Made it to verwaltung");
        System.out.println("Anzahl Briefmarken: " + briefmarken.size());
        briefmarkeDao.saveBriefmarken(briefmarken);
    }
    
}
