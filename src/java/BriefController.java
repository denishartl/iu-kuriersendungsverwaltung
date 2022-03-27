
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

public class BriefController {
    private Brief brief = new Brief();
        
    public Brief getBrief() {
        return brief;
    }
    
    public void save(Empfaenger empfaenger) {
        brief.setEmpfaenger(Verwaltung.getInstance().getEmpfaenger(empfaenger));
        Verwaltung.getInstance().saveSendung(brief);
    }
}