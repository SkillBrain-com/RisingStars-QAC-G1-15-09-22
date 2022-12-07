class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distanceDriven;
    int batteryPercentage;
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }
    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }
    public int distanceDriven() {
        return this.distanceDriven;
    }
    public void drive() {
        if(!batteryDrained()) {
            this.distanceDriven += speed;
            this.batteryPercentage -= batteryDrain;
        }
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
class RaceTrack {
    int distance;
    public RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        NeedForSpeed hold = car;
        while(!hold.batteryDrained()) hold.drive();
        return hold.distanceDriven() >= distance;
    }
}