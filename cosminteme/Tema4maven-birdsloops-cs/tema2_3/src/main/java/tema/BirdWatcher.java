
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone(); // aici vei avea salvat private int lastWeek[] = {DAY1, DAY2, DAY3, DAY4, DAY5, DAY6, TODAY}; din clasa de test
      
      
    }

    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
     //BirdWatcher.getLastWeek(); // trebuie sa afisezi numarul de pasari pentru fiecare zi,acesta fiind salvat in variabila de mai sus birds per day
      return birdsPerDay;
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
      //int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};// nu e nevoie,il ai deja in birds per day
    // BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
      if (birdsPerDay.length == 0) 
        return 0;
      return birdsPerDay[birdsPerDay.length - 1];
      

      

      
    }

    public void incrementTodaysCount() {
      // trebuie sa incrementezi elementul corespunzator today din variabila de clasa d emai sus ,birdperday
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
     // int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};
      //BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
     // birdCount.incrementTodaysCount();
     // birdCount.getToday;
      //getToday();
      int today = getToday();
      today++;
      birdsPerDay[birdsPerDay.length - 1] = today;
      

      
    }

    public boolean hasDayWithoutBirds() {
      //trebuie parcurs birdsperday si vazut daca cumva apare vreo zi fara pasari,adica sa fie 0 
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
     // int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
      //BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
      //birdCount.hasDayWithoutBirds();
    
      for (int i = 0; i < birdsPerDay.length; i++) {
        if (birdsPerDay[i] == 0)
          return true;
     
      }
      
      return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
// trebuie sa aduni primele numberOfdays elemente din birdsperday
      //int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
     // BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
     // birdCount.getCountForFirstDays(4);
      if (numberOfDays > birdsPerDay.length)
        numberOfDays = birdsPerDay.length;
      int suma = 0;
      for (int i = 0; i < numberOfDays; i++) {
        suma = suma + birdsPerDay[i];
        
      }
      return suma;
      
    }
  

    public int getBusyDays() {
      
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    // trebuie sa vezi cate zile din birderday au mai mult de 5 pasari
      //int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
      //BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
      //birdCount.getBusyDays();
      int zilebusy = 0;
      for (int i = 0; i < birdsPerDay.length; i++) {
        if (birdsPerDay[i] >= 5)
          zilebusy ++;
        
          
      }
      return zilebusy;
    }
}
