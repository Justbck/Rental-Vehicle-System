
package rental_vehicle_system;




public class Schedule{
    
    private int pickUpYear;
    private int pickUpMonth;
    private int pickUpDay;
    

    
    public Schedule(int pickUpDay,int pickUpMonth, int pickUpYear){
       if((pickUpYear>2000)&&(pickUpYear<2099)&&(pickUpMonth>0)&&(pickUpMonth<13)&&(pickUpDay > 0)&&(pickUpDay<32)){
           this.pickUpDay = pickUpDay;
           this.pickUpMonth = pickUpMonth;
           this.pickUpYear = pickUpYear;
       }
       else{
           System.out.println("Not correct date");
       }
    }
    
    public void setpickUpYear(int pickUpYear){
        if ((pickUpYear>=2000)&&(pickUpYear<2099)){
            this.pickUpYear = pickUpYear;
        }
        else{
            System.out.println("Not correct range");
            
        }
    }
    
    public void setpickUpMonth(int pickUpMonth){
        if((pickUpMonth>0)&&(pickUpMonth<13)){
            this.pickUpMonth = pickUpMonth;
        }
        else{
            System.out.println("Not correct range");
        }
    }
    
    
    public void setpickUpDay(int pickUpDay){
        if((pickUpDay>0)&&(pickUpDay<32)){
            this.pickUpDay = pickUpDay;
        }
        else{
            System.out.println("Not correct range");
        }
    }
    
    public int getpickUpYear(){
        return pickUpYear;
    }
    
    public int getpickUpMonth(){
        return pickUpMonth;
    }
    
    public int getpickUpDay(){
        return pickUpDay;
    }
    
    public String getDate(){
        String dateStr = String.format("%02d/%02d/%04d", pickUpDay, pickUpMonth, pickUpYear);
        return dateStr;   
    }
    
    public String toString(){
        String dateStr = String.format("%02d/%02d/%04d", pickUpDay, pickUpMonth, pickUpYear);
        return dateStr;
    }
   
}
    
   
    
    //represent time slot when a vehicle has been booked
    // pick-up date 
    // drop-off date
    
    //	(to represen the date you can use either the
    // class provided during tutorials or you can
    // use any java API)

