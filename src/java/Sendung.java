
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author hartlden
 */
@Entity
public class Sendung implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int status;
    private String groesse;
    private double gewicht;
    private double preis = 0.0;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sendung")
    private List<Briefmarke> briefmarken;
    @ManyToOne
    private Empfaenger empfaenger;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getGroesse() {
        return groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public List<Briefmarke> getBriefmarken() {
        return briefmarken;
    }

    public void setBriefmarken(List<Briefmarke> briefmarken) {
        this.briefmarken = briefmarken;
    }

    public Empfaenger getEmpfaenger() {
        return empfaenger;
    }

    public void setEmpfaenger(Empfaenger empfaenger) {
        this.empfaenger = empfaenger;
    }    

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
