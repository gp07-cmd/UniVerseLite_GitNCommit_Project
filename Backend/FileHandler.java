package Backend;
import java.io.*;
import java.util.*;

public class FileHandler {

    //1) Write to File
    public void saveToFile(CampusData data, String filename)
    {
        File file = new File(filename);
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
        }
        catch(FileNotFoundException e){ System.err.println("File Not Found."); e.printStackTrace();}
        catch(IOException e){ e.printStackTrace();}
    }
    //2) Read from File
    public CampusData loadOnStartup(String filename)
    {
        try{
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            CampusData data = (CampusData)ois.readObject();
            ois.close();
            return data;
        }
        catch(FileNotFoundException e){ System.err.println("File Not Found."); e.printStackTrace();}
        catch(IOException e){ e.printStackTrace();}
        catch(ClassNotFoundException e){ e.printStackTrace();}
        //In case of error
        return new CampusData();
    }
    }

