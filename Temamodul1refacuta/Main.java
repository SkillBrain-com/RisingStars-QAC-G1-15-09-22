import java.util.Scanner;
class Main {
  public static void main(final String[] args) {
    //exercitiul 1
    System.out.println("Imi place java!");

    //exercitiul 2
    System.out.println("Cursul acesta este foarte fain");
    System.out.println("Cursul acesta este foarte fain");
    System.out.println("Cursul acesta este foarte fain");
    System.out.println("Cursul acesta este foarte fain");
    System.out.println("Cursul acesta este foarte fain");
    System.out.println("Cursul acesta este foarte fain");

    //exercitiul 3
    final int varstaAna = 24;
    int varstaDavid;
    varstaDavid = varstaAna - 6;
    System.out.println("Varsta lui david este " + varstaDavid);

    //exercitiul 4
    System.out.println("Scrie o propozitie:");
    Scanner scan = new Scanner(System.in);
    String propozitie = scan.nextLine();
    System.out.println("Propozitia citita de la tastatura este %s".formatted(propozitie));

    //exercitiul 5
    myVariables();

    //exercitiul 6
    Scanner imput = new Scanner(System.in);
    int numarIntreg;
    double numarFractionar;
    System.out.println("Introduceti un numar intreg:");
    numarIntreg = imput.nextInt();
    System.out.println("Introduceti un numar fractionar:");
    numarFractionar = imput.nextDouble();
    System.out.println("Numarul intreg este %d iar numarul fractionar este %f ".formatted(numarIntreg,numarFractionar));

    //exercitiul 7
    Scanner scanare = new Scanner(System.in);
    System.out.println("Introduceti un numar intreg:");
    int numarCitit = imput.nextInt();
    int suma = numarCitit + 5;
    System.out.println("Suma numarului citit %d cu 5 este: %d ".formatted(numarCitit, suma));
    double scadere = numarCitit - 12.3;
    System.out.println("Scaderea numarului citit %d cu 12.3 este: %f ".formatted(numarCitit, scadere));
    double inmultire = numarCitit - 12.3;
    System.out.println("Inmultirea numarului citit %d cu 12.3 este: %f ".formatted(numarCitit, inmultire));
    int impartire = numarCitit /4;
    System.out.println("Impartirea numarului citit %d cu 4 este: %d ".formatted(numarCitit, impartire));
    int modul = numarCitit % 6;
    System.out.println("Modulul numarului citit %d cu 6 este: %d ".formatted(numarCitit, modul));

    //exercitiul 8
    int x = 2;
    int y = 12;

    //y = x*y;
    y = x+y;

    x = y-x;
    y = y-x;
    
    System.out.println("Numarul x este:");
    System.out.println(x);
    System.out.println("Numarul x este:");
    System.out.println(y);
    
  }

  //exercitiul 5
  public static void myVariables () {
    int numar = 37;
    String text = "acesta este textul";
    boolean fals = false;
    System.out.println("Numarul este %d, stringul este %s iar valoarea boolean este %s ". formatted(numar, text, fals));
  }
}