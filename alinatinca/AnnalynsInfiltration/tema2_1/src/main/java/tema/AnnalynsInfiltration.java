class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {  //este definita metoda canFastAttack care are parametrul knightIsAwake
         return !knightIsAwake;  // atacul se poate face daca cavalerul doarme
    }

  
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {  //este definita metoda canSpy care are cei 3 parametrii aferenti celor 3 personaje
      return knightIsAwake || archerIsAwake || prisonerIsAwake; // spionajul se poate face daca fie cavalerul este treaz, sau fie arcasul este treaz, sau fie prisonierul este treaz
    }

  
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {  //este definita metoda canSignalPrisoner cu cei 2 parametrii
      return !archerIsAwake && prisonerIsAwake;  // semnalul se poate genera daca arcasul doarme si prisonierul este treaz
    }


   public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) { //este definita metoda canFreePrisoner care are cei 4 parametrii aferenti celor 4 personaje
     return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && petDogIsPresent); // prisonierul poate fi eliberat daca: (cainele este prezent si arcasul nu este treaz) sau daca (prisonierul este treaz si cavalerul si arcasul dorm)
 }
}
  