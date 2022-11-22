import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        exercitiul1
//        Scanner scan = new Scanner(System.in);
//        System.out.println("introduceti un numar: ");
//        int numarTastatura = scan.nextInt();
//        int numarRandom = new Random().nextInt(1,100);
//        if (numarTastatura < numarRandom) System.out.println("Numarul introdus este mai mic decat %d".formatted(numarRandom));

//        exercitiul2
//        System.out.println("introduceti un caracter dintre a,s,i,p,m: ");
//        String caracter = scan.next();
//        System.out.println("introduceti un numar: ");
//        int numar_a = scan.nextInt();
//        System.out.println("introduceti un numar: ");
//        int numar_b = scan.nextInt();
//        switch (caracter){
//            case "a":
//                System.out.println("Suma numerelor este %d ".formatted(numar_a + numar_b));
//            case "s":
//                System.out.println("Diferenta numerelor este %d ".formatted(numar_a - numar_b));
//            case "i":
//                System.out.println("Inmultirea numerelor este %d ".formatted(numar_a * numar_b));
//            case "p":
//                System.out.println("Impartirea numerelor este %d ".formatted(numar_a / numar_b));
//            case "m":
//                System.out.println("Modulul numerelor este %d ".formatted(numar_a % numar_b));
//            default:
//                throw new RuntimeException("Operatiune invalida");
//        }

//        exercitiul3
        int vector[][] = new int[3][5];
        for (int i = 0;i < vector.length;i++)
            for (int j = 0;j<vector[i].length;j++)
            {
                vector[i][j] = new Random().nextInt(1,100);
            }
//
//        for (int i = 0;i <vector.length;i++)
//        {for (int j = 0;j<vector[i].length;j++)
//        {System.out.println(vector[i][j] + " ");}
//        System.out.println();}
        for (int[] item : vector)
            System.out.println(Arrays.toString(item));


//      exercitiul4
//        char initialChar = 'a';
//        char arr[] = new char[10];
//        for (int i=0; i< arr.length;i++)
//            arr[i] = initialChar++;
//        System.out.println(arr);
//        for (int item =0;item < arr.length;item+=2)
//            System.out.println(arr[item]);
//


//        exercitiul7
//        int[] lista = new int[5];
//        int suma=0;
//        for (int a = 0;a< lista.length;a++)
//        {
//            lista[a] = new Random().nextInt(1,100);
//        }
//        for (int a = 0;a< lista.length;a++)
//        {
//            suma += lista[a];
//        }
//        System.out.println(suma);


    }
}