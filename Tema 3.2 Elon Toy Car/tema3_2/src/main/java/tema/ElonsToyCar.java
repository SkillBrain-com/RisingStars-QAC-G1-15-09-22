public class ElonsToyCar {
    

       private int distance;
      int distanceDriven;
      private int battery;

      ElonsToyCar(){
        
        this.distance = 20;
        this.battery = 100;
        this.distanceDriven = 0;
      }
        public static ElonsToyCar buy(){   
        final ElonsToyCar car = new ElonsToyCar();
        return car;
        }
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");


    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
      }  
      // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
    
  public String batteryDisplay() {
       if (battery <= 0){
         return "Battery empty";
       }
      return "Battery at "+ battery + "%";
      }
      // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
    
    public void drive() {
       if (battery !=0)
         this.distanceDriven = distanceDriven + distance ;
      battery --;
          }
}
      // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");


