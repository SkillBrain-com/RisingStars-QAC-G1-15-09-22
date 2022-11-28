class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
private int speed = 0;
  private int batteryDrain = 5;
  private int distanceDriven = 0;
  private int remainingBattery = 100;


  public NeedForSpeed(int speed, int batteryDrain){
    this.speed = speed;
this.batteryDrain = batteryDrain;
    

  }
  
    public boolean batteryDrained() {

      if(this.remainingBattery < this.batteryDrain){
        return true;
      }
      else {
        return false;
      }
       // throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
    }

    public int distanceDriven() {
      return this.distanceDriven;
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
    }

    public void drive() {
if(!batteryDrained()){
  this.distanceDriven = this.distanceDriven + this.speed;
  this.remainingBattery = this.remainingBattery - this.batteryDrain;
}
      
      //  throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
    }

    public static NeedForSpeed nitro() {
  NeedForSpeed car = new NeedForSpeed(50,4);
      return car;
      
       // throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
private int distance = 800;

public RaceTrack(int distance){
  this.distance = distance;
}
  
    public boolean carCanFinish(NeedForSpeed car) {

while(!car.batteryDrained()){
  car.drive();
}
if(car.distanceDriven() >= this.distance){
  return true;
}
else {
  return false;
}



      
       // throw new UnsupportedOperationException("Please implement the RaceTrack.carCanFinish() method");
    }
}
