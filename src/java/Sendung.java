
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author hartlden
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Sendung implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String status;
    private String adresse_strasse;
    private String adresse_ort;
    private int adresse_plz;
    private String groesse;
    private double gewicht;
    @ManyToOne
    private List<Briefmarke> briefmarken;
    @OneToMany
    private Empfaenger empfaenger;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdresse_strasse() {
        return adresse_strasse;
    }

    public void setAdresse_strasse(String adresse_strasse) {
        this.adresse_strasse = adresse_strasse;
    }

    public String getAdresse_ort() {
        return adresse_ort;
    }

    public void setAdresse_ort(String adresse_ort) {
        this.adresse_ort = adresse_ort;
    }

    public int getAdresse_plz() {
        return adresse_plz;
    }

    public void setAdresse_plz(int adresse_plz) {
        this.adresse_plz = adresse_plz;
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
    
    
}
