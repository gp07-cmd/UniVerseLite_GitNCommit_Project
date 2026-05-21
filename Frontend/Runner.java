package Frontend;

import Backend.*;

public class Runner {
    public static void main(String[] args) {
        AppTheme.applyGlobalDefaults();
        FileHandler handler = new FileHandler();
        CampusData data;
        data = handler.loadOnStartup("campusdata.dat");
        data.users.add(new User("Admin", "admin123", "ADMIN"));
        data.users.add(new User("Teacher", "teacher123", "TEACHER"));
        data.users.add(new User("Student", "student123", "STUDENT"));

        new LoginFrame(data);
    }
    
}//end of runner class 
