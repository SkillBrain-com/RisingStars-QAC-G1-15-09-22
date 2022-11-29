public class ElonsToyCar {
  private int distance;
  private int battery;

  public ElonsToyCar(){
    this.distance = 0;
  this.battery = 100;
    
  }
    public static ElonsToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
      ElonsToyCar car = new ElonsToyCar();
      return car;
      
    }

    public String distanceDisplay() {
      // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
      return String.format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
      //  throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
      if(battery==0){
        return "Battery empty";
      
    }
      return String.format("Battery at %d%%",this.battery);
    }
      

    public void drive() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
      if(battery == 0){
        return;
      }
        this.battery-=1;
        this.distance +=20;
      
      }
    }

