
import java.util.LinkedHashMap;
import java.util.Map;
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

public class SendungController {
    private Sendung sendung;
    
    
    
    /* private int sendungStatus = 3;
    private Map<String,Object> sendungStatusMap;

    public SendungController() {
        sendungStatusMap = new LinkedHashMap<String,Object>();
        sendungStatusMap.put("Angekündigt", "0"); //label, value
        sendungStatusMap.put("Bereit für Abholung", "1");
        sendungStatusMap.put("In Zustellung", "2");
        sendungStatusMap.put("Zugestellt", "3");
    }
    
    
    
    
    public Sendung getSendung(Sendung sendung) {
        return Verwaltung.getInstance().getSendung(sendung);
    }
    
    public int getSendungStatus() {
        return sendungStatus;
    }

    public void setSendungStatus(int sendungStatus) {
        this.sendungStatus = sendungStatus;
    }

    public Map<String, Object> getSendungStatusMap() {
        return sendungStatusMap;
    }
   

    public void setSendungStatusMap(Map<String, Object> sendungStatusMap) {
        this.sendungStatusMap = sendungStatusMap;
    }
    
    public static void saveSendungStatus(Sendung sendung) {
        Verwaltung.getInstance().saveSendungStatus(sendung);
    }
    */

    
    
    
}
