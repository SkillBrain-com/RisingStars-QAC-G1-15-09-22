class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
      if (knightIsAwake == false) {
       return !knightIsAwake;
      } else {
        return false;
      }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
      if(knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true){
      return knightIsAwake || archerIsAwake || prisonerIsAwake;
      } else {
        return false;
      }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
      if(archerIsAwake == false && prisonerIsAwake == true){
       return !archerIsAwake && prisonerIsAwake;
      } else {
        return false;
      }
    }

 public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
   if((petDogIsPresent == true && archerIsAwake == false) || (petDogIsPresent == false && prisonerIsAwake == true && archerIsAwake == false && knightIsAwake == false)){
        return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && petDogIsPresent);
   } else {
        return false;
    }
}
}