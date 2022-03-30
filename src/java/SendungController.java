
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

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
    private int sendungStatus;
    private int sendungSelector = 0;
    private Map<String,Object> sendungStatusMap;

    public SendungController() {
        sendungStatusMap = new LinkedHashMap<String,Object>();
        sendungStatusMap.put("Angekündigt", "0"); //label, value
        sendungStatusMap.put("Bereit für Abholung", "1");
        sendungStatusMap.put("In Zustellung", "2");
        sendungStatusMap.put("Zugestellt", "3");
    }

    public Sendung getSendung() {
        return sendung;
    }
    
    public void setSendung(Paket sendung) {
        this.sendung = Verwaltung.getInstance().getSendung(sendung);
    }
    
    public int getSendungStatus() {
        return sendungStatus;
    }

    public void setSendungStatus(int sendungStatus) {
        this.sendungStatus = sendungStatus;
    }
    
    public int getSendungSelector() {
        return sendungSelector;
    }

    public void setSendungSelector(int sendungSelector) {
        this.sendungSelector = sendungSelector;
    }

    public Map<String, Object> getSendungStatusMap() {
        return sendungStatusMap;
    }

    public void setSendungStatusMap(Map<String, Object> sendungStatusMap) {
        this.sendungStatusMap = sendungStatusMap;
    }
    
    public void sndng(Sendung sendung) {
        this.sendung = sendung;
    }
    
    public void updateStatus(ValueChangeEvent event) {
        int newStatus = Integer.parseInt(event.getNewValue().toString());
        sendung.setStatus(newStatus);
        Verwaltung.getInstance().saveSendung(sendung);
    }
                
    public List<Sendung> getSendungenByStatus() {
        return Verwaltung.getInstance().getSendungenByStatus(sendungSelector);
    }
    
    public List<Sendung> getSendungen() {
        return Verwaltung.getInstance().getSendungen();
    }
    
    public String getSendungStatusById(int sendungId) {
        return Verwaltung.getInstance().getSendungStatusById(sendungId, sendungStatusMap);
    }
    
    public int getBriefmarkenAnzahl() {
        return (int)Math.ceil(sendung.getPreis() / 0.7);
    }
    
    public void frankiereSendung() {
        List briefmarken = new ArrayList<Briefmarke>();
        int anzahl_briefmarken = (int)Math.ceil(sendung.getPreis() / 0.7);
        Verwaltung.getInstance().saveSendung(sendung);
        for (int i = 0; i < anzahl_briefmarken; i++) {
            briefmarken.add(new Briefmarke(sendung, 0.7));
        }
        //sendung.setBriefmarken(briefmarken);
        Verwaltung.getInstance().saveBriefmarken(briefmarken);
        
        
        System.out.println("Briefmarken saved to db");
    }
}