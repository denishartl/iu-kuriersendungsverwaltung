
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

public class BriefController {
    private Brief brief = new Brief();
        
    public Brief getBrief() {
        return brief;
    }
    
    public void save(Empfaenger empfaenger) {
        brief.setEmpfaenger(Verwaltung.getInstance().getEmpfaenger(empfaenger));
        Verwaltung.getInstance().saveSendung(brief);
        System.out.println("Change");
    }
    
    public void berechnePreis() {
        brief.setPreis(0.7);
    }
}