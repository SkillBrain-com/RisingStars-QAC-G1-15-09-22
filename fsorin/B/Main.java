import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // exercitiul 1

        int max = 100;
        int min = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Scrie numarul tau: ");
        int keyboardNum = input.nextInt();
        Random random = new Random();
        int randomNum = min + random.nextInt(max);
        if (keyboardNum < randomNum) {
            System.out.println("Numarul introdus este mai mic decat: " + randomNum);
        }

        //exercitiul 2


        System.out.println("Scrie primul numar: ");
        int firstNumber = input.nextInt();
        System.out.println("Scrie al doilea numar: ");
        int secondNumber = input.nextInt();
        input.nextLine();
        System.out.println("Scrie litera: ");
        String keyboardChar = input.nextLine();
        switch(keyboardChar){
            case "a":
                System.out.println("Adunare: " + (firstNumber + secondNumber));
                break;
            case "s":
                System.out.println("Scadare: " + (firstNumber - secondNumber));
                break;
            case "i":
                System.out.println("Inmultire: " + (firstNumber * secondNumber));
                break;
            case "p":
                System.out.println("Impartire: " + (firstNumber / secondNumber));
                break;
            case"m":
                System.out.println("Modul: " + (firstNumber % secondNumber));
                break;
            default:
                System.out.println("Nici o litera nu a fost selectata: ");
        }

        // exercitiul 3

        String[][] bidemensionalString = new String[3][5];
        bidemensionalString[0][0] = "Sorin";
        bidemensionalString[0][1] = "Denis";
        bidemensionalString[0][2] = "Marian";
        bidemensionalString[0][3] = "Simona";
        bidemensionalString[0][4] = "Cosmin";
        bidemensionalString[1][0] = "Laur";
        bidemensionalString[1][1] = "Relu";
        bidemensionalString[1][2] = "Deea";
        bidemensionalString[1][3] = "Vali";
        bidemensionalString[1][4] = "Vera";
        bidemensionalString[2][0] = "Bogdan";
        bidemensionalString[2][1] = "Marcel";
        bidemensionalString[2][2] = "Victor";
        bidemensionalString[2][3] = "Sebastian";
        bidemensionalString[2][4] = "Tudor";
        System.out.println(bidemensionalString);
        for(int rand = 0;rand<bidemensionalString.length;rand++) {
            for(int col = 0; col < bidemensionalString[rand].length;col++){
                // conditional selecteaza primul sau ultimul de pe rand si primul sau ultimul de pe coloana
                if((rand == 0 || rand == bidemensionalString.length - 1)&&(col==0 || col == bidemensionalString[rand].length - 1)){
                    System.out.println(bidemensionalString[rand][col]);
                }
            }
        }

       // exercitiul 4

        char[] chararray = new char[10];
        chararray[0] = 'b';
        chararray[1] = 'c';
        chararray[2] = 'd';
        chararray[3] = 'e';
        chararray[4] = 'f';
        chararray[5] = 'g';
        chararray[6] = 'h';
        chararray[7] = 'i';
        chararray[8] = 'j';
        chararray[9] = 'k';
        for(int i = 0;i < chararray.length;i += 2){
            System.out.println(chararray[i]);
        }

        //exercitiul 5

        double[] doublearray = new double[10];
        doublearray[0] = 1.1;
        doublearray[1] = 1.5;
        doublearray[2] = 2.3;
        doublearray[3] = 3.5;
        doublearray[4] = 4.5;
        doublearray[5] = 5.5;
        doublearray[6] = 6.9;
        doublearray[7] = 8.8;
        doublearray[8] = 9.1;
        doublearray[9] = 9.9;
        for(int i =  0;i < doublearray.length;i++){
            if(doublearray[i]==4.5){
                System.out.println(doublearray[i]);
            }
            else if(doublearray[i] > 5){
                System.out.println("Element mai mare ca 5: " + doublearray[i]);
            }
        }

        //exercitiul 6

        String[] stringarray = new String[9];
        stringarray[0] = "John";
        stringarray[1] = "Bonsai";
        stringarray[2] = "Cactus";
        stringarray[3] = "Vanilla";
        stringarray[4] = "Chocolate";
        stringarray[5] = "Adidas";
        stringarray[6] = "Shirt";
        stringarray[7] = "Hat";
        stringarray[8] = "Key";
        for(int i = 0;i < stringarray.length;i++){
            if(i == 7){
                break;
            }
            else if(i != 2){
                System.out.println("Indexul este valid " + i);

            }
        }

        //exercitiul 7

        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(5);
        intlist.add(8);
        intlist.add(9);
        intlist.add(11);
        intlist.add(14);
        int sum = 0;
        for(int i = 0;i < intlist.size();i++){
            sum += intlist.get(i);
        }
        System.out.println("Suma este: " + sum);


        //exercitiul 8

        ArrayList<Integer> intlist2 = new ArrayList<Integer>();
        int[] list3 = new int[2];
        list3[0] = 8;
        if(intlist2.size()==0 && list3.length==0){
            System.out.println("Listele sunt goale");
        }
        else if(intlist2.size() == 0){
            System.out.println("ArrayList este goala");
        }
        else if(list3.length==0){
            System.out.println("Array este gol");
        }
        else{
            System.out.println("Nici o lista nu e goala");
        }
    }
}