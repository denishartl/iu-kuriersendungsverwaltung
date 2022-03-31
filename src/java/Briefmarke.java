
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author hartlden
 */
@Entity
public class Briefmarke implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double wert;
    @ManyToOne
    private Sendung sendung;

    public Briefmarke() {

    }

    public Briefmarke(Sendung sendung, double wert) {
        this.sendung = sendung;
        this.wert = wert;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public Sendung getSendung() {
        return sendung;
    }

    public void setSendung(Sendung sendung) {
        this.sendung = sendung;
    }
}
