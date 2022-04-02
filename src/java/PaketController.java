
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author hartlden
 */
@ManagedBean
@RequestScoped

public class PaketController {

    private Paket paket = new Paket();

    public Paket getPaket() {
        return paket;
    }

    public void berechnePreis() {
        if (paket.getGewicht() > 10.0) {
            paket.setPreis(5.00);
        } else if (paket.getGewicht() <= 10.0) {
            paket.setPreis(3.00);
        } else if (paket.getGewicht() <= 5.0) {
            paket.setPreis(1.70);
        }
        if (paket.isSperrgut()) {
            paket.setPreis(paket.getPreis() + 3.00);
        }
    }
}
