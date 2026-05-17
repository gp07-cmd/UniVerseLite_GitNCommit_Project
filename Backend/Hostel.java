package Backend;

public class Hostel extends Facility{
      private static final long serialVersionUID = 1L;
    //data Members
    private boolean[] isOccupied = new boolean[100];
      
    //Zero Argument Constructor
    public Hostel() {
    }
      
    //Argument Constructor
    public Hostel(String name, String location, int entityID, double maintenance_cost, double usage_frequency, int totalroom) {
            super(name, location, entityID, maintenance_cost, usage_frequency);
            isOccupied = new boolean[totalroom];
    }
      
    //Occupy Room
    public void occupy(int room) {
            if(room >= 0 && room < isOccupied.length) {
                  isOccupied[room] = true;
            }else{
                  System.out.println("Cannot Occupy Room.");
            }
    }
      
    //Vacant room
    public void vacant(int room) {
            if(room >= 0 && room < isOccupied.length) {
                  isOccupied[room] = false;
            }else{
                  System.out.println("Could not vacant room. Try again");
                  
            }
    }

    public int getTotalRooms()
    {
      return isOccupied.length;
    }
      
    //Hostel data calculation 
    public int occupiedrooms() {
            int occupiedrooms = 0;
            for(int i=0; i<isOccupied.length; i++) {
                  if(isOccupied[i]) {
                        occupiedrooms++;
                  }
            }
            return occupiedrooms;
    }
      
    @Override
    public double calculateOperationalCost() {
            return (maintenance_cost * usage_frequency) + (occupiedrooms() * 20000);
    }
      
    @Override
    public String toString() {
        return super.toString() + ("\nTotal Rooms : " +isOccupied.length+ "\nOccupied Rooms : " +occupiedrooms()+ "\nUnoccupied Rooms : " +(isOccupied.length - occupiedrooms() ) );
    }
}//end of hostel class
