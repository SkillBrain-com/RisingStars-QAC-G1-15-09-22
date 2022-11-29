  class NeedForSpeed {
   int speed;
   int batteryDrain;
   int distanceDriven;
   int remainingBattery;

  NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
    this.distanceDriven = 0;
    this.remainingBattery = 100;
  }

    public boolean batteryDrained() {
      if (remainingBattery < batteryDrain) {
        return true;
      }else{
        return false;
      }
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
    }

    public int distanceDriven() {
      return this.distanceDriven;
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
    }

    public void drive() {
      if (batteryDrained() == false) {
        
      
      this.distanceDriven = distanceDriven + speed;
      this.remainingBattery = remainingBattery - batteryDrain;
      } 
        
    
      
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
    }

    public static NeedForSpeed nitro() {
      return new NeedForSpeed (50, 4);
        //throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private int distance;
    RaceTrack(int distance) {

      this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
      int distanceThatBeDrive = 100 / car.batteryDrain;
      int distanceDriven = distanceThatBeDrive * car.speed;
      if (distanceDriven >= this.distance) {
        return true;
      }else{
        return false;
      }
        //throw new UnsupportedOperationException("Please implement the RaceTrack.carCanFinish() method");
    }
}
