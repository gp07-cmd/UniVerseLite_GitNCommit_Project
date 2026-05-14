package Backend;
import java.util.*;

public class Library extends Facility implements Reportable{
    
    //data members 
    protected ArrayList <Books> b1;
      
    //Zero Argument Constructor
    public Library(){
        super();
        b1 = new ArrayList<>();
    }
      
    //Argument Constructor
    public Library(String name, String location, int entityID, double maintenance_cost, double usage_frequency){
        super(name, location, entityID, maintenance_cost, usage_frequency);
        b1 = new ArrayList<>();
    }
      
    //Displaying all books
    public void displayAll(){
        for(int i=0; i<b1.size(); i++) {
                System.out.println((i+1)+". " +(b1.get(i)).toString());
                System.out.println();
        }
    }

      
    //Displaying the total books present in the library
    public int totalBooks() {
        return b1.size();
    }
      
    //Borrow books
    public void borrowBook(Books b) {
        System.out.println(b.getBookName() + " borrowed from Library.");
        b.setAvailability(false);
    }
      
    //Return books
    public void returnBook(Books b) {
        System.out.println(b.getBookName() + " returned to Library");
        b.setAvailability(true);
    }
      
    //add books
    public void add(Books b){
        b1.add(b);
    }
      
    //remove Books
    public void remove(Books b) {
        b1.remove(b);
    }

    //calculating available and borrowed books
    public void booksdata() {
            int available = 0;
            int borrowed = 0;
            for(int i=0; i<b1.size(); i++) {
                  if(b1.get(i).getAvailability()){
                        available++;
                  }else{
                        borrowed++;
                  }
            }
            System.out.println("Available Books = " +available);
            System.out.println("Borrowed Book = " +borrowed);
    }

    @Override
    //Calculate Operational costs
    public double calculateOperationalCost(){
        return (maintenance_cost * usage_frequency) + (b1.size() * 150);

        //multiplying the number of books with a dummy value like 150. and then adding it to the operational costs.
    }

    @Override
    //toString method
    public String toString() {
        return super.toString() + ("\nTotal Books in Library : " +b1.size());
    }
    
    @Override
    public void generateReport() {
        System.out.printf("%50s", "Usage Stats for Library");
        System.out.println();
        System.out.println("Location : " +location);
        System.out.println("Entity ID : " +entityID);
        System.out.println("Usage Information");
        System.out.println("Maintenance cost : " +maintenance_cost);
        System.out.println("Usage Frequency : " +usage_frequency);
        System.out.println("Total Books in Library = " +b1.size());
        booksdata();
        System.out.println("Operational Cost : " +calculateOperationalCost());
    }

}//end of library class