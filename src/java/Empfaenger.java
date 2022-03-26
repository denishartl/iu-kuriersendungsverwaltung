
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hartlden
 */
@Entity
public class Empfaenger implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String adresse_strasse;
    private String adresse_ort;
    private int adresse_plz;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empfaenger")
    private List<Sendung> sendungen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Sendung> getSendungen() {
        return sendungen;
    }

    public void setSendungen(List<Sendung> sendungen) {
        this.sendungen = sendungen;
    }
    
    
    
}
