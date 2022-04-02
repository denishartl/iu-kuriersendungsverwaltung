
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author hartlden
 */
@ManagedBean
@RequestScoped

public class BriefController {

    private Brief brief = new Brief();

    public Brief getBrief() {
        return brief;
    }

    public void berechnePreis() {
        brief.setPreis(0.7);
    }
}
