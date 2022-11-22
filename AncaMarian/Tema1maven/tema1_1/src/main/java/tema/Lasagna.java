
public class Lasagna {

    public static int expectedMinutesInOven(){
        return 40;
    }


    public static int remainingMinutesInOven(int minuteInCuptor) {
    return 40 - expectedMinutesInOven();
    }



    public static int preparationTimeInMinutes(int layers){
     return layers * 2;
    }



    public static int totalTimeInMinutes(int minute, int layers) {
        return (minute + preparationTimeInMinutes());

    }
}
