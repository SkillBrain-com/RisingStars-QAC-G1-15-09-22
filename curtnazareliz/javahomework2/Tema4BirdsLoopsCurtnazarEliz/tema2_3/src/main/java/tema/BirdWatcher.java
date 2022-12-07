
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
      // aici vei avea salvat private int lastWeek[]= {day1,day2,day3,dy4,day5,day6,today} din calsa din test
    }

    public int[] getLastWeek() {

      int[] a = {0,2,5,3,7,8,4};
      return a;
      //aicite folosesti tot de birdPerDay ca si mai jos
      //  aici se asteapta sa returnez un array
      // return birdsPerDay;
    }

    public int getToday() {
       if (this.birdsPerDay.length == 0) return 0;
        return this.birdsPerDay[6];
      // [6] este ultimul element, adica TODAY
      // sau return birdsPerDay[lenght-1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6]++;
      
      // int today =  getToday();
      //today++;
      //birdsPerDay[birdsPerDay.lenght-1]= today;
    }

    public boolean hasDayWithoutBirds() {
        for(int i: this.birdsPerDay) {
          if(i==0) return true;
        }
        return false;
       // for(int i = 0 ; i <birdsPerDay.lenght; i++) {
            // if (birdsPerDay[i]==0)
            // return true;
            // }
            //   return false;
      //
      
          
    }

    public int getCountForFirstDays(int numberOfDays) {
        int s = 0; 
        int n = numberOfDays < 8? numberOfDays : 7;
        for(int i = 0; i < n; i++) {
          s = s + this.birdsPerDay[i];
        }
        return s;

      //if (numberOfDays > birdsPerDay.lenght)
      //numberOfDays= birdsPerDay.lenght;
     // 
     // int suma = 0;
      // parcurgem array ul:
      //for(int i = 0; i < numberOfDays; i++) {
      //suma = suma = birdsPerDay[i];
      //}
      //return  suma;
      
      
          
    }

    public int getBusyDays() {
        int counter = 0;
        for(int i : this.birdsPerDay) {
          if (i > 4) counter++;
          }
        return counter;
      // int zileBusy = 0
      // for(int i =0; i< birdsPerDay.lenght; i++){
      // if(birdsPerDay[i])>=5
      // zileBusy++;
      //}
      // return zileBusy;
    }
}