import java.util.Scanner;

// exercitiu 1

class Main {
  public static void main(final String[] args) {
    System.out.println("Imi place Java");

// exercitiu 2

    System.out.println("Cursul acesta este foarte fain!");
    System.out.println("Cursul acesta este foarte fain!");
    System.out.println("Cursul acesta este foarte fain!");
    System.out.println("Cursul acesta este foarte fain!");
    System.out.println("Cursul acesta este foarte fain!");
    System.out.println("Cursul acesta este foarte fain!");

// exercitiu 3

    int a = 24;
    int b = 6;
    int varstaDavid = a - b;

    System.out.println("Varsta lu David este " + varstaDavid);
    
      //cum sa facut in clasa

    int varstaAna = 26;
    int varstaDavidut = varstaAna - 6;
      
    System.out.println("Varsta lu David este " + varstaDavid);
      
    System.out.println("Varsta lu David este %d".formatted(varstaDavid)); //%f double; %s string si modul
      
    System.out.println("Varsta Anei este " + varstaAna + " " + "iar varsta lu David este "  + varstaDavid); 
     
    System.out.println("Varsta Anei este %d iar varsta lu David este %d".formatted(varstaAna, varstaDavid));

// exercitiu 4 (citit propozitie de la tastatura)
    
    System.out.println("Scrie o propozitie: ");
    Scanner scan = new Scanner(System.in);
    String abc = scan.nextLine();

    System.out.println("Propozitia citita de la tastatura este" + abc);
    System.out.println("Propozitia citita de la tastaura este %s".formatted(abc));



    
// exercitiu 6
 
    Scanner input = new Scanner(System.in);
  int numarIntreg;
  double numarFractionar;
    System.out.println("Introduceti un numar intreg");
  numarIntreg = input.nextInt();
    System.out.println("Introduceti un numar fractionar");
  numarFractionar = input.nextDouble();
    System.out.println("Numarul intreg este %d iar numarul fractionar este %f".formatted(numarIntreg, numarFractionar));
    


// exercitiu 7

    Scanner scanare = new Scanner(System.in);
    System.out.println("Introduceti un numar intreg");
    int numarCitit = scanare.nextInt();
    int suma = numarCitit + 5;
    System.out.println("Suma numarului %d cu 5 este: %d".formatted(numarCitit,suma));
    double scadere = numarCitit - 12.3;
    System.out.println("Scaderea numarului %d cu 12.3 este: %f".formatted(numarCitit,scadere));
    double inmultire = numarCitit * (-3.2);
    System.out.println("Inmultirea numarului %d cu (-3.2) este: %f".formatted(numarCitit,inmultire));
    int impartire = numarCitit / 4;
    System.out.println("Impartirea numarului %d cu 4 este: %d".formatted(numarCitit,impartire));
    int modul = numarCitit % 6;
    System.out.println("Modulul numarul %d cu 6 este: %d".formatted(numarCitit,modul));

// exercitiu 8 

int x = 2;
int y = 12;

//y = x * y;
 y = x + y;
 x = y - x;
 y = y - x;

    
 System.out.println(x);
 System.out.println(y);



    // exercitiu 5

  myVariables();

    }

  // exercitiu 5

  public static void myVariables() {

    int numar = 8;
    String text = "acesta este un text";
    boolean adevar = true;

    System.out.println("Numarul este %d, stringul este %s, iar valoarea booleana este %s".formatted(numar, text, adevar));
    
    }


  
}

