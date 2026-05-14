package Backend;

import java.io.*;
public class Books implements Serializable{

    //data members
    private String bookname;
    private String authorname;
    private String edition;
    private boolean isAvailable;
      
    //Zero Argument Constructor
    public Books() {
        bookname = "Unknown";
        authorname = "Unknown";
        edition = "Unknown";
        isAvailable = true;
    }
      
    //Argument Constructor
    public Books(String bookname, String authorname, String edition) {
          
        setBookName(bookname);
        setAuthorName(authorname);
        setEdition(edition);
        isAvailable = true;
    }
      
    //Display Using To String method
    @Override
    public String toString() {
        return ("Book Details : " +"\nBook : " +bookname+ "\nAuthor : " +authorname+ "\nEdition : " +edition+"\n Availability : " +isAvailable);
    }
      
    //Setters
    public final void setBookName(String bookname) {
          
        if(!bookname.isBlank()){
              this.bookname = bookname;
        }else{
              this.bookname = "Book Title Unknown";
        }
    }
      
    public final void setAuthorName(String authorname) {
          
        if(!authorname.isBlank()){
              this.authorname = authorname;
        }else{
              this.authorname = "Author Unknown";
        }
    }
      
    public final void setEdition(String edition) {
          
        if(!edition.isBlank()){
              this.edition = edition;
        }else{
              this.edition = "No Record of Edition Found";
        }
    }

    public void setAvailability(boolean isAvailable) {
          this.isAvailable = isAvailable;
    }
      
    //Getters
    public String getBookName() {
          return bookname;
    }
      
    public String getAuthorName() {
          return authorname;
    }
      
    public String getEdition() {
          return edition;
    }

    public boolean getAvailability() {
          return isAvailable;
    }

}//end of books class
