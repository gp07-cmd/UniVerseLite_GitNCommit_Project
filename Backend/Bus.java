package Backend;

import java.io.Serializable;
//class Bus
public class Bus implements Serializable {
    
    //data members
    private String busnumber; //bus number 1 
    private String busNumberPlate; //BZR-076
    private String arrivalTime; //8.30
    private String departureTime; //2.30
    private String normalRoute; //g-10 to Taramari or Uni 
    private String peakHourRoute; //it will just add more stops duirng the peak Hours
    private String currentRoute; //switched depending upon whether it is peak hour or not. if it is peak hour then the current route will be the peak hour route otherwise it will be the normal route

    //Zero Argument Constructor
    public Bus() {

        busnumber = null;
        busNumberPlate = null;
        arrivalTime = null;
        departureTime = null;
        normalRoute = null;
        peakHourRoute = null;
        currentRoute = null;
    }

    //Argument Constructor 
    public Bus(String busnumber, String busNumberPlate, String arrivalTime, String departureTime, String normalRoute, String peakHourRoute) {

        setArrivalTime(arrivalTime);
        setBusNumberPlate(busNumberPlate);
        setBusnumber(busnumber);
        setDepartureTime(departureTime);
        setNormalRoute(normalRoute);
        setPeakHourRoute(peakHourRoute);
        setCurrentRoute(normalRoute);

    }

    //Getters and Setters 

    public String getBusnumber() {
        return busnumber;
    }

    public final void setBusnumber(String busnumber) {
        
        this.busnumber = busnumber;
    }

    public String getBusNumberPlate() {
        return busNumberPlate;
    }

    public final void setBusNumberPlate(String busNumberPlate) {
        
        if(busNumberPlate != null && !busNumberPlate.isBlank()) {
            this.busNumberPlate = busNumberPlate;
        }else{
            this.busNumberPlate = null;
        }
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public final void setArrivalTime(String arrivalTime) {
        
        if(arrivalTime != null && !arrivalTime.isBlank()) {
            this.arrivalTime = arrivalTime;
        }else{
            this.arrivalTime = null;
        }
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public final void setDepartureTime(String departureTime) {
        
        if(departureTime != null && !departureTime.isBlank()) {
            this.departureTime = departureTime;
        }else{
            this.departureTime = null;
        }
    }

    public String getNormalRoute() {
        return normalRoute;
    }

    public final void setNormalRoute(String normalRoute) {
        
        if(normalRoute != null && !normalRoute.isBlank()) {
            this.normalRoute = normalRoute;
        }else{
            this.normalRoute = null;
        }
    }

    public String getPeakHourRoute() {
        return peakHourRoute;
    }

    public final void setPeakHourRoute(String peakHourRoute) {
        
        if(peakHourRoute != null && !peakHourRoute.isBlank()) {
            this.peakHourRoute = peakHourRoute;
        }else{
            this.peakHourRoute = null;
        }
    }

    public String getCurrentRoute() {
        return currentRoute;
    }

    public final void setCurrentRoute(String currentRoute) {
        
        if(currentRoute != null && !currentRoute.isBlank()) {
            this.currentRoute = currentRoute;
        }else{
            this.currentRoute = null;
        }
    }

    //ToString method
    @Override
    public String toString() {
        return ("Bus Number : " +busnumber+"\nBus Number Plate : " +busNumberPlate+"\nArrival Time : " +arrivalTime+"\nDeparture Time : " +departureTime+"\nCurrent Route : " +currentRoute);
    }
}//end Of Bus class 