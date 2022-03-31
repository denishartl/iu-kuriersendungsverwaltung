
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hartlden
 */
@ManagedBean
@SessionScoped

public class BriefController {

    private Brief brief = new Brief();

    public Brief getBrief() {
        return brief;
    }

    public String save(Empfaenger empfaenger) {
        brief.setEmpfaenger(Verwaltung.getInstance().getEmpfaenger(empfaenger));
        Verwaltung.getInstance().saveSendung(brief);
        brief = new Brief();
        return "frankierung";
    }

    public void berechnePreis() {
        brief.setPreis(0.7);
    }
}
