package Frontend;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Backend.CampusData;
import Backend.FileHandler;

public class MainFrame extends JFrame {
    //These will be used in methods
    CampusData data;
    FileHandler filehandler;

    //(all window functions inside constructor)
    //Segment 1: -----WINDOW SETUP------ 
    public MainFrame(){
        //Window Properties
        setTitle("University Management System");
        setSize(800, 550);
        setLocationRelativeTo(null); //Opens screen in center
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //File load on Window Opening
        //data = filehandler.loadOnStartup("campusdata.dat");
        //Save file on Window Closing
        //We use abstract class 'WindowAdapter' that provides us with WindowListening events and abstract methods to be overriden (e.g. windowClosing, windowOpening)
        //The following is a COMPLETE variable declaration statement
        WindowAdapter listener = new WindowAdapter(){ 
        @Override //JFrame method windowClosing
        public void windowClosing(WindowEvent e)
        {
            //filehandler.saveToFile(data, "campusdata.dat");
            dispose(); //closes the window
        }
    };
        addWindowListener(listener);
        //Set Visibility to True
        setVisible(true);

        //Segment 2: -----Tabs for campus entity data------ 
        //The following creates the tab bar on the top menu of our frame
        JTabbedPane tabs = new JTabbedPane();
        //Individual Tabs
        JPanel studentsPanel = new JPanel();
        JPanel coursesPanel = new JPanel();
        JPanel departmentsPanel = new JPanel();
        JPanel facilitiesPanel = new JPanel();
        JPanel servicesPanel = new JPanel();
        //Add tabs to tab bar
        tabs.addTab("Students", studentsPanel);
        tabs.addTab("Courses", coursesPanel);
        tabs.addTab("Departments", departmentsPanel);
        tabs.addTab("Facilities", facilitiesPanel);
        tabs.addTab("Services", servicesPanel);
        //Set Visible
        setVisible(true);
        //Add the tabs to our mainframe, and we follow BorderLayout
        add(tabs, BorderLayout.CENTER);


}
}
