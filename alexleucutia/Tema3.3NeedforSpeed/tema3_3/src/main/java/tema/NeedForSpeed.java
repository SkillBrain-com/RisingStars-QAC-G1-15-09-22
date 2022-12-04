class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
  int speed;
  int batteryDrain;
  int distanceDriven;
  int remainingBattery;

  NeedForSpeed(int speed,int batteryDrain){
  this.speed = speed;
  this.batteryDrain = batteryDrain;
  this.distanceDriven = 0;
  this.remainingBattery = 100;
  }
  
    public boolean batteryDrained(){
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
      if (remainingBattery < batteryDrain){
        return true;
      }else{
        return false;
      }
    }

    public int distanceDriven() {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
      return this.distanceDriven;
    }

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
      if (batteryDrained() == false){
        this.distanceDriven = distanceDriven + speed;
        this.remainingBattery = remainingBattery - batteryDrain;
        
      }
    }

    public static NeedForSpeed nitro() {
        // throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
      return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
private int distance;

  RaceTrack(int distance){
    this.distance = distance;
  }
  
//   public RaceTrack raceTrack(distance)
// {
//     this.distance = distance;

    public boolean carCanFinish(final NeedForSpeed car) {
        // throw new UnsupportedOperationException("Please implement the RaceTrack.carCanFinish() method");
     int distanceThatBeDrive = 100/car.batteryDrain;
     int distanceDriven = distanceThatBeDrive*car.speed;

      if(distanceDriven >= this.distance){
        return true;
      }else{
        return false;
      }
    
      
    }
}
