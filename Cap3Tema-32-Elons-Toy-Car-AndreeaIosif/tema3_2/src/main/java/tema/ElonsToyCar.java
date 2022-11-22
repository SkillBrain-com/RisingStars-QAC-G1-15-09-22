import java.awt.Insets;

public class ElonsToyCar {

   private int distance;
   int distanceDriven;
   private int battery;

  ElonsToyCar(){
    this.distance = 20;
    this.battery = 100;
    this.distanceDriven = 0;
  }
  
    public static ElonsToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
      ElonsToyCar car = new ElonsToyCar();
       return car;
    }

    public String distanceDisplay() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
       return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
       if (battery <= 0) {
            return "Battery empty";
        }
        return "Battery at " + battery + '%';
    }

    public void drive() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
       if (battery != 0) 
      this.distanceDriven = distanceDriven + distance;
      battery -- ;
        
    }
}
