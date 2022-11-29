import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String [] args) {

  // exercitiu b1

  Scanner scan = new Scanner(System.in);
    int numar;
    System.out.println("Valoare numarului este ");
    numar = scan.nextInt();
  
  // daca il afisam:
  // System.out.println("Numarul afisat este %d".formatted(numar));


    Random numar_random = new Random();
     int numGen = numar_random.nextInt(100)+1;
     System.out.println("Numarul random citit este " + numGen);

        if (numar< numGen) System.out.println("Numarul introdus %d este mai mic decat %d".formatted(numar,numGen));

    
    // System.out.println("Numarul introdus %d este mai mic decat %d".formatted(numar, numar_random));

    

  // exercitiu b2

    char c;
    int num1;
    int num2;

    Scanner scaneaza = new Scanner(System.in);
    System.out.println("Carcaterul introdus este");
    c = scaneaza.next().charAt(0);
    System.out.println("Caracterul citit este " + c);

    System.out.println("Numerele intorduse sunt");
    num1 = scaneaza.nextInt();
    num2 = scaneaza.nextInt();
    System.out.println("Numerele citite sunt " + num1 + "si " + num2);

  if (c == 'a') {
            System.out.println("Adaugare");
        } else if (c == 's') {
            System.out.println("Scadere");
        } else if (c == 'i') {
            System.out.println("Imultire");
        } else if (c == 'p') {
            System.out.println("Impartire");
        } else if (c == 'm') {
            System.out.println("Modul");
        }


        switch (c){
            case 'a': {
                System.out.println(num1+num2);
                break;
            }
            case 's': {
                System.out.println(num1-num2);
                break;
            }
            case 'i': {
                System.out.println(num1*num2);
                break;
            }
            case 'p': {
                System.out.println(num1/num2);
                break;
            }
            case 'm': {
                System.out.println(num1%num2);
                break;
            }
            default: {
                System.out.println("Eroare. Introduceti una din caracterele urmatoare:a,s,i,p,m");
            }

        }

  
    

// exercitiu b3

   String abc[][] = new String[3][5];
   abc[0][0] = "mar";
    abc[0][1] = "para";
    abc[0][2] = "banana";
    abc[1][0] = "cirese";
    abc[1][1] = "prune";
    abc[1][2] = "gutui";
    abc[1][3] = "capsuni";
    abc[1][4] = "struguri";

  System.out.println(abc[0][0]); //primul element de la prima dimensiune
  System.out.println(abc[0][2]); //ultimu element de la prima dimensiune
  System.out.println(abc[1][0]); // primul element de la a doua dimensiune
  System.out.println(abc[1][4]); // ultimul element de la a doua dimensiune



    // String abc [][] = {{mar,para,banana}, {cirese, prune, gutui, capsuni, struguri}};
    //   for (String i = 0; i > 2; i++);
    // for (String j = 0; j > 4; j ++);
    // {
    // System.out.println(abc[i][j]) ;
    // }
    // System.out.println();
 
// exercitiu b4

      char[] arrChar = new char[5];

        arrChar[0] = 'z';
        arrChar[1] = 'x';
        arrChar[2] = 'v';
        arrChar[3] = 'b';
        arrChar[4] = 'n';


        for (char i = 0; i < arrChar.length; i++) {
            System.out.println("Elemetunl" + i + "este egal cu " + arrChar[i]);
        }

        for (char i = 0; i < arrChar.length; i+=2) {
            System.out.println("Elemetunl" + i + "este egal cu " + arrChar[i]);
        }
   
// exeritiu b5

 Double[] zeci = {23.6, 56.8, 10.6, 4.5, 7.0, 13.5, 22.5};
        for (int i = 0; i < zeci.length; i++) {
          System.out.println(zeci[i]);

          if (i == 4.5) {
            System.out.println("Elementul " + i + "este egal cu valoarea 4.5");
            } else if (i > 5) {
               System.out.println("Element peste 5");
            }
        }
    
    
// exercitiu b6
    Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j = 0; j < array.length; j++) {
           System.out.println("Array index " + j + ", valoarea " + array[j]);

//      for (int num: array) {
//         System.out.println("Valoarea elementului este " + num);
//        }

        if (j == 2){ //j == 2
           continue;
            }
            else if (j == 7) { // j==7
                break;
            } else {
                System.out.println("Index valid");}
        }

// exercitiu b7
      
  ArrayList<Integer> lista = new ArrayList<>();
    lista.add(20);
    lista.add(30);
    lista.add(60);
    lista.add(50);
    lista.add(80);

    Integer sumaLista = 0;
    int q = 0;

    do {
      sumaLista = sumaLista + lista.get(q);
      q++;

        } while (q < lista.size());
          System.out.println("Suma tuturori elementelor este " + sumaLista);
    

// exercitiu b8

     String[] animale = new String[7];
        animale[0] = "caine";
        animale[1] = "lebada";
        animale[4] = "vaca";
        animale[5] = "girafa";

        System.out.println(animale[0]);
        System.out.println(animale[1]);

        System.out.println(animale[2]);

        System.out.println(animale.length);

    if(animale.length == 0 )
      System.out.println("Array gol");
    else  System.out.println(animale.length);
      


        ArrayList<String> fructe = new ArrayList<>();
        fructe.add("mar");
        fructe.add("piersica");
        fructe.add("portocala");
        fructe.add("kiwi");
        fructe.add("pepene");
        fructe.add("struguri");

        System.out.println(fructe.get(0));
        System.out.println(fructe.get(1));
        System.out.println(fructe.get(5));

        System.out.println(fructe.size());

        // System.out.println(fructe.get(6));

    if(fructe.size() == 0 )
      System.out.println("Array gol");
    
    else  System.out.println(fructe.size());
    
  }
}

  
