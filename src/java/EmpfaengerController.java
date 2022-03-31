
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hartlden
 */
@ManagedBean
@SessionScoped

public class EmpfaengerController {

    private Empfaenger empfaenger = null;
    private Empfaenger tempEmpfaenger = new Empfaenger(); // temporary for saving user input

    public List<Empfaenger> getAlleEmpfaenger() {
        return Verwaltung.getInstance().getAllEmpfaenger();
    }

    public Empfaenger getEmpfaenger() {
        return empfaenger;
    }

    public Empfaenger getTempEmpfaenger() {
        return tempEmpfaenger;
    }

    public String submitEmpfaenger() {
        try {
            empfaenger = Verwaltung.getInstance().getEmpfaenger(tempEmpfaenger);
        } catch (IndexOutOfBoundsException ex) {
            Verwaltung.getInstance().saveEmpfaenger(tempEmpfaenger);
            empfaenger = tempEmpfaenger;
        }
        return "sendungserfassung";
    }
}
