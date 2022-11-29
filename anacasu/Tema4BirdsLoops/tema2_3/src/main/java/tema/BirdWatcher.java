import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;

    }

    public int getToday() {
        try {
            return birdsPerDay[birdsPerDay.length - 1];}
        catch (Exception e){
            return 0;
        }
    }

    public void incrementTodaysCount() {
         birdsPerDay[birdsPerDay.length - 1] ++;
//        System.out.println(getToday());
//        int today = getToday();
//        System.out.println(today++);
//        today ++;

    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0;i < birdsPerDay.length;i++)
            if (birdsPerDay[i] == 0) return true;
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > birdsPerDay.length) numberOfDays = birdsPerDay.length;
        int i = 0;
        int count = 0;
        while (i < numberOfDays)
        {
            count = count + birdsPerDay[i];
            i++;
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for (int i = 0;i < birdsPerDay.length;i++)
            if (birdsPerDay[i] >= 5)  count++;
        return count;
    }
}
