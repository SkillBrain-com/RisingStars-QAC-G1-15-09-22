package com.java1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exercitiul 1;
        System.out.println("Imi place java!");

        //exercitiul 2;
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");


        //exercitiul 3;
          int varstaAna = 24;
          int varstaDavid;
          varstaDavid = varstaAna - 6;
          System.out.println("Varsta lui David este:" + varstaDavid);

        //exercitiul 4
          System.out.println("Scrie o propozitie:");
          Scanner scan = new Scanner(System.in);
          String propozitie = scan.nextLine();
          System.out.println("Propozitia citita de la tastatura este %s".formatted(propozitie));
          System.out.println("Propozitia citita de la tastatura este " + propozitie);

        //exercitiul 5
          myVariables();
          int c =suma(4,5);
          System.out.println("suma celor doaua numere este %d".formatted(c));

        //exercitiul 6
          Scanner imput = new Scanner(System.in);
          int numarIntreg;
          double numarFractionar;
          System.out.println("Introduceti un nr intreg ");
          numarIntreg = imput.nextInt();
          System.out.println("Introduceti un nr fractionar ");
          numarFractionar = imput.nextDouble();
          System.out.println("Numarul intreg este %d  iar  numarul  fractionar este %f ".formatted(numarIntreg, numarFractionar));

        //exercitiul 7
          Scanner scanare = new Scanner(System.in);
          System.out.println("Introduceti un nr intreg ");
          int numarCitit = scanare.nextInt();
          int suma = numarCitit + 5;
          System.out.println("Suma Numarului %d cu 5 este: %d".formatted(numarCitit, suma));
          double scadere = numarCitit - 12.3;
          System.out.println("Scaderea  Numarului %d cu 12.3 este:%f ".formatted(numarCitit, scadere));
          double inmultirea = numarCitit * (-3.2);
          System.out.println("Inmultirea  Numarului %d cu -3.2 este: %f".formatted(numarCitit, inmultirea));
          int impartirea  = numarCitit / 4;
          System.out.println("Impartirea Numarului %d cu 4 este: %d ".formatted(numarCitit, impartirea));
          int modul = numarCitit % 6;
          System.out.println("Modulul  Numarului %d cu 6 este: %d".formatted(numarCitit, modul));

        // exercitiul 8
        int x = 2;
        int y = 12;

        // y = x * y;
         y = x + y;

        x = y - x;
        y = y - x;

        System.out.println("Numarul x este:");
        System.out.println(x);
        System.out.println("Numarul y este:");
        System.out.println(y);


    }
    //exercitiul 5
    public static void myVariables (){
        int numar = 56;
        String text = "acesta e un text";
        boolean adevar = true;
        System.out.println("Numarul este %d, stringul este %s, iar valoarea boolean este %s".formatted(numar,text,adevar));

    }

    public static int suma (int a, int b){
        return a + b;
    }
}