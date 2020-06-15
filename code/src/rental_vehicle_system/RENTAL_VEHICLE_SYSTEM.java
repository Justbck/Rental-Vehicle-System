
package rental_vehicle_system;

import java.util.ArrayList;



public class RENTAL_VEHICLE_SYSTEM  {
    
   public static final boolean gui = true;
   
   
   public static final int parkingCapacity= 50;// fixed value to the parking Capacity


    public static void main(String[] args) {
        
        //ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
            
      
        RentalVehicleManager sys = new WestminsterRentalVehicleManager(parkingCapacity);
        boolean exit = false;
        
        
        

        while (!exit){ // system is running utill the exit is pressed
            exit = sys.runMenu();
        }
        
     
    }




}
        

   
    



