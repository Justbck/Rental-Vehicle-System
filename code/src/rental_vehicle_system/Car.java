
package rental_vehicle_system;


public class Car extends Vehicle {
    
       
    protected int seats;
    protected String model;

    public Car(){
        super();
        seats = 4;
        model = "unknown";
        
        
    }
    
    public Car(int s){
        super();
        seats = s;  
    }
    
    public Car(String m){
        super();
        model = m;
    }
    
    public Car(String model,int seats, String plateNum, String make, Schedule date)
    {
        super( plateNum , make, date );
        
        this.seats = seats;
        this.model = model;
        
    }


    
    public int getSeats(){
        return seats;
    }
    
    public void setSeats(int seats ){
        this.seats = seats;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    
    @Override
    public String getType(){
        return "Car";
    }

    @Override
    public String toString(){
        return ("Type: " + getType() + " Make: " + make + ", Plate number: " + plateNum +  ", Model: " + model + ", Seats: " + seats + ", Date: " +  date.getDate());
    }

    double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    String nextLine(){
          throw new UnsupportedOperationException("Not supported yet.");
        
    }


    
}
    

