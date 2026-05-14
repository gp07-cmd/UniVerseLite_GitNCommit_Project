package Backend;


public class Classroom extends AcademicUnit{
    //data members
    private boolean isAvailable;
    private int totalcapacity;

    //Zero argument constructir
    public Classroom(){
        super();
        isAvailable = true;
        totalcapacity = 0;
    }
    
    //argument Constructors
    public Classroom(String name, String location, int entityID, boolean isAvailable, int totalcapacity) {
        super(name, location, entityID);
        setIsAvailable(isAvailable);
        setCapacity(totalcapacity);
    }
    
    //Setters
    public final void setCapacity(int totalcapacity) {
        if(totalcapacity > 0) {
            this.totalcapacity = totalcapacity;
        }else{
            this.totalcapacity = 0;
        }
    }
    
    public final void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    //Getters
    public int gettotalCapacity() {
        return totalcapacity;
    }
    
    public boolean getisAvailable() {
        return isAvailable;
    }
    
    
    @Override
    public void addStudent(Student s) {
        if(students.size() < totalcapacity){
            students.add(s);
            System.out.println("Student Added");
            if(students.size() == totalcapacity) {
                isAvailable = false;
            }
        }else{
            System.out.println("Class Capacity Full. Couldn't add Student");
            isAvailable = false;
        }
    }
    
    @Override
    public void removeStudent(Student s) {
        if(students.contains(s)){
            students.remove(s);
            isAvailable = true;
            System.out.println("Student removed");
        }else{
            System.out.println("No Student Found. Student Couldn't be Removed.");
        }
    }
    
    @Override
    public double calculateOperationalCost() {
        double eqprice = 0;
        for(int i=0; i<equipment.size(); i++) {
            eqprice += equipment.get(i).getPrice();
        }
        
        return ( (students.size() * 500) + eqprice); //500(dummy) is the expenditure per student 
    }
    
    @Override
    public String toString() {
        return super.toString() + ("\nTotal Class Capacity : " +totalcapacity+"\nAvailable : " +isAvailable);
    }
}//end of classrom clas
