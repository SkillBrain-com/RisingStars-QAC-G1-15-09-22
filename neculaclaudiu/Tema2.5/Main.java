import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Sub1();
        //System.out.println(Sub2());
        //Sub3();
        //Sub4();
        //Sub5();
        //Sub6();
        //Sub7();
        //Sub8();
    }
     public static void Sub1(){
         Scanner sc = new Scanner(System.in);
         Random rand = new Random();
         System.out.println("Introduceti numarul de la tastatura:");
         int nr = sc.nextInt();
         int nrRandom = rand.nextInt(0,100);
         if(nr < nrRandom){
             System.out.println("Numarul indrodus de la tastatura este mai mic decat numarul random generat "+ nrRandom);

         }

     }
     public static String Sub2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un caracter corespunzator unei operatii matematice: ");
        String op = sc.next();
        System.out.println("Introduceti primul numar");
        double nr1 = sc.nextDouble();
        System.out.println("Introduceti al doilea numar");
        double nr2 = sc.nextDouble();
        switch (op){
            case "a":
                return "Adunarea celor douna numere este:" + (nr1 + nr2);
            case "s":
                return "Scaderea celor doua numere este:" + (nr1 - nr2);
            case "i":
                return "Imultirea celor douna numere este: " + (nr1 * nr2);
            case "m":
                 return "Modulul celor doua numere este: " + (nr1 % nr2);
            case "p":
                double imp = nr1 / nr2;
                return "Impartirea celor doua numere este: " + imp;
            default:
                return "Nu ati intodus un caracter valid";
        }

     }
     public static void Sub3(){
        int[][] array = {{0, 3, 5, 6, 8},
                {10,22,13,7,11},
                {8,3,55,2,13} };
         System.out.println("Primele si ultimele numere din array sunt: ");
         for( int i = 0;i<3;i++){
             for(int j=0;j<5;j++){
                 if(j == 0 || j==1 || j==3 || j==4){
                     System.out.println(array[i][j]);
                 }
             }
         }
     }
     public static void Sub4(){
        char[] litere = {'a','b','v'};
        for (int i=0;i<litere.length;i++){
            if(i==1){
                System.out.println("Al doilea caracter din array este: " + litere[i]);
            }
        }

    }
     public static void Sub5(){
        double[] array = {0.1,4.5,10.55,11.6,3.2,1.1};
        for(int i=0;i < array.length;i++){
            if(array[i] == 4.5) {
                System.out.println("Elementul " + i + " este egal cu 4.5");
            }
            if(array[i] > 5){
                System.out.println("Elementul "+ i + " este mai mare ca 5");
            }

        }
    }
     public static void Sub6(){
        int[] array = {0,1,2,3,4,5,6,7,8};
        for (int i=0;i < array.length;i++){
            System.out.println("Index" + i + "cu valoarea" + array[i]);
            if(i == 2){
                continue;
            }
            else if(i == 7){
                break;
            }
            else{
              System.out.println("Index Valid");
            }
        }
    }
     public static void Sub7(){
         int sum = 0;
         List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(5);
         list.add(7);
         list.add(13);
         list.add(4);
         for(int i=0; i<5;i++){
             sum += list.get(i);
         }
         System.out.println("Suma elementelod din lista este: " + sum);

    }
     public  static void Sub8(){
        int[] array = null;
        List<Integer> list = new ArrayList<>();
        if(array == null){
            System.out.println("arrayul este gol");
        }
        if(list.isEmpty()){
            System.out.println("lista este goala");
        }

    }
}