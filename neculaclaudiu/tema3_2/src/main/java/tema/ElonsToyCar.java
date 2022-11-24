public class ElonsToyCar {
    int meters = 0;
    int battery = 100;
    public static ElonsToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
      return new ElonsToyCar();
    }

    public String distanceDisplay() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
      if (meters >= 2000) {
        return "Driven 2000 meters";
      } else {
      return "Driven " + meters + " meters";
      }
    }

    public String batteryDisplay() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
      if (battery <= 0) {
      return "Battery empty";
      } else {
        return "Battery at " + battery +"%";
      }
    }

    public void drive() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
      meters += 20;
      battery -= 1;
    }
}
