class NeedForSpeed {
        private int speed;
        private int batteryDrain;
        private int distDriven ;
        private int batteryLife;

    NeedForSpeed(int speed,int batteryDrain) {
        this.speed=speed;
        this.batteryDrain=batteryDrain;
        this.distDriven = 0;
        this.batteryLife = 100;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getDistDriven() {
        return distDriven;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public boolean batteryDrained() {
        return (batteryLife <= 0) ;
    }

    public int distanceDriven() {
        return this.distDriven;
    }

    public void drive() {
        if (!batteryDrained())
        {distDriven += speed;
        batteryLife -= batteryDrain;}
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {

    private int distance;
    RaceTrack(int distance)
    {
        this.distance=distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        int distanceThatCanBeDrive = 100 / car.getBatteryDrain();
        if (distanceThatCanBeDrive * car.getSpeed() >= this.distance)
            return true;
        else return false;
    }
}
