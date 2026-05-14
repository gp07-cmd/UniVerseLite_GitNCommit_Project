package Backend;

import java.util.*;
//Service Unit
public class ServiceUnit extends CampusEntity{

    //Data Members
    protected ArrayList<Staff> staff_members;
    
    //Constructors
    public ServiceUnit(){
        staff_members = new ArrayList<>();
    }

    public ServiceUnit(String name, String location, int entityID) {
        super(name, location, entityID);
        staff_members = new ArrayList<>();
    }

    //Methods to add staff
    public void addStaff(Staff member)
    {
        //If not already present
        int index = staff_members.indexOf(member);
        if(index == -1)
        {
            staff_members.add(member);
        }
        else
        {
            System.out.println("Staff Member is Already Employed Here!");
        }
    }


    public void removeStaff(Staff member)
    {
        //Check if member is present
        int index = staff_members.indexOf(member);
        if(index != -1)
        {
            staff_members.remove(member);
        }
        else
        {
            System.out.println("Staff Member does not Exist!");
        }
    }

    //Method Override
    @Override
    public double calculateOperationalCost()
    {
        double cost = 0;
        for(int i = 0; i < staff_members.size(); i++)
        {
            cost += (staff_members.get(i).getSalaryPerHour()) * (staff_members.get(i).getService_hours());
        }
        return cost;
    }
    
}//end of serviceunit class
