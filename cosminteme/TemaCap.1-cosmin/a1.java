import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    // ex.1
    System.out.println("Imi place Java!");
    // ex.2
    System.out.println("Cursul acesta este foarte fain!");
    System.out.println("Cursul acesta este foarte fain!");
    System.out.println("Cursul acesta este foarte fain!");
    System.out.println("Cursul acesta este foarte fain!");
    System.out.println("Cursul acesta este foarte fain!");
    System.out.println("Cursul acesta este foarte fain!");
    // ex.3
    int varstaAna = 24;
    int varstaDavid = varstaAna - 6;
    System.out.println("Varsta lui David este " + varstaDavid + " ani");
    // ex.4
      
    System.out.println("Am citit de la tastatura urmatoarea propozitie: ");
    Scanner scan = new Scanner(System.in);
    String propozitie = scan.nextLine();
    System.out.println("Propozitia citita de la tastatura este: " + propozitie);
    // ex. 5
    myVariables();
    
    // ex. 6
    Scanner input = new Scanner(System.in);
    int numarIntreg;
    double numarFractionar;
    System.out.println("Introduceti un numar intreg: ");
    numarIntreg = input.nextInt();
    System.out.println("Introduceti un numar fractionar: ");
    numarFractionar = input.nextDouble();
    System.out.println(" Numarul intreg este %d iar numarul fractionar este %f".formatted(numarIntreg, numarFractionar));

    // ex.7
    
    Scanner scanare = new Scanner(System.in);
    System.out.println("Introduceti un numar intreg: ");
    int numarCitit = scanare.nextInt();
    int suma = numarCitit + 5;
    System.out.println("Suma numarului %d cu 5 este: %d ".formatted(numarCitit, suma));
    double scadere = numarCitit - 12.3;
    System.out.println("Scaderea numarului %d cu 12.3 este: %f ".formatted(numarCitit, scadere));
    double inmultire = numarCitit * -3.2;
    System.out.println("Inmultirea numarului %d cu -3.2 este: %f ".formatted(numarCitit, inmultire));
    int impartire = numarCitit / 4;
    System.out.println("Impartirea numarului %d la 4 este: %d ".formatted(numarCitit, impartire));
    int modul = numarCitit % 6;
    System.out.println("Modulul numarului %d cu 6 este: %d ".formatted(numarCitit, modul));

    // ex.8

    int x = 2;
    int y = 12;
    y = x + y;
    x = y - x;
    y = y - x;
    System.out.println(x);
    System.out.println(y);
    
  }
  // ex.5
  public static void myVariables(){
    int numar = 56;
    String textul = "Acesta este un text";
    boolean adevar = true;
    System.out.println("Numarul este " + numar + ", Stringul este: " + textul + ", Booleanul este " + adevar);
   
  }


  

    //la cerinta 8 se decomenteaza al doilea comentariu
    

}