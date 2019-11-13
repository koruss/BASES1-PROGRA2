/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kcorr
 */
public class EventData {

    public EventData(String title, String description, String date, int idEvent, int idClassification, int idCommunity, String place) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.idEvent = idEvent;
        this.idClassification = idClassification;
        this.idCommunity = idCommunity;
        this.place = place;
    }

    public EventData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public int getIdClassification() {
        return idClassification;
    }

    public void setIdClassification(int idClassification) {
        this.idClassification = idClassification;
    }

    public int getIdCommunity() {
        return idCommunity;
    }

    public void setIdCommunity(int idCommunity) {
        this.idCommunity = idCommunity;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    private String title;
    private String description;
    private String date;
    private String photo;
    private int idEvent;
    private int idClassification;
    private int idCommunity;
    private String place;   
    
}
