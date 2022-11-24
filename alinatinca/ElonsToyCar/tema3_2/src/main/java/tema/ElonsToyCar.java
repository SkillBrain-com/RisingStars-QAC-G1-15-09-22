import java.awt.Insets;

public class ElonsToyCar {

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

  // methods
  public static ElonsToyCar buy() {
    // throw new UnsupportedOperationException("Please implement the (static)
    // RemoteControlCar.buy() method");
    ElonsToyCar car = new ElonsToyCar(); // construiesc obiectul ElonsToyCar
    return car; // care imi va da o masina noua
  }

  public String distanceDisplay() {
    // throw new UnsupportedOperationException("Please implement the (static)
    // RemoteControlCar.distanceDisplay() method");
    return "Driven " + distanceDriven + " meters"; // returnez distanta afisata pe led ca 'Driven Meters'
  }

  public String batteryDisplay() {
    // throw new UnsupportedOperationException("Please implement the (static)
    // RemoteControlCar.batteryDisplay() method");
    if (battery <= 0) { // daca bateria este pe 0
      return "Battery empty"; // afiseaza baterie goala
    }
    return "Battery at " + battery + "%"; // altfel afiseaza bateria ramasa pe led, astfel: "Battery at <PERCENTAGE>%"
  }

  public void drive() {
    if (battery != 0) { // daca am baterie = prevenire (p.6)
      this.distanceDriven = distanceDriven + distance; // actualizez distanta parcursa de masina tinand cont de distanta
                                                       // data cf cerintei
      battery--; // dar in acelasi timp, bateria va pierde un procent din ea (de fiecare data
                 // cand masina merge cu telecomanda)
    }

  }
}