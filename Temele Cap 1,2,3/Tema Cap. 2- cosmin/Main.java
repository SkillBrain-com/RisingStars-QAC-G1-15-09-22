import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
  
class Main {
  public static void main(String[] args) {
    //cerinta nr.1 **********
    System.out.println("Introduceti un numar: ");
    Scanner scan = new Scanner(System.in);
    int numar = scan.nextInt();
    System.out.println("Numarul citit de la tastatura este: " + numar);

    int min = 1;
    int max = 100;
    double numarRandom = Math.random()*(max-min+1);
    System.out.println("Numarul random este " + numarRandom);

    if (numar < numarRandom)
      System.out.println("Numarul introdus este mai mic decat " + numarRandom);

    //cerinta nr.2 **********
    System.out.println("Introduceti primul numar: ");
    System.out.println("Introduceti al doilea numar: ");
    System.out.println("Introduceti un caracter: ");
    Scanner scanare = new Scanner(System.in);
    int numar1 = scanare.nextInt();
    int numar2 = scanare.nextInt();
    char caracter = scanare.next().charAt(0);
    //System.out.println("Numarul citit de la tastatura1 este: " + numar1);
    //System.out.println("Numarul citit de la tastatura2 este: " + numar2);
    //System.out.println("Caracterul citit de la tastatura este: " + caracter);
    switch (caracter) {

      case 'a': {
        int adunare = numar1 + numar2;
          
        System.out.println("a este: " + adunare);
        break;
      }
      case 's': {
        int scadere = numar1 - numar2;
        System.out.println("s este: " + scadere);
        break;
      }
      case 'i': {
        int inmultire = numar1 * numar2;
        System.out.println("i este: " + inmultire);
        break;
      }
      case 'p': {
        double impartire = numar1 / numar2;
        System.out.println("p este: " + impartire);
        break;
      }
      case 'm': {
        double modul = numar1 % numar2;
        System.out.println("m este: " + modul);
        break;
      }
      default: {
        System.out.println("Eroare!");
      }
    }

    // cerinta nr.3 **********
    
    String[][] douadimensiuni = new String[3][5];
    douadimensiuni[0][0] = "concurs";
    douadimensiuni[0][1] = "examen";
    douadimensiuni[0][2] = "nota";
    douadimensiuni[0][3] = "catalog";
    douadimensiuni[0][4] = "clasa";
    douadimensiuni[2][0] = "scoala";
    douadimensiuni[2][1] = "facultate";
    douadimensiuni[2][2] = "master";
    douadimensiuni[2][3] = "ore";
    douadimensiuni[2][4] = "pauza";
    //{}
    System.out.println(douadimensiuni[0][0]);
    System.out.println(douadimensiuni[0][1]);
    System.out.println(douadimensiuni[2][3]);
    System.out.println(douadimensiuni[2][4]);

    // cerinta nr.4 **********

    //char[] caractere = new char[5];
    //caractere[0] = 'a';
    //caractere[1] = 'b';
    //caractere[2] = 'c';
    //caractere[3] = 'd';
    //caractere[4] = 'f';
    char caractere[] = {'a', 'b', 'c', 'd', 'f'};
    for (int i = 0; i < caractere.length; i += 2) {
      
      System.out.println("Caracterele afisate din 2 in 2 sunt: " + caractere[i]);
    }

    // cerinta nr.5 **********

    double[] doubleArray = new double[4];
    doubleArray[0] = 2;
    doubleArray[1] = 3;
    doubleArray[2] = 4.5;
    doubleArray[3] = 7;
      
    for (int i = 0; i < doubleArray.length; i++ ) {
      if (doubleArray[i] == 4.5)
        System.out.println(" Afisati pe ecran valoarea " + doubleArray[i]);
      else if ( doubleArray[i] > 5)
        System.out.println(" Element peste 5: " + doubleArray[i]);
    }

    // cerinta nr.6 **********
    
    String arrayS[] = {"mere", "pere", "prune", "banane", "cirese", "gutui", "ananas", "struguri", "rodie"};
    for (int i = 0; i < arrayS.length; i++) {
      if (i == 2)
      System.out.println(" Afisati pe ecran valoarea: " + arrayS[i]);
      else if (i == 7)
     //System.out.println(" Sfarsit " + arrayS[i]);
        break;
      else 
        
      System.out.println(" Index valid!");
      
    }

      // cerinta nr.7 **********

    ArrayList<Integer> listamea = new ArrayList<Integer>();
    listamea.add(8);
    listamea.add(15);
    listamea.add(-5);
    listamea.add(2);
    listamea.add(11);
    Integer sumalistamea = 0;
    int i = 0;
    do { sumalistamea = sumalistamea + listamea.get(i);
        i++;
       } while (i < listamea.size());
         System.out.println(" Suma celor 5 elemente este " + sumalistamea);

      // cerinta nr.8 **********

    ArrayList<String> materii = new ArrayList();
    materii.add(0, "geografie");
    materii.add(1, "matematica");
    materii.add(2, "istorie");
    materii.add(3, "fizica");
    System.out.println("Materiile mele preferate sunt " + materii);
    materii.remove(2);
    System.out.println("Am eliminat o materie si au ramas urmatoarele " + materii);
    materii.clear();
    if (materii.size() == 0)

     System.out.println("Acum lista mea este goala " + materii);
       
  }

}