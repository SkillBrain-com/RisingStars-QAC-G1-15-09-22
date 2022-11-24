
class BirdWatcher {
    private final int[] birdsPerDay;  

    public BirdWatcher(int[] birdsPerDay) {  
        this.birdsPerDay = birdsPerDay.clone(); 
    }

    public int[] getLastWeek() { 
      return birdsPerDay; 
    }

  
    public int getToday() { 
      if (birdsPerDay.length == 0) 
        return 0;
      return birdsPerDay[birdsPerDay.length - 1];
    }

  
    public void incrementTodaysCount() {
      int today = getToday();  
      today ++;          
      birdsPerDay[birdsPerDay.length-1] = today;     
    }

  
    public boolean hasDayWithoutBirds() {
      for (int i = 0; i < birdsPerDay.length; i++) {  
        if (birdsPerDay[i] == 0)   
          return true;      
      }
      return false;        
    }

  
    public int getCountForFirstDays(int numberOfDays) {
       
    if (numberOfDays > birdsPerDay.length)   
      numberOfDays = birdsPerDay.length;     
    int suma = 0; 
    for (int i = 0; i < numberOfDays; i++) { 
      suma = suma + birdsPerDay[i];
    }
    return suma;
    }

  
    public int getBusyDays() {
      int zileBusy = 0;
      for (int i = 0; i < birdsPerDay.length; i++){
        if (birdsPerDay[i] >=5)
          zileBusy++;
        
      }
      return zileBusy;
    }
}
