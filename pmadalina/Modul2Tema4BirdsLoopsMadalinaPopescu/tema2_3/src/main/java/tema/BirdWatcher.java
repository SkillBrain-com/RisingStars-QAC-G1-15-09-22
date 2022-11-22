
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        // throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
      return birdsPerDay;
    }

    public int getToday() {
        // throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
      if (birdsPerDay.length == 0)
        return 0;
      return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        // throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
      int today = getToday();
      today ++;
      birdsPerDay[birdsPerDay.length - 1] = today;
    }

    public boolean hasDayWithoutBirds() {
        // throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
     
      for(int i=0;i < birdsPerDay.length; i++){
        if (birdsPerDay[1] == 0)
          return true;
      }
       return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        // throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
      if (numberOfDays > birdsPerDay.length)
        numberOfDays = birdsPerDay.length;
      int suma = 0;
      for (int i = 0; i < numberOfDays; i++ ){
        suma = suma + birdsPerDay[i];
      }
      return suma;
    }

    public int getBusyDays() {
        // throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
      int zileBusy = 0;
      for(int i=0;i < birdsPerDay.length; i++){
        if (birdsPerDay[i] >= 5)
          zileBusy ++;
      } return zileBusy;
    }
}
