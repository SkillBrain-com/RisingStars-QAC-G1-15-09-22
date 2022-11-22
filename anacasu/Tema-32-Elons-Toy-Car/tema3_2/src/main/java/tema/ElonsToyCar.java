public class ElonsToyCar {
//    private int distance = 0;
//    private int battery = 100;
// attributes;
    private int distance;
    int distanceDriven; // = drivenMeters
    private int battery; // =batteryPercentage
    // private int batteryEmpty; //=0

    // constructor
    ElonsToyCar() {
        this.distance = 20;
        this.battery = 100;
        this.distanceDriven = 0;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return ("Driven %d meters".formatted(distance));
    }

    public String batteryDisplay() {
        if (battery == 0) return("Battery empty");
        else return ("Battery at " + battery + "%") ;
    }

    public void drive() {
        if (battery >0)
        {distance +=20;
        battery--;}
    }
}
