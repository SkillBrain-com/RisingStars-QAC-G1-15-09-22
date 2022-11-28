import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Main {
  public static void main(final String[] args) {
    System.out.println("Hello teacher!");

/*
   * exercitiul 1. Citit un număr de tastatură și stocați valoarea lui intr-o
   * variabilă. Generati un numar random intre 1 si 100 si stocati acel nume
   * intr-o alta variabila. Daca numarul introdus de la tastatura este mai mic
   * decat numarul random generat, afisati mesajul “Numarul introduce este mai mic decat <numar_random>” (inserati valoarea numarului random generat in textul afisat).
   */
    
Scanner scan = new Scanner(System.in);
  Random rand = new Random();
  System.out.println("Introduceti un numar de la tastatura");
  int numar = scan.nextInt(); 
    int numere = rand.nextInt(100);

    if (numar < numere){
      System.out.println(" Numarul este mai mic decat " + numere);
    }

    
System.out.println("#########");

    
//ex.2

Scanner input = new Scanner(System.in);
    int  numar1;
    int  numar2;
System.out.println("Introduceti primul numar");
    numar1 = input.nextInt();
 System.out.println("Introduceti al doilea numar");
    numar2 = input.nextInt();
    System.out.println("Scrieti un caracter");
    char caracter = input.next().charAt(0);
    
    
   
    switch(caracter){
      case 'a':  {
        System.out.println("Suma numerelor este " + (numar1 + numar2));
        break;
      }
      case 's':{
        System.out.println("Diferenta numerelor este" + ( numar1 - numar2));
        break;
      }
      case 'i':{
        System.out.println("Inmultirea numerelor este"+ (numar1 * numar2));
        break;
      }
      case 'p': {
        System.out.println("Impartirea numerelor este" + (numar1 / numar2));
        break;
      }
      case 'm':{ System.out.println("Modulul numerelor este" + (numar1 % numar2 ));
        break; }
        default :{ System.out.println("Caracterul nu este valid");}
    }
    
System.out.println("#######");

    
    //ex.3
    int[][] array = new int[3][5];

    array[0][0] = 2;
    array[0][1] = 4;
    array[0][2] = 6;
    array[0][3] = 8;
    array[1][0] = 9;
    array[1][1] = 7;
    array[1][2] = 5;
    array[1][3] = 2;
    array[2][0] = 1;
    array[2][1] = 3;
    array[2][2] = 6;
    array[2][3] = 7;


    System.out.println("Primele elemente din array sunt");
    System.out.println(array[0][0]);
    System.out.println(array[1][0]);
    System.out.println(array[2][0]);

    System.out.println("Ultimele elemente din array sunt");
    System.out.println(array[0][3]);
    System.out.println(array[1][3]);
    System.out.println(array[2][3]);

    System.out.println("#########");

    //ex.4

    char[] caractere ={'a','b','c','d','e','f','g','h','l'};

    System.out.println("Afisarea sirului de caractere din doua in doua pozitii");
     for(int i = 0; i < caractere.length; i +=2){
       System.out.println("Caracterul de pe locul "+i+" este " + caractere[i]);
     }

System.out.println("#########");

    //ex.5
    double zecimal[] = {1.2,3.5,3.2,5.4,3.2,};
    for(double dublu:zecimal){
      if(dublu == 4.5){
        System.out.println("dublu");
      }
      else if(dublu >5 ){
        System.out.println("Element peste 5");
    }
      else {System.out.println("Numarul nu se incadreaza in nici o conditie din tema");}
      }

System.out.println("#########");

    //ex.6
    int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    for (int m =0; m < number.length; m++){
      if (m == 2){
        continue;}
      else if(m == 7){ 
        break;} 
      else
        System.out.println("Index valid!");
    }

    System.out.println("#########");

    //ex7

    ArrayList<Integer>Numar = new ArrayList<>();
    
    Numar.add(10);
    Numar.add(5);
    Numar.add(4);
    Numar.add(3);
    Numar.add(7);
    
    Integer SumaArrayList = 0;
    int n = 0;
    do { SumaArrayList = SumaArrayList + Numar.get(n);
      n++;}
      while( n < Numar.size());
    System.out.println(" Suma numerelor este " + SumaArrayList);

    System.out.println("#########");


    //ex8

    String[] culoarea = new String[5];

        culoarea[0] = "verde";
        culoarea[1] = "rosu";
        culoarea[2] = "albastru";

    System.out.println(culoarea[0]);
    System.out.println(culoarea[1]);
    System.out.println(culoarea[2]);

    System.out.println(culoarea.length);
    if (culoarea.length == 0);
    System.out.println("Array gol!");

  ArrayList<String> mar = new ArrayList<>();
    mar.add("galben");
    mar.add("rosu");
    mar.add("verde");

    System.out.println(mar.get(0));
    System.out.println(mar.get(1));
    System.out.println(mar.get(2));
    
   System.out.println(mar.size());
    
    if(mar.size() == 0);
    System.out.println("Array gol");



    
   }
    }
  
