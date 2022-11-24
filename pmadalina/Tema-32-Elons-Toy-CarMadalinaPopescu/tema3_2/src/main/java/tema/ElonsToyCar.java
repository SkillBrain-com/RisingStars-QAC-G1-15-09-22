

public class ElonsToyCar {

  private int distance;
  int distanceDriver;
  private int battery;

  ElonsToyCar(){
    this.distance = 20;
    this.battery = 100;
    this.distanceDriver = 0;
      
  }
    public static ElonsToyCar buy() {
    //     throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
      final ElonsToyCar car = new ElonsToyCar();
       return car;
    }

    public String distanceDisplay() {
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
      return "Driven " + distanceDriver + " meters";
    }

    public String batteryDisplay() {
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
      if (battery <=0){
        return "Battery empty";
      }
      return "Battery at "+ battery + "%";
     }

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
      if (battery!=0){
        this.distanceDriver = distanceDriver + distance;
        battery --;
      }
        
    }
}
// 	public int getDistance() {
// 		return distance;
// 	}
// 	public void setDistance(final int distance) {
// 		this.distance = distance;
// 	}
// 	public int getDistanceDriver() {
// 		return distanceDriver;
// 	}
// 	public void setDistanceDriver(final int distanceDriver) {
// 		this.distanceDriver = distanceDriver;
// 	}
// 	public int getBattery() {
// 		return battery;
// 	}
// 	public void setBattery(final int battery) {
// 		this.battery = battery;
// 	}
// }
