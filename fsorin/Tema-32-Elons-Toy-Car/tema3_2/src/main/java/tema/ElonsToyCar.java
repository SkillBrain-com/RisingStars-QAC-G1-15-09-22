import static java.lang.String.format;
public class ElonsToyCar {
    private int distanceDriven = 0;
    private int batteryCapacity = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        return format("Driven %d meters", distanceDriven);
    }
    public String batteryDisplay() {
       if (batteryCapacity > 0) {
        return format("Battery at %d%%", batteryCapacity);
       }
       return "Battery empty";
    }
    public void drive() {
        if (batteryCapacity > 0) {
            distanceDriven += 20;
            batteryCapacity--;
        }
    }
}