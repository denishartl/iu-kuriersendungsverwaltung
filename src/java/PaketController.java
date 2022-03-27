
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

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
@ViewScoped

public class PaketController {
    private Paket paket = new Paket();
    
    public Paket getPaket() {
        return paket;
    }
    
    public void save(Empfaenger empfaenger) {
        paket.setEmpfaenger(Verwaltung.getInstance().getEmpfaenger(empfaenger));
        Verwaltung.getInstance().saveSendung(paket);
    }
}