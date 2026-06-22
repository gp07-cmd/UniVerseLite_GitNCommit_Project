package Backend;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 5429667519936553852L;
    
    //For the frontend and access responsibilty a user must have the following things to be ale to access the system
    private String username;
    private String password;
    private String role; //Admin, Student, Teacher 

    public User() {
        username = null;
        password = "name123";
        role = null;
    }

    //Argument Constructor
    public User(String username, String password, String role) {

        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    //Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    //Setters
    public final void setRole(String role) {

        if(!role.isBlank()) {
            this.role = role;
        }else{
            this.role = null;
        }
    }

    public final void setPassword(String password) {

        if(!password.isBlank()) {
            this.password = password;
        }else{
            this.password = "name123";
        }
    }

    public final void setUsername(String username) {

        if(!username.isBlank()) {
            this.username = username;
        }else{
            this.username = null;
        }
    }

    @Override
    public String toString() {
        return ("Username : " +username+"\nRole : " +role);
    }

    //method to give permsiion to access dependng upon the role 
    public boolean grantAccess(String action) {

        if(role.equalsIgnoreCase("Admin")) {
            return true;
        }else if(role.equalsIgnoreCase("Teacher")) {
            return action.equals("scheduleclass") || action.equals("modifyDeadline") || action.equals("uploadAssignment") ;
        }else if(role.equalsIgnoreCase("Student")) {
            return action.equals("enrollCourse") || action.equals("generateReport") || action.equals("dropCourse") || action.equals("viewTimeTable") || action.equals("generateSchedule");
        }else{
            return false;
        }
    }

    // A tab is restricted to Admin only when ALL features within it
    // are already gated behind admin-only grantAccess actions.
    // Students tab: Teacher can view enrolled courses (unrestricted btn),
    //               Student can enroll + view courses → not admin-only.
    // Courses tab:  only add/delete exist, both admin-only → safe to restrict.
    // Reports tab:  Student has grantAccess("generateReport") and no
    //               button-level checks → not admin-only.
    public boolean canViewStudents() {
        return true;
    }

    public boolean canViewCourses() {
        return role.equalsIgnoreCase("Admin");
    }

    public boolean canViewFacilities() {
        return true;
    }

    public boolean canViewReports() {
        return true;
    }

    public boolean canViewSchedules() {
        return true;
    }

}//end of User Class 
