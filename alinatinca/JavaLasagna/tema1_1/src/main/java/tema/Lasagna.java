
  public class Lasagna {
  
      public static int expectedMinutesInOven(){  
      int expectedMinutesInOven = 40;   
      return expectedMinutesInOven;
      }
    
          
      public static int remainingMinutesInOven(int minuteInCuptor) {  
        return expectedMinutesInOven() - minuteInCuptor;      
      }          
    
          
      public static int preparationTimeInMinutes(int layers){  
        return layers * 2;          
        }    
    

      public static int totalTimeInMinutes(int layers, int minute){  
        return preparationTimeInMinutes(layers) + minute;}

     }

