class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distance;
    int battery;
    // TODO: define the constructor for the 'NeedForSpeed' class
    NeedForSpeed(int speed, int batteryDrain){
      this.speed = speed;
      this.batteryDrain = batteryDrain;
      this.distance = 0;
      this.battery = 100;
    }
    public boolean batteryDrained() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
      if (battery <= 0) {
        return true;
      } else {
        return false;
      }
    }

    public int distanceDriven() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
      return distance;
    }

    public void drive() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
      if (batteryDrained() == false){
      distance += speed;
      battery -= batteryDrain;}
    }

    public static NeedForSpeed nitro() {
        //throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
      return new NeedForSpeed(50, 4);
    }
}

class RaceTrack{
    // TODO: define the constructor for the 'RaceTrack' class
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        //throw new UnsupportedOperationException("Please implement the RaceTrack.carCanFinish() method");
        if ((100 / car.batteryDrain) * car.speed >= distance) {
            return true;
        } else {
            return false;
        }
    }
}

