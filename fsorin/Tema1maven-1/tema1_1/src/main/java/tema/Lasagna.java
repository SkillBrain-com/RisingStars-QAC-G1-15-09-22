
public class Lasagna {

  private static int MINUTES_IN_OVEN = 40;

    public static int expectedMinutesInOven(){
      return MINUTES_IN_OVEN;
      
    }


    public static int remainingMinutesInOven(int minuteInCuptor) {
      return MINUTES_IN_OVEN - minuteInCuptor;
      
    }



    public static int preparationTimeInMinutes(int layers){
      return 2 * layers;
       
    }



    public static int totalTimeInMinutes(int minute, int layers){
      return minute + preparationTimeInMinutes(layers);
     
    }
}
