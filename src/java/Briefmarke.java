
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Briefmarke implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double wert;
    @ManyToOne
    private Sendung sendung;

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
