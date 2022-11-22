class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class

  
  //atribute
  int speed;
  int batteryDrain;
  int distanceDriven;
  int batteryStatus;
  
  //constructor
  
  NeedForSpeed(final int speed, final int batteryDrain){
    this.speed = speed;
    this.batteryDrain = batteryDrain;
    this.distanceDriven = 0;
    this.batteryStatus = 100;
  }
  
    public boolean batteryDrained() {
       // throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
      if (batteryStatus < batteryDrain){
        return true;
    } else {
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
        this.batteryStatus = batteryStatus - batteryDrain;
     }
    }

    public static NeedForSpeed nitro() {
        //throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
      return new NeedForSpeed (50,4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
   
    private final int distance;
    RaceTrack(final int distance){
    this.distance = distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
      //  throw new UnsupportedOperationException("Please implement the RaceTrack.carCanFinish() method");
      final int distanceThatBeDriven = 100 / car.batteryDrain;
      final int distanceDriven = distanceThatBeDriven * car.speed;
      if (distanceDriven >= this.distance){
        return true;
      }else{
        return false;
      }
    }
}
