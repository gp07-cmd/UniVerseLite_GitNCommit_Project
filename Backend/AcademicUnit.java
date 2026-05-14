package Backend;
import java.util.*;
//Academic Unit
public abstract class AcademicUnit extends CampusEntity{
    
    //Data Members
    protected ArrayList<Equipment> equipment;
    protected ArrayList<Student> students;

    //Constructors
    public AcademicUnit() {
        equipment = new ArrayList<>(); 
        students = new ArrayList<>();

    }
    public AcademicUnit(String name, String location, int entityID) {
        super(name, location, entityID);
        equipment = new ArrayList<>();
        students = new ArrayList<>();
    }
    
    public void addEquipment(Equipment equip) {
        //No need to check equipment already present since we can have more than one equipment of same type
        //Add equipment to arrayList
        equipment.add(equip);  
    }
    
    public void removeEquipment(Equipment equip) {
        //Check if equipment is present
        int index = equipment.indexOf(equip);
        if(index != -1)
        {
            equipment.remove(equip);
        }
        else
        {
            System.out.println("Equipment Not Found!");
        }
    }
    
    public void addStudent(Student student)
    {
        //Check if student is not present already
        int index = students.indexOf(student);
        if(index == -1)
        //Add student to arrayList
       {    students.add(student);
       }
       else
       {
        System.out.println("Student Already Enrolled!");
       }
    }
    
    public void removeStudent(Student student)
    {
        //Check the index to find student (if exists)
        int index = students.indexOf(student);
        if(index != -1)
        {   students.remove(student);
        }
        else
        {
            System.out.println("Student Not Found!");
        }
    }
    
    @Override
    abstract public double calculateOperationalCost();
    
}//end of Academic Unit 