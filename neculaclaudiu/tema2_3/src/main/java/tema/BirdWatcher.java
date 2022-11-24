class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
      this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
    // throw new UnsupportedOperationException("Please implement the
    // BirdCount.getLastWeek() method");
    return birdsPerDay;

  }

  public int getToday() {
    // throw new UnsupportedOperationException("Please implement the
    // BirdCount.getToday() method");
    if(birdsPerDay.length == 0){
      return 0;}
    return birdsPerDay[birdsPerDay.length-1];
  }

  public void incrementTodaysCount() {
    // throw new UnsupportedOperationException("Please implement the
    // BirdCount.incrementTodaysCount() method");
    int p = getToday();
    p++;
    birdsPerDay[birdsPerDay.length-1] = p;
  }

  public boolean hasDayWithoutBirds() {
    // throw new UnsupportedOperationException("Please implement the
    // BirdCount.hasDayWithoutBirds() method");
    for (int i = 0; i < birdsPerDay.length; i++) {
      if (birdsPerDay[i] == 0) {
        return true;}
    }
    return false;
  }
  

  public int getCountForFirstDays(int numberOfDays) {
    // throw new UnsupportedOperationException("Please implement the
    // BirdCount.getCountForFirstDays() method");
    if(numberOfDays > birdsPerDay.length)
      numberOfDays = birdsPerDay.length;
    int birds = 0;
    for (int i = 0; i < numberOfDays; i++) {
      birds = birds + birdsPerDay[i];
    }
    return birds;
  }

  public int getBusyDays() {
    // throw new UnsupportedOperationException("Please implement the
    // BirdCount.getBusyDays() method");
    int busydays = 0;
    for (int i = 0; i < birdsPerDay.length; i++) {
      if (birdsPerDay[i] >= 5) {
        busydays++;
      }
    }
    return busydays;
  }
}
