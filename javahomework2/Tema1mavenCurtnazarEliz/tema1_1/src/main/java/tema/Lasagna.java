public class Lasagna {

  public static int expectedMinutesInOven() {

    // int expectedMinutesInOven = 40;//are acelasi nume cu metoda si nu e bine
    return 40;
  }

  public static int remainingMinutesInOven(int minuteInCuptor) {

    return expectedMinutesInOven() - minuteInCuptor;//aici apelezi metoda de mai sus ,dar se apeleaza cu ()

  }

  public static int preparationTimeInMinutes(int layers) {

    return layers * 2;

  }

  public static int totalTimeInMinutes(int minute, int layers) {

    return preparationTimeInMinutes(layers) + minute;

  }

}
