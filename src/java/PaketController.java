
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hartlden
 */

@ManagedBean
@SessionScoped

public class PaketController {
    private Paket paket = new Paket();
    
    public Paket getPaket() {
        return paket;
    }
    
    public void save(Empfaenger empfaenger) {
        paket.setEmpfaenger(Verwaltung.getInstance().getEmpfaenger(empfaenger));
        Verwaltung.getInstance().saveSendung(paket);
    }
    
    public void berechnePreis() {
        System.out.println("calculating preis!");
        if (paket.getGewicht() <= 5.0) {
            paket.setPreis(1.70);
        }
        else if (paket.getGewicht() <= 10.0) {
            paket.setPreis(3.00);
        }
        else if (paket.getGewicht() > 10.0) {
            paket.setPreis(5.00);
        }
        if (paket.isSperrgut()) {
            paket.setPreis(paket.getPreis() + 3.00);
        }
    }
}