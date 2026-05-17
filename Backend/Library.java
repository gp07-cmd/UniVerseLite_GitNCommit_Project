package Backend;
import java.util.*;

public class Library extends Facility implements Reportable{
    private static final long serialVersionUID = 1L;
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

    public ArrayList<Books> getBooks() {
    return b1;
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
        return ((maintenance_cost * usage_frequency) + (b1.size() * 150));

        //multiplying the number of books with a dummy value like 150. and then adding it to the operational costs.
    }

    @Override
    //toString method
    public String toString() {
        return super.toString() + ("\nTotal Books in Library : " +b1.size());
    }
    
    @Override
    public String generateReport() {
        String result = "Usage Stats for Library\n" +
        "Location : " +location + "\n" +
        "Entity ID : " +entityID + "\n" +
        "Usage Information: \n" + 
        "Maintenance cost : " +maintenance_cost + "\n" +
        "Usage Frequency : " +usage_frequency + "\n" +
        "Total Books in Library = " +b1.size() + "\n" +
        "Operational Cost : " +calculateOperationalCost();
        return result;
    }

}//end of library class