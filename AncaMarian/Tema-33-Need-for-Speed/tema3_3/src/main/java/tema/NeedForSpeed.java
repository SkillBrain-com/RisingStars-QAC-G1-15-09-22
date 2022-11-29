class NeedForSpeed {
//     TODO: define the constructor for the 'NeedForSpeed' class
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int remainingBattery;

    public NeedForSpeed (int speed, int batteryDrain){
         this.speed = speed;
         this.batteryDrain = batteryDrain;
         this.remainingBattery = 100;
         this.distanceDriven = 0;
     }

    public boolean batteryDrained() {
        if (remainingBattery < batteryDrain) {return true;}
        else {return false;}
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven = distanceDriven + speed;
            remainingBattery = remainingBattery - batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50, 4);
        return car; //sau: return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
//        while (true){ //VARIANTA 1
//            car.drive();
//            if (car.distanceDriven() >= distance) {return true;}
//            if (car.batteryDrained()) {return false;}
//        }

        while (!car.batteryDrained()) { //VARIANTA 2
            car.drive();
        }
        if (car.distanceDriven() >= distance) {return true;}
        else {return false;}
        }
    }



