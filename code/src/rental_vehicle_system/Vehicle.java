
package rental_vehicle_system;


public abstract class Vehicle implements Comparable <Vehicle>{
    
    protected String plateNum;
    protected String make;
    protected Schedule date;
    protected int seats;
    protected String model;
    protected String engine;
    protected int consumption;
    
     public Vehicle(){
        
        plateNum = "";
        make = " ";
        
    }
     
     public void setDate(Schedule date){
         this.date = date;
     }
     
     public Schedule getDate(){
         return date;
     }
    
    public Vehicle(String pN){
        plateNum = pN;
        make = "honda";
    }
    
    
    public Vehicle(String plateNum, String make,Schedule date) {
        this.plateNum = plateNum;
        this.make = make;
        this.date = date;

    }
    
    
    public String getMake(){
        return make;
    }
    
    public void setMake(){
        this.make = make;
    }
    
    public String getPlateNum(){
        return plateNum;
    }
    
    public void setPlateNum(){
        this.plateNum = plateNum;
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
    
        public String getEngine(){
        return engine;
    }
    
    public void setEngine(){
        this.engine = engine;
    }
    
    public double getConsumption(){
        return consumption;
    }
    
    public void setConsumption(int consumption){
        this.consumption = consumption;
    }
    
    
    ///abstract methods

    public abstract String getType();

    @Override
    public String toString(){
        return ("Make: " + make + " , Plate number: " + plateNum + ", Date:" + date.getDate() );
    }
    
    
    @Override
    public int compareTo(Vehicle veh) {
          return (this.getMake().compareTo(veh.getMake()) );
    }

    
    
    
}
