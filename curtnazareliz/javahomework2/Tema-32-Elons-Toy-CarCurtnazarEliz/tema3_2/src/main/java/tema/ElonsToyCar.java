public class ElonsToyCar {

  private int distanceDriven;
	private int batteryPercentage = 100;
  
  //private int distance;
  //int distanceDriven;
  //private int battery;
  //ElonsToyCar(){
  //this.distance = 20;
  //this.battery = 100;
  //this.distanceDriven = 0;
  //}
  
    public static ElonsToyCar buy() {
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method")
      return new ElonsToyCar();
      // ElonsToyCar car = new ElonsToyCar;
      // return car;
      
    }

    public String distanceDisplay() {
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
     return String.format("Driven %d meters", distanceDriven);
      // return "Driven " + distanceDriven +" meters";
    }

    public String batteryDisplay() {
      if (this.batteryPercentage == 0) {
    		return "Battery empty";
    	}
    	return String.format("Battery at %d%%", batteryPercentage);
    }

  // if(baterry<=0) {
  // return "Battery empty";

  //}
   // return "Baterry at " + battery + '%';
  }

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");

      if(this.batteryPercentage != 0) {
    		this.distanceDriven += 20;
            this.batteryPercentage--;
    	}   
      // if(battery !=0) {
      //this.distanceDriven= distanceDriven + distance;
      //battery--;
     // }
    }
}
