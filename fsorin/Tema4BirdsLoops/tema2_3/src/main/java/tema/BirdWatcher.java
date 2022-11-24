import java.util.ArrayList;
import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int[] getLastWeek() {
        return this.birdsPerDay;
    }
    public int getToday() {
    	if(this.birdsPerDay.length > 0) {
    		return this.birdsPerDay[this.birdsPerDay.length - 1];
    	} else {
    		return 0;
    	}
    }
    public void incrementTodaysCount() {
    	this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }
    public boolean hasDayWithoutBirds() {
    	 for(int i = 0; i < this.birdsPerDay.length; i++) {
         	if(this.birdsPerDay[i] == 0) return true;
         }
    	 return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
    	if(numberOfDays > 7) numberOfDays = 7;
        int sum = 0;
        for(int i = 0; i < numberOfDays; i++) {
        	sum += this.birdsPerDay[i];
        }
        return sum;
    }
    public int getBusyDays() {
        int busyDays = 0;
        for(int i = 0; i < this.birdsPerDay.length; i++) {
        	if(this.birdsPerDay[i] >= 5) busyDays++;
        }
        return busyDays;
    }
}