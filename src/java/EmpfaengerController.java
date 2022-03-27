
import java.util.List;
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

public class EmpfaengerController {
    private Empfaenger empfaenger = null;
    private Empfaenger tempEmpfaenger = new Empfaenger(); // temporary for saving user input
    
    public List<Empfaenger> getAlleEmpfaenger() {
        return Verwaltung.getInstance().getAllEmpfaenger();
    }
    
    public Empfaenger getEmpfaenger() {
        return empfaenger;
    }
    
    public Empfaenger getTempEmpfaenger() {
        return tempEmpfaenger;
    }
    
    public void submitEmpfaenger() {
        try {
           empfaenger = Verwaltung.getInstance().getEmpfaenger(tempEmpfaenger); 
        }
        catch (IndexOutOfBoundsException ex) {
            Verwaltung.getInstance().saveEmpfaenger(tempEmpfaenger);
            empfaenger = tempEmpfaenger;
        }
        
    }
}
