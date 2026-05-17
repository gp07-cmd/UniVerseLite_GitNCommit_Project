package Backend;

import java.util.ArrayList;



public class TransportService extends ServiceUnit implements Schedulable{ 

    
    ArrayList<Bus> buses = new ArrayList<>();
    private boolean isPeakHour; 

    public TransportService() { 
        super();
    }
    
    public TransportService(String name, String location, int entityID) {
        super(name, location, entityID);
    }

    public boolean getIsPeakHour() {
        return isPeakHour;
    }

    public void setIsPeakHour(boolean isPeakHour) {
        this.isPeakHour = isPeakHour;
    }

    public int getTotalBuses() {
        return buses.size();
    }

    //Add and Retire Buses 
    public void addBus(Bus b1) {
        buses.add(b1);
        System.out.println("Bus Added To Transport System");
    } 
    
    public void retireBus(Bus b1) {
        buses.remove(b1);
        System.out.println("Bus Retired");
    }

    //Changing Routes Methods 
    public void ChangeRouteToPeak(boolean isPeakHour) {
        if(isPeakHour) {
            for(int i=0; i<buses.size(); i++) {
                buses.get(i).setCurrentRoute(buses.get(i).getPeakHourRoute());
            }
        }
        System.out.println("Routes Adjusted Per Peak Hour Requirements.");
    }
    
    public void ChangeRouteToNormal(boolean isPeakHour) {
        if(!isPeakHour) {
            for(int i=0; i<buses.size(); i++) {
                buses.get(i).setCurrentRoute(buses.get(i).getNormalRoute());
            }
        }
        
        System.out.println("Routes Adjusted Per Normal Time Requirements.");
    }

    public ArrayList<Bus> getBuses(){
        return buses;
    }
    //Generating Schedule 
    @Override
    public void generateSchedule() {
        System.out.println("Bus Schedule");
        System.out.println(super.toString());
        System.out.println();
        for(int i=0; i<buses.size(); i++) {
            System.out.println(buses.get(i).toString());
            System.out.println();
        }
    }

}//end of TransportService class
