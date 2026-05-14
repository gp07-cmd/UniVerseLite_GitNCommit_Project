package Backend;

//Facility
public class Facility extends CampusEntity{

    //Data Members
    protected double maintenance_cost;
    protected double usage_frequency;

    //tracking system's totalfacilityusage
    protected static double totalfacilityusage = 0; 

    //Constructors
    public Facility() {}

    public Facility(String name, String location, int entityID, double maintenance_cost, double usage_frequency) {
        super(name, location, entityID);
        setMaintenance_cost(maintenance_cost);
        setUsage_frequency(usage_frequency);
    }

    //Getters Setters
    public double getMaintenance_cost() {
        return maintenance_cost;
    }

    public final void setMaintenance_cost(double maintenance_cost) {
        if(maintenance_cost > 0) {
            this.maintenance_cost = maintenance_cost;
        }else{
            this.maintenance_cost = 0;
        }
        
    }

    public double getUsage_frequency() {
        return usage_frequency;
    }

    public final void setUsage_frequency(double usage_frequency) {
        if(usage_frequency > 0) {
            this.usage_frequency = usage_frequency;
        }else{
            this.usage_frequency = 0;
        }

        totalfacilityusage += usage_frequency;
    }
    
    //static methods
    public static double getTotalFacilityUsage() {
          return totalfacilityusage;
    }

    public static void displayTotalFacilityUsage() {
        System.out.println("Total Facility Usage = " +totalfacilityusage);
    }
    
    //Methods
    @Override
    public double calculateOperationalCost() {
        return maintenance_cost * usage_frequency;
    }

}//end of facility class