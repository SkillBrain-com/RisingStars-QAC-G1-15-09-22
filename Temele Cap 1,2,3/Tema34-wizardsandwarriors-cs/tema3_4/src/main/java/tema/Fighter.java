abstract class Fighter {

    boolean isVulnerable() {
       {
            return false;
        }
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
         return "Fighter is a Warrior";
    }
    private boolean isSpellPrepared = false;

    @Override
    int damagePoints(Fighter wizard) {
         return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    int spells = 0;
  
    @Override
    public String toString() {
      return "Fighter is a Wizard";
    }
  
    @Override
    boolean isVulnerable() {
        return spells == 0;
    }

    @Override
    int damagePoints(Fighter warrior) {
      if (spells == 0) {
        return 3;
      }
        spells -= 1;
      return 12;  
            
    }

    void prepareSpell() {
        spells += 1;
    }

}