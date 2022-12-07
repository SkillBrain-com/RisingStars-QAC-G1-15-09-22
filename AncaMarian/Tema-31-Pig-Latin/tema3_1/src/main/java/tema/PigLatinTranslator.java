import java.util.Scanner;

public class PigLatinTranslator {
    public String translate(String cuvant){
        String[] cuvinte = cuvant.split(" ");
        String rezultat ="";
        for (String iteratie: cuvinte) {
            rezultat = rezultat + translateIndividualWord(iteratie) + " ";
        }

        return rezultat.strip();
    }
    public String translateIndividualWord(String cuvant) {
    String cuvantTradus = "";
    String cuvantCuLitereMici = cuvant.toLowerCase();

        if (cuvantCuLitereMici.length() == 2) { //deci cuvantul are 2 litere
            String aDouaLitera = cuvantCuLitereMici.substring(1, 2);
            if (aDouaLitera.equals("y")) { //respecta si regula4
                cuvantTradus = "y" + cuvantCuLitereMici.substring(0, 1) + "ay";
            } else {return "eroare1";}
        } else {
            if (verificaRegula1(cuvantCuLitereMici)) { //deci cuvantul nu are doar 2 litere si verifica regula1
                cuvantTradus = cuvantCuLitereMici + "ay";

            } else {
                if (verificaRegula3(cuvantCuLitereMici)) {
                    boolean switchApelat = false;
                    switch (cuvantCuLitereMici.substring(0,3)) {
                        case "thr":
                        case "sch":
                        case "squ":
                            cuvantTradus = cuvantCuLitereMici.substring(3) + cuvantCuLitereMici.substring(0, 3) + "ay";
                            switchApelat = true;
                            break;
                        default: break;}

                    if (!switchApelat){
                        switch (cuvantCuLitereMici.substring(0,2)) {
                            case "th":
                            case "ch":
                            case "rh":
                            case "qu":
                                cuvantTradus = cuvantCuLitereMici.substring(2) + cuvantCuLitereMici.substring(0, 2) + "ay";
                                break;
                            default: break;}
                    }


                } else if (verificaRegula2(cuvantCuLitereMici)) {
                    cuvantTradus = cuvantCuLitereMici.substring(1) + cuvantCuLitereMici.substring(0, 1) + "ay";
                }
                }
            }

        return cuvantTradus;}


    public static boolean verificaRegula1(String cuvant) {
        String cuvantCuLitereMici = cuvant.toLowerCase();
        String primaLitera = cuvantCuLitereMici.substring(0, 1); //am scos prima litera
        String primeleDouaLitere = cuvantCuLitereMici.substring(0, 2); //am scos primele 2 litere
        String[] vocale = {"a", "e", "i", "o", "u", "xr", "yt"};

        for (int j = 0; j < vocale.length; j++) {
            String toCompare = vocale[j];
            if (primaLitera.equals(toCompare) || primeleDouaLitere.equals(toCompare)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificaRegula2(String cuvant) {
        return !verificaRegula1(cuvant);
    }
    public static boolean verificaRegula3(String cuvant) {
        String cuvantCuLitereMici = cuvant.toLowerCase();
        String primeleDouaLitere = cuvantCuLitereMici.substring(0, 2); //am scos primele 2 litere
        String primeleTreiLitere = cuvantCuLitereMici.substring(0, 3); //am scos primele 3 litere
        String[] consoane = {"th", "thr", "ch", "sch", "rh", "squ", "qu"};
        for (int j = 0; j < consoane.length; j++) {
            String toCompare = consoane[j];
            if ((!verificaRegula1(cuvantCuLitereMici)) && (primeleDouaLitere.equals(toCompare) || primeleTreiLitere.equals(toCompare))) {
                return true;
            }
        }
        return false;
    }
}


//                    for (int j = 0; j < consoane1.length; j++) {
//        if (cuvantCuLitereMici.substring(0, 2).equals(consoane1[j])) {
//        String parte1 = cuvantCuLitereMici.substring(2);
//        String parte2 = cuvantCuLitereMici.substring(0, 2);
//        cuvantTradus = parte1+ parte2+ "ay";
//        } else {
//        for (int k = 0; k < consoane2.length; k++) {
//        if (cuvantCuLitereMici.substring(0, 3).equals(consoane2[k])) {
//        cuvantTradus = cuvantCuLitereMici.substring(3) + cuvantCuLitereMici.substring(0, 3) + "ay";
//        } else {
//        for (int l = 0; l < consoane3.length; l++) {
//        if (cuvantCuLitereMici.substring(0,1).equals(consoane3[l])) {
//        cuvantTradus = cuvantCuLitereMici.substring(1) + cuvantCuLitereMici.substring(0,1)+"ay";
//        }
//        }
//        }
//
//        }
//        }
//        }







