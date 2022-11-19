class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class

  // attributes
    int speed;             //viteza
    int batteryDrain;      // baterie descarcata
    int distanceDriven;    //nr de metrii parcursi
    int remainingBattery;    //consumul bateriei


  NeedForSpeed(int speed,int batteryDrain){       //construirea constructorului NeedForSpeed care accepta viteza si bateria descarcata, ca parametrii
    this.speed = speed;                           //predefinim atributele si le atribuim valori
    this.batteryDrain = batteryDrain;
    this.distanceDriven = 0;
    this.remainingBattery = 100;
    
  }
    
    
  // methods
    public boolean batteryDrained(){  
      if (remainingBattery < batteryDrain){        //raman fara baterie atunci cand bateria este sub procentul de consum al bateriei
        return true;
      } else {                                    //altfel am baterie
        return false;                            //va returna false pt ca am baterie
      }
    }    
      

    public int distanceDriven() {      
      return this.distanceDriven;        //am returnat 
    }

  
    public void drive() {           
       if (batteryDrained() == false){           //apelez metoda am baterie (creata mai sus)
         this.distanceDriven = distanceDriven + speed;     // pt a actualiza aici distanceDriven si remainingBattery
        this.remainingBattery = remainingBattery - batteryDrain; 
       }
      
    
    }

    
    public static NeedForSpeed nitro() {        //este definita metoda statica nitro care are numele clasei NeedForSpeed
      return new NeedForSpeed (50, 4);          // returneaza aici parametrii distanta 50 si  consumul 4, conform cerintei
      
    }
}



class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class

  
  // atribute
  private int distance;                    //definim atributul privat distance

  
  // constructor
  RaceTrack(int distance){                 //cream constructorul RaceTrack care accepta singurul parametru distance
    this.distance = distance;              //predefinim atributul distance
  }      
      
        
      // methods    
     public boolean carCanFinish(NeedForSpeed car){   //definim metoda public de tip boolean numita carCanFinish care contine toate atributele si metodele din clasa NeedForSpeed pentru masina   
     int distanceThatBeDrive = 100 / car.batteryDrain;         // definim variabila distanceThatBeDrive care este egala cu remainingBattery (100) / la batteryDrain masinii
     int distanceDriven = distanceThatBeDrive * car.speed;    //definim variabila distanceDriven care este egala cu variabila de mai sus * cu viteza masinii
  
      if (distanceDriven >= this.distance){                  //daca distanta parcursa este mai mare sau egala cu distanta cursei atunci masina va termina cursa
        return true;
      } else {                      //altfel
        return false;               //nu o va termina
      }
         
       
     }

  
}

  
        
  


