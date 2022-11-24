
/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
import java.util.List;

public class PigLatinTranslator {

  // attributes
  private List<String> vowels = List.of("a", "e", "i", "o", "u", "yt", "xr", "xy");    //lista cu vocale
  private List<String> consonantClusters = List.of("thr", "sch", "th", "ch", "rh", "qu", "squ");    //lista cu cazurile pentru cluster de consoane

  // methods
  // Rule1
  private boolean checkFirstLetter(String text) { // verific daca prima litera de tip text: x sau y se afla impreuna sau
                                                  // separat la inceputul unui cuvant, cf. Rule1
    String firstChar = Character.toString(text.charAt(0)); // definesc prima litera (vocala) sub forma de caracter (la
                                                           // indexul 0)
    if (firstChar.equals("x") || firstChar.equals("y")) { // pun conditia: daca prima litera (vocala) este x sau y
                                                          // atunci
      String secondChar = Character.toString(text.charAt(1)); // definesc a doua litera (vocala) sub forma de caracter
                                                              // (la indexul 1)
      return (vowels.contains(firstChar + secondChar)); // si returnez primele doua caractere de vocale (adica daca primele 2 litere sunt yt, xr, xy) 
                                                        // litera) - caz pozitiv
    } // altfel
    return vowels.contains(firstChar); // daca prima litera nu este x sau y, verific daca este vocala verificand prezenta ei in lista de vocale (cazul merge pe negativ)
  }

  private String caseVowel(String text) { // in cazul in care textul incepe cu vocala (Rule1)
    return text + "ay"; // returneaza cuvantul (text) urmat de "ay" la sfarsit
  }

  // Rule2
  private String caseConsonant(String text) { // in cazul in care textul incepe cu consoana (Rule2)
    char firstLetter = text.charAt(0); // definesc prima litera (consoana) sub forma de caracter (la index 0)
    String substring = text.substring(1); // definesc un grup de consoane (incepe de la index 1) //definesc cuvantul fara prima litera 
    return substring + firstLetter + "ay";     // returnez cuv fara prima litera + prima litera + ay
                                         
  }

  // Rule3
  private String caseCluster(String text, int numberOfCharsToBeMoved) { // in cazul in care cuvantul incepe cu o
                                                                        // consoana + "qu" (Rule3),
    String substringToBeMoved = text.substring(0, numberOfCharsToBeMoved); // definesc de tip string, grupul de consoane
                                                                           // (squ) care va fi mutat in spatele
                                                                           // cuvantului final, adica: va fi mutat in
                                                                           // cuvant, ca pozitie incepand cu indexul 0
                                                                           // pana la grupul de litere care vor veni in
                                                                           // fata ("are") 
    return text.substring(numberOfCharsToBeMoved) + substringToBeMoved + "ay"; // va returna grupul "are" de la final +
                                                                               // grupul "squ" + "ay" (cf Rule3)
  }

  private String fullSentence(String text) {
    String[] str = text.split("\\s+");       //impart propozitia pe cuvinte dupa delimitatorul spatiu
    String sentence = " ";                   // si consturiesc o noua propozitie
    for (int i = 0; i < str.length; i++)    //parcurgem fiecare element din lungimea intreaga a sirului
      sentence = sentence + " " + translate(str[i]);  // pentru fiecare cuvant din propozitie apelez metoda translate si adaug rezultatul in variabila sentence (unde construiesc noua propozitie)
    return sentence.strip();      // scot spatiul liber de la inceputul propozitiei si de la finalul propozitiei
  }

  public String translate(String text) {    // cazul pentru full sentence sau metoda care realizeaza efectiv traducerea
    String[] str = text.split("\\s+");    //verific daca primesc un cuvant sau o propozitie(incerc sa impart pe cuvinte dupa delimitatorul spatiu)
    if (str.length > 1)  
      return fullSentence(text);      // daca am salvat mai sus mai mult de un cuvant (adica e propozitie) apelez cazul pentru full sentence
    if (checkFirstLetter(text))
      return this.caseVowel(text);    // daca nu e propozitie, deci e doar cuvant, verific daca suntem in cazul vocala
    else {                            //altfel, daca nu e full sentence si nici vocala,verificam daca e cazul de cluster de consoane (merge pe caz negativ)
      for (String item : consonantClusters)    //parcurgem fiecare element din lista de clustere de consoane
        if (text.indexOf(item) == 0)
          return caseCluster(text, item.length());  // verificam daca elementul din lista apare la inceputul cuvantului si daca da apelam cazul cluster
    }
    return caseConsonant(text);  // daca nu suntem in niciunul din cazurile de mai sus,inseamna ca suntem in cazul de consoana si apelam cazul consoana
  }
}