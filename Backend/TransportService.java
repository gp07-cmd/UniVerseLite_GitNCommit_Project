package Backend;

public class TransportService extends ServiceUnit implements Schedulable{ 

    private String routeName;
    private int totalBuses;
    
    public TransportService() { 
        super();
        routeName = "Unknown";
        totalBuses = 0; 
    }
    
    public TransportService(String name, String location, int entityID, String routeName, int totalBuses) {
        super(name, location, entityID);
        setRouteName(routeName);
        setTotalBuses(totalBuses);
    }

    @Override
    public String toString() {
        return super.toString() + ("\nRoute Name : " +routeName+"\nTotal Buses : " +totalBuses);
    }

    public String getRouteName() {
        return routeName;
    }

    public final void setRouteName(String routeName) {
        if(!routeName.isBlank()){
            this.routeName = routeName;
        }else{
            this.routeName = "Unknown";
        }
    }

    public int getTotalBuses() {
        return totalBuses;
    }

    public final void setTotalBuses(int totalBuses) {
        if(totalBuses > 0) {
            this.totalBuses = totalBuses;
        }else{
            this.totalBuses = 0;
        }
    }
    
    //Implement Method
    @Override
    public void generateSchedule()
    {
        System.out.println("Bus  |  Departure Time  | Bus Stop");
        System.out.println("Bus 1 | 7:45 am  | Tarlai ");
        System.out.println("Bus 2 | 8:00 am  | Chandni Chok");
        System.out.println("Bus 3 | 9:15 am  | Fazal Town");
    }
}//end of TransportService class
