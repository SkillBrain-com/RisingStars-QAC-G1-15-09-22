
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       // throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
       return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
       // throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
      return birdsPerDay.length > 0 ? birdsPerDay[birdsPerDay.length - 1] : 0;
    }

    public void incrementTodaysCount() {
       // throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
      birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
      int i = 0;
        while(i < birdsPerDay.length) {
          if(birdsPerDay[i] == 0) {
                return true; 
            } else {
                i++;
    }
        }
       return false;
    }
      

    public int getCountForFirstDays(int numberOfDays) {
       // throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
     int total = 0;
      
      int i = 0;
       while(i < numberOfDays && i < birdsPerDay.length) {
          total += birdsPerDay[i];
            i++;
            } 
      return total;
        }
  
      
    

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
      int total = 0;
      int i = 0;
       while(i < birdsPerDay.length) {
            if(birdsPerDay[i] >= 5) {
               total++;
    }
         i++;
}
      return total;
        }
}
  
