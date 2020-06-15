
package rental_vehicle_system;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class VehicleTableModel extends AbstractTableModel{
    
    
    private String[] columnNames = {"Plate Number","Make","Type","Date","Model","Seats","Engine Type","Consumption"}; 
    //Car c = new Car(model, seats, plateNum, make,date);
    private ArrayList<Vehicle> vehicleList; 
    private String keyword = "";
    
    public VehicleTableModel(ArrayList<Vehicle> vehicleList){
        super();
        this.vehicleList = vehicleList;
    }

    @Override
    public int getRowCount() {
        return vehicleList.size(); 
    
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null; 
       
   
        if (columnIndex == 0) { 
            
         temp = vehicleList.get(rowIndex).getPlateNum();
        
      } 
      else if (columnIndex == 1) { 
         temp = vehicleList.get(rowIndex).getMake(); 
      } 
      
     
      else if (columnIndex == 2) { 
          if(vehicleList.get(rowIndex) instanceof Motorbike)
            temp = "Motorbike"; 
          else
            temp = "Car";
      } 
        
        
         else if (columnIndex == 3) { 
         temp = vehicleList.get(rowIndex).getDate(); 
      } 
        
        
        else if (columnIndex == 4) { 
            if(vehicleList.get(rowIndex) instanceof Car)
                temp = vehicleList.get(rowIndex).getModel();
            else 
                temp = "";

      } 
        
             
        else if (columnIndex == 5) { 
          if(vehicleList.get(rowIndex) instanceof Car)
                temp = vehicleList.get(rowIndex).getSeats();
          else 
              temp = "";

      } 
             
        else if (columnIndex == 6) { 
            
          if(vehicleList.get(rowIndex) instanceof Motorbike)
                temp = vehicleList.get(rowIndex).getEngine();
          else
              temp = "";

      } 
        
           else if (columnIndex == 8) { 

                temp = vehicleList.get(rowIndex).getConsumption();
      } 
        
             
        else if (columnIndex == 7) { 
            if(vehicleList.get(rowIndex) instanceof Car)
          
                temp = vehicleList.get(rowIndex).getModel();
            else
                temp = "";

        } 
        
        
        //filter
        
          
        else if (keyword.equals("")){
                if(columnIndex == 0) {
            
         temp = vehicleList.get(rowIndex).getPlateNum();
                }
      } 
        
        
         else if (keyword.equals("")){
                  if (columnIndex == 1) { 
         temp = vehicleList.get(rowIndex).getMake(); 
              }
      } 
      
         else if (keyword.equals("")){
                  if (columnIndex == 2) { 
          if(vehicleList.get(rowIndex) instanceof Motorbike)
            temp = "Motorbike"; 
          else
            temp = "Car";
          }
      } 
        
         else if (keyword.equals("")){
                if (columnIndex == 3) { 
         temp = vehicleList.get(rowIndex).getDate(); 
                 }
      } 
        
        else if (keyword.equals("")){
                 if (columnIndex == 4) { 
            if(vehicleList.get(rowIndex) instanceof Car)
                temp = vehicleList.get(rowIndex).getModel();
            else 
                temp = "";
            
        }

      } 
        
             else if (keyword.equals("")){
                if (columnIndex == 5) { 
          if(vehicleList.get(rowIndex) instanceof Car)
                temp = vehicleList.get(rowIndex).getSeats();
          else 
              temp = "";
        }

      } 
             else if (keyword.equals("")){
 
                if (columnIndex == 6) { 
            
          if(vehicleList.get(rowIndex) instanceof Motorbike)
                temp = vehicleList.get(rowIndex).getEngine();
          else
              temp = "";
                }

      } 
         else if (keyword.equals("")){

            if (columnIndex == 8) { 

                temp = vehicleList.get(rowIndex).getConsumption();
            }
      } 
        
             else if (keyword.equals("")){
 
            if (columnIndex == 7) { 
            if(vehicleList.get(rowIndex) instanceof Car)
          
                temp = vehicleList.get(rowIndex).getModel();
            else
                temp = "";

        } 
             }
        
      
        
   
        

      return temp ;
    }

    

    
        
   
    
    

    
    
    
    // needed to show column names in JTable 
   public String getColumnName(int col) { 
      return columnNames[col]; 
   } 
   
 // public Class getColumnClass(int col) { 
   //   if (col == 2) { 
     //    return Double.class; 
      //} 
      //else { 
       //  return String.class; 
      //} 
   //} 

  
    
}


