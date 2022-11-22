import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // Primul exercitiu
    System.out.println("-----------------------------------");
    System.out.println("#Primul exercitiu!#");

    Scanner imput = new Scanner(System.in);
    int numar;
    System.out.println("Introduceti un numar:");
    numar = imput.nextInt();
    Random rand = new Random();
    int nrrandom = rand.nextInt(100);
    if (numar < nrrandom) {
      System.out.println("Numarul este mai mic decat " + nrrandom);
    }
    System.out.println("-----------------------------------");
    // Al doilea exercitiu
    // Scanner imput = new Scanner(System.in);
    System.out.println("#Acum incepe al doilea exercitiu!#");
    System.out.println("-----------------------------------");
    int nr1;
    int nr2;
    char caracter;
    System.out.println("Introduceti primul numar:");
    nr1 = imput.nextInt();
    System.out.println("Introduceti al doilea numar:");
    nr2 = imput.nextInt();
    System.out.println("Introduceti un caracter:");
    caracter = imput.next().charAt(0);

    switch (caracter) {
      case 'a': {
        System.out.println("Suma numerelor este:");
        System.out.println(nr1 + nr2);
        break;
      }
      case 's': {
        System.out.println("Scaderea numerelor este:");
        System.out.println(nr1 - nr2);
        break;
      }
      case 'i': {
        System.out.println("Inmultirea numerelor este:");
        System.out.println(nr1 * nr2);
        break;
      }
      case 'p': {
        System.out.println("Impartirea numerelor este:");
        System.out.println(nr1 / nr2);
        break;
      }
      case 'm': {
        System.out.println("Modulul numerelor este:");
        System.out.println(nr1 % nr2);
        break;
      }
      default: {
        System.out.println("Caracterul nu este valid");
      }

    }
    System.out.println("-----------------------------------");

    // exercitiul 3
    System.out.println("#Acum incepe exercitiul 3!#");
    System.out.println("Sa ne jucam cu array-uri");
    System.out.println("-----------------------------------");

    int[][] array = new int[3][5];
    array[0][0] = 1;
    array[0][1] = 2;
    array[0][2] = 3;
    array[0][3] = 4;
    array[0][4] = 5;
    array[1][0] = 11;
    array[1][1] = 12;
    array[1][2] = 13;
    array[1][3] = 14;
    array[1][4] = 15;
    array[2][0] = 21;
    array[2][1] = 22;
    array[2][2] = 23;
    array[2][3] = 24;
    array[2][4] = 25;

    System.out.println("Primele elemenete din array sunt");
    System.out.println(array[0][0]);
    System.out.println(array[1][0]);
    System.out.println(array[2][0]);
    System.out.println("Ultimele elemenete din array sunt");
    System.out.println(array[0][4]);
    System.out.println(array[1][4]);
    System.out.println(array[2][4]);

    System.out.println("-----------------------------------");

    int vector[][] = new int[3][5];
    for (int i = 0;i < vector.length;i++)
    for (int j = 0;j<vector[i].length;j++)
    {
    vector[i][j] = new Random().nextInt(1,100);
    }
    
    for (int i = 0;i <vector.length;i++)
    for (int j = 0;j<vector[i].length;j++)
    System.out.println(vector[i][j]);


    //Exercitiul 4
    System.out.println("#Acum incepe exercitiul 4!#");
    System.out.println("-----------------------------------");

    char[] caractere = {'a','b','c','d','e','f','g','h'};
    System.out.println("Afisam caracterele dintr-un sir de caractere din 2 in 2 pozitii!");
    for(int i = 0; i < caractere.length; i +=2){
      System.out.println("Caracterul de pe locul "+i+" este "+caractere[i]);
    }
      System.out.println("-----------------------------------");



    //Exercitiul 5
    System.out.println("#Acum incepe exercitiul 5!#");
      System.out.println("Cautam intr-un array numarul 4.5 si elementele mai mari decat 5!");
     System.out.println("-----------------------------------");
  
    double zecimal[] = {5.6,3.4,4.5,1.2,7.3,12.6,4.5,1.2};
    for(double dublu:zecimal){
      if(dublu == 4.5){
        System.out.println(dublu);
      }else if(dublu>5){
        System.out.println("Element peste 5");
      }else{
        System.out.println("Numarul nu se incadreaza in nici o conditie din tema!");
      }
        
    }
    System.out.println("-----------------------------------");

    //Exercitiul 6
    System.out.println("#Acum incepe exercitiul 6!#");
    System.out.println("-----------------------------------");
    int[] numere = {0,1,2,3,4,5,6,7,8};
    for(int m = 0; m <numere.length; m++){
      if (m == 2){
        continue;
      } else if (m ==7){
        break;
      } else
      // // switch (m){
      // //   case 2:{
      // //     m++;
      // //   }
      // //   case 7:{
      // //     m = numere.length;
      // //     break;
      // //   }
    
      // System.out.println("Index valid!");
    // if (m == 2) m++;
    // if (m == 7) break;
    System.out.println("Index valid!");
    
    }
    System.out.println("-----------------------------------");

    // Exercitiul 7
    System.out.println("#Acum incepe exercitiul 7!#");
     System.out.println("Calculam suma elementelor unei liste!");
    System.out.println("-----------------------------------");
    ArrayList<Integer> Numar = new ArrayList<>();
    Numar.add (5);
    Numar.add (15);
    Numar.add (25);
    Numar.add (35);
    Numar.add (45);
    Integer SumArrayList = 0;
    int n = 0;
    do {
      SumArrayList = SumArrayList + Numar.get(n);
      n++;
    } while (n < Numar.size());
     System.out.println("Suma numerelor listei este: "+SumArrayList);

     System.out.println("-----------------------------------");

    //Exercitiul 8
    System.out.println("#Acum incepe exercitiul 8!#");
    int[] Numere = {0,1,2,3,4,5,6,7,8};
    if (Numere.length == 0)
      System.out.println("Array-ul este gol!");
    else  System.out.println("Array-ul nu este gol!");

     ArrayList<Integer> Intregi = new ArrayList<>();
    if (Intregi.size() == 0)
      System.out.println("Lista este goala!");
    else  System.out.println("Lista nu este gol!");


    
    

  

  }
}