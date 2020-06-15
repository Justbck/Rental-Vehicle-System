
package rental_vehicle_system;


public interface RentalVehicleManager {
    
       
    public abstract void addType(Vehicle type);
    public abstract void printVehicleList();
    public abstract boolean runMenu();
    public abstract void store();
    public abstract void load();

    
    
    //You should implement a console system from where the manager can add new vehicles, delete	if needed, edit	
    //the vehicle information, etc. (as described in detailed below)
    
    
}
