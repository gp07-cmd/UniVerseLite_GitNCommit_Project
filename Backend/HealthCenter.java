package Backend;
//class HealthCenter
public class HealthCenter extends ServiceUnit implements Notifiable{

    private int doctorsAvailable;
    
    public HealthCenter() {
         super(); 
         doctorsAvailable = 0; 
    }
    
    public HealthCenter(String name, String location, int entityID, int doctorsAvailable) {
        super(name, location, entityID);
        setDoctorsAvailable(doctorsAvailable);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification !");
        System.out.println(message);
    }

    @Override
    public String toString() {
        return super.toString() + ("\nDoctors Available : " +doctorsAvailable);
    }

    public int getDoctorsAvailable() {
        return doctorsAvailable;
    }

    public final void setDoctorsAvailable(int doctorsAvailable) {
        if(doctorsAvailable > 0) {
            this.doctorsAvailable = doctorsAvailable;
        }else{
            this.doctorsAvailable = 0;
        }
        
    }

}//end of HealthCenter class

