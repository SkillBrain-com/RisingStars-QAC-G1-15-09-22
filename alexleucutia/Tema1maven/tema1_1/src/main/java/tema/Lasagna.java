
public class Lasagna {

    public static int expectedMinutesInOven(){
      int expectedMinutes = 40;
      return expectedMinutes;
    }
  
    public static int remainingMinutesInOven(int minuteInCuptor) {
      return expectedMinutesInOven()-minuteInCuptor;
  
    }
    public static int preparationTimeInMinutes(int layers){
       int preparationTime = layers * 2;
      return preparationTime;
    }
    public static int totalTimeInMinutes(int minute, int layers){
      int totalMinutes = preparationTimeInMinutes(layers) + minute;
      return totalMinutes;
    }
}
