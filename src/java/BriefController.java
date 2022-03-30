
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
    
    public String save(Empfaenger empfaenger) {
        brief.setEmpfaenger(Verwaltung.getInstance().getEmpfaenger(empfaenger));
        Verwaltung.getInstance().saveSendung(brief);
        brief = new Brief();
        return "frankierung";
    }
    
    public void berechnePreis() {
        System.out.println("Setting brief price to 0.7");
        brief.setPreis(0.7);
    }
}