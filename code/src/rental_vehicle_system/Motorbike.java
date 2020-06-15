
package rental_vehicle_system;


public class Motorbike extends Vehicle {
    

    protected String engine;
    protected double consumption;
    
    public Motorbike(){
        super();
        consumption = 4;
        engine = "unknown";
        
    }
    
    public Motorbike(int c){
        super();
        consumption = c;
    }
    
    public Motorbike(String e){
        super();
        engine = e;
    }
    
    public Motorbike(String engine,int consumption,String plateNum, String make, Schedule date)
    {
        super(plateNum,make,date);
        
        this.consumption = consumption;
        this.engine = engine;
        
        
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

    @Override
    public String getType(){
        return "Motorbike";
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
    

    @Override
    public String toString(){
        return "Type: " + getType() + " Make: " + make + ", Plate number: " + plateNum + "Consumption: " + consumption + ", Date: " +  date.getDate();
    }


    
}
