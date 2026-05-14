package Backend;
//interface notifiable

public interface Notifiable {

    //to send notifications to SecurityService, HealthCenter and Admin
    void sendNotification(String message);

}//end of interface Notifiable