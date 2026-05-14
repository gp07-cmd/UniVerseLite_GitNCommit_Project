package Backend;

import java.util.*;
import java.io.*;

//class cAMPUS ZONE
public class CampusZone implements Serializable{

    private int zoneID; //3 in AB3, 2 in AB2 
    private String zoneName; //like Academic Block. Faculty block etc 
    private ArrayList<Facility> facilities;
    private ArrayList<ServiceUnit> serviceUnits;
    
    public CampusZone() {
        zoneID = 0;
        zoneName = "Unknown";
        facilities = new ArrayList<>();
        serviceUnits = new ArrayList<>();
    }
    
    public CampusZone(int zoneID, String zoneName) {
        setZoneID(zoneID);
        setZoneName(zoneName);
        facilities = new ArrayList<>();
        serviceUnits = new ArrayList<>();
    }

    public int getZoneID() {
        return zoneID;
    }

    public final void setZoneID(int zoneID) {
        if(zoneID > 0) {
            this.zoneID = zoneID;
        }else{
            this.zoneID = 0;
        }
    }

    public String getZoneName() {
        return zoneName;
    }

    public final void setZoneName(String zoneName) {
        if(!zoneName.isBlank()) {
            this.zoneName = zoneName;
        }else{
            this.zoneName = "Zone Unknown";
        }
    }
    
    public void addFacilities(Facility f) {
        facilities.add(f);
    }

    public void removeFacilities(Facility f) {
        facilities.remove(f);
    }

    @Override
    public String toString() {
        return "CampusZone [zoneID=" + zoneID + ", zoneName=" + zoneName + ", facilities=" + facilities
                + ", serviceUnits=" + serviceUnits + ", toString()=" + super.toString() + ", getZoneID()=" + getZoneID()
                + ", getZoneName()=" + getZoneName() + "]";
    }

}//end of CampusZone 