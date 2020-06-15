
package rental_vehicle_system;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static rental_vehicle_system.RENTAL_VEHICLE_SYSTEM.parkingCapacity;


public class WestminsterRentalVehicleManager implements RentalVehicleManager {
    
    // implements the interface RentalVehicleManager
     ArrayList<Vehicle > vehicleList; // holds all vehicle details
     private int numVehicle;     // number of vehicles stored in array
    
    // maintains the list of the vehicle to rent 
    // provides all the methods for the system manager
     
    public WestminsterRentalVehicleManager(int listLength){ //adding vehicles and their details to the data
        this.numVehicle = listLength;
        vehicleList = new ArrayList<Vehicle>();
    }
    
    public WestminsterRentalVehicleManager(){
          this.vehicleList =   vehicleList;
        
    }
    
    

    //display in the console a menu
    //manager can select one option
    
    //ADD A NEW VEHICLE 
    // car or motorbike with all the relevant info
    // rental park are max 50 parking lots 
    
     @Override
     public void addType(Vehicle type) {
        
        if(vehicleList.size() < numVehicle) {
            vehicleList.add(type);
       
            
            if (vehicleList.size() > parkingCapacity){              // adding vehicles is possible only if there is a space at the parking
                System.out.println("No more space in the list");
                }
        }
        
        else  {
            System.out.println("No more space in the list");
            System.out.println("Please delete any of the vehicles.");
        }
    
    }
     
    
    public void printVehicleList() {
        
        Vehicle[] vehicleSort = new Vehicle[vehicleList.size()];
        
        
        for (int i = 0; i < vehicleList.size(); i++) {      //prints all vehicles that have been added
          
             
            //if(vehicleList.get(i).getType().equals("Car")) {//distinguish types of vehicles
            //    System.out.println("Type: car");
            //} 
            //  else if(vehicleList.get(i).getType().equals("Motorbike")) {
            //     System.out.println("Type: Motorbike");
            //}
            
          
            //System.out.println(vehicleList.get(i));
                //ArrayList <String> strList = new ArrayList<String>();
                //strList.add(vehicleList.get(i).getMake());
                //Collections.sort(strList);
        
               //for (String str:strList) {
               //    System.out.println("" + str);
               //}
                
    
                 //    if (str.equals(vehicleList.get(i).getMake())){
                 //    System.out.println(vehicleList.get(i).getMake());
                 //    }
                 //}
                 
                 
                //prints vehicle details according to the type of vehicle
            vehicleSort[i] = vehicleList.get(i);
                                              
              
        
        
        if (vehicleList.size() > parkingCapacity){
            System.out.println("No more space in the list");
            System.out.println("Please delete any of the vehicles.");   
        }
    }
        Arrays.sort(vehicleSort);
        
         for (int i = 0; i < vehicleList.size(); i++) {
        System.out.println((vehicleSort[i]).toString());
         }

}
    
    public void store(){
        System.out.println("Your data have been strored.");
        PrintWriter file;
         try {
             file = new PrintWriter("src\\VehicleData.txt");
             for (int i = 0; i < vehicleList.size(); i++){
                 file.println(vehicleList.get(i));
             }
             file.close();
             
         } catch (FileNotFoundException ex) {
             Logger.getLogger(WestminsterRentalVehicleManager.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
    public void load(){
        String file = "src\\VehicleData.txt";
    String test = "";
    
    InputStream ips = null;
         try {
             ips = new FileInputStream(file);
         } catch (FileNotFoundException ex) {
             Logger.getLogger(WestminsterRentalVehicleManager.class.getName()).log(Level.SEVERE, null, ex);
         }
    InputStreamReader ipsr = new InputStreamReader (ips);
    BufferedReader br = new BufferedReader(ipsr);
    String line;
         try {
             while ((line = br.readLine())!=null) {
                 test += line + "\n";
             }    } catch (IOException ex) {
             Logger.getLogger(WestminsterRentalVehicleManager.class.getName()).log(Level.SEVERE, null, ex);
         }
         try {
             br.close();
         } catch (IOException ex) {
             Logger.getLogger(WestminsterRentalVehicleManager.class.getName()).log(Level.SEVERE, null, ex);
         }


    
            for (int i=0; i < vehicleList.size(); i++) {
            System.out.println(vehicleList.get(i));

            }
  
    }
        

     @Override
     public boolean runMenu() {
        
        boolean exit = false; // menu is run untill exit is true
        
        
        System.out.println("-----------------MENU-----------------");
        System.out.println("1 - Add a new vehicle");
        System.out.println("2 - Delete a vehicle");
        System.out.println("3 - Print the list of all vehicles");
        System.out.println("4 - Save the list in a file");
        System.out.println("5 - View Graphical User Interface");
        System.out.println("6 - Exit");
        System.out.println("--------------------------------------");
        
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt(); // users input - selected option
        
        
        
        switch(choice){
            
            case 1:
                
                if (vehicleList.size() >= parkingCapacity){
                    System.out.println("You cannot add another vehicle. The parking if full");
                    System.out.println("Please delete any vehicle if you want to add new one. ");
                    runMenu();
                }
                
                while(vehicleList.size() < parkingCapacity){ //adding is possible only if there is a space at the parking
                    
            
                
                System.out.println("Press 1 if you want to add a car");
                System.out.println("Press 2 if you want to add a motorbike");
                
                
                
                int choice2 = s.nextInt();
                s.nextLine();
                s.toString(); 
                
                
                
                System.out.println("Enter the plate number of your vehicle: ");
                String plateNum = s.next();//storing plate number in a array
                s.toString();
                
                
                System.out.println("Enter the make of your vehicle: ");
                String make = s.next();//storing make
                
                System.out.println("Enter pick up date: ");
                System.out.println("Day: ");
                int pickUpDay = s.nextInt();
               
                    while ((pickUpDay <= 0)||(pickUpDay >= 32)){
      
                     System.out.println("Not correct value.Try again.");
                     System.out.println("Enter pick up date: ");
                     System.out.println("Day: ");
                     pickUpDay = s.nextInt(); 
                     
                    }
                    
                    s.toString();
                
            
                
                System.out.println("Month: ");
                int pickUpMonth = s.nextInt();
                
                 while ((pickUpMonth <= 0)||(pickUpMonth >= 13)){
      
                     System.out.println("Not correct value.Try again.");
                     System.out.println("Month: ");
                     pickUpMonth = s.nextInt(); 
                     
                    }
            
                s.toString();
                
                
                System.out.println("Year: ");
                int pickUpYear =  s.nextInt();
                
                  while ((pickUpYear < 2000)||(pickUpYear >= 2099)){
      
                     System.out.println("Not correct value.Try again.Enter year startin from 2000");
                     System.out.println("Year: ");
                     pickUpYear = s.nextInt(); 
                     
                    }
                
                
                s.toString();
                
                Schedule date = new Schedule(pickUpDay, pickUpMonth ,pickUpYear);
                s.toString();
                
                
                
               
                
                 
                
                switch(choice2){
                    case 1:
                        //storing car details
                        System.out.println("Insert the number of seats: ");
                        int seats = s.nextInt(); 
                        System.out.println("Enter the model of your car:");
                        String model = s.next();
                        Car c = new Car(model, seats, plateNum, make,date);
                        this.addType(c);
                        //this.vehicleList.add(c);
                        VehicleTable table = new VehicleTable(vehicleList);
                        //table.setVisible(true);
                        
                        break;
                    case 2:
                        //storing motorbike details
                      
                        System.out.println("Enter type of engine: ");
                        String engine = s.next();
                        System.out.println("Insert the amount of consumption: ");
                        int consumption = s.nextInt();
                        Motorbike m = new Motorbike(engine,consumption, plateNum, make,date);
                        this.addType(m);
                        //this.vehicleList.add(m);
                        //table = new VehicleTable(vehicleList);
                         
                        //VehicleTable table = new VehicleTable(vehicleList);
                        //table.setVisible(true);
                      
                    
                        break;   
                }
                System.out.println("Your vehicle was succesfully added to the system.");
                runMenu();
                }
                
               
          
        case 2:
            
              
            System.out.println("Enter plate number: ");
            String choice3 = s.next();
            
            int spaceLeft = (parkingCapacity - vehicleList.size()) + 1;

            
            for (int i = 0; i < vehicleList.size(); i++){
                vehicleList.get(i).getPlateNum();
            
      
                
                if (choice3.equalsIgnoreCase(vehicleList.get(i).getPlateNum())){
                    System.out.println("Deleting following vehicle");
                    System.out.println("--------------------------");
                    System.out.println(vehicleList.get(i).getType());
                    System.out.println(vehicleList.get(i));
                    System.out.println("Parking space left: " + spaceLeft );
                    System.out.println("--------------------------");
                    
                    vehicleList.remove(i);
                    runMenu();
                }
            }
            break;

        case 3: 
            
            if (vehicleList.size() > 0) {
            
                System.out.println("---------------VEHICLES---------------");
                this.printVehicleList();
                System.out.println("--------------------------------------");
                runMenu();
                break;
            }
            else {
                System.out.println("The parking is empty");
                runMenu();
                break;
            }
            
           
        
            
        case 4:
            
            //sava data into file
            
  
            System.out.println("Data was saved and updated.");
            store();
            load();
            runMenu();
            break;
            
            
        case 5:
            System.out.println("View GUI");
            VehicleTable table = new VehicleTable(vehicleList);
            table.setVisible(true);
            VehicleProject.main(new String[0]);
            
         
            break;
                    
        case 6:
            exit = true;
            System.out.println("Thank you for using the program.");
            System.out.println("You are exiting the system now.");
            break;       
        }
     
        return exit;

    }
    
    
     

    
    
    
    
    //DELETE A VEHICLE 
    // deleting by selecting the plate number
    // display a message with the information
    // of the vehicle that has been deleted
    //(if its car or motobike)
    // display numer of availble parking lots in the garage
    

    //PRINT THE LIST OF THE VEHICLE
    // for each vehicle print the plate number,
    // type of vehicle(car or motorbike)
    // list should be ordered alphabetically
    // according to the vehicle make
    

    
    //WRITE/SAVE
    // vehicle stock list in a file after any changes
    
    
    
    //...... 
    //CREATE A GRAPHICAL USER INTERFACE(GUI)
    // can be opened selcting the option in a menu console
    
    // - the user can visualise the list of vehicles in 
    //   WestminsterRentalVehicle system
    
    // - the user can filter the vehicles according at
    //   least one parameter(type, or the engine size, or
    //   the make, etc)
    
    // - the user can check the availability of the vehicle in 
    //   specific dates and can book, make a reservation if its
    //   available


  
    
}
