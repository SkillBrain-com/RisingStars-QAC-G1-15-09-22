import java.util.List;
public class PigLatinTranslator {

    //vowel sound + xr + yt + xy add ay at the end
    //consonant + "thr", "sch", "th", "ch", "rh", "qu" move consonant or cluster to the end and add ay
    //consonant followed by qu + mode to the end and add ay
    //consonantcluster followed by y or second letter in a 2word letter move at back and add ay

    //lista in care salvez cazurile pentru vocala
    private List<String> vowels = List.of("a", "e", "i", "o", "u", "yt", "xr","xy");
    //lista in care salvez cazurile pentru cluster de consoane
    private List<String> consonantClusters = List.of("thr", "sch", "th", "ch", "rh", "qu","squ");


    private boolean checkFirstLetter(String text){
        //return true if first letter is vowel or x/y //false if consonant
        String firstChar = Character.toString(text.charAt(0)); // iau prima litera din cuvant
        if (firstChar.equals("x") || firstChar.equals("y")) //daca cumva este x sau y
        {
            String secondChar = Character.toString(text.charAt(1)); // iau a2a litera din cuvant
            return (vowels.contains(firstChar+secondChar)); // verific daca cumva primele 2 litere sunt yt,xr sau xy
        }
        return vowels.contains(firstChar);//daca prima litera nu e x sau y verific daca e vocala verificand prezenta in lista de vocale
    }

    private String caseVowel (String text)
    {
        return text + "ay";
    } //regula pentru cazul vocala(pentru lista vowels)

    private String caseConsonant(String text)
    {
        char firstLetter = text.charAt(0); //iau prima litera
        String substring = text.substring(1); // salvez cuvantul fara prima litera
        return substring + firstLetter + "ay"; // returnez cuv fara prima litera + prima litera + ay
    } //cazul pentru prima litera consoana si sa nu se afle in consonantClusters

    private String caseCluster (String text,int numberOfCharsToBeMoved)
    {
        String substringToBeMoved = text.substring(0,numberOfCharsToBeMoved); // iau primele numberOfCharsToBeMoved caractere
        return text.substring(numberOfCharsToBeMoved) + substringToBeMoved + "ay"; //adaug primele numberOfCharsToBeMoved la final de cuv si adaug ay
    }//cazul pentru "se afla in consonant cluster",primeste ca parametru si cate litere trebuie mutate (consonant cluster
    // contine grupuri de 2 sau 3 litere

    private String fullSentence(String text)
    {
            String[] str = text.split("\\s+");//impart propozitia pe cuvinte dupa delimitatorul spatiu
            String sentence =""; // aici o sa consturiesc noua propozitie
            for (int i =0;i<str.length;i++)
                sentence = sentence + " " + translate(str[i]); // pentru fiecare cuvant din propozitie apelez metoda translate si adaug rezultatul in var unde construiesc noua propozitie
            return sentence.strip(); // scot spatiul liber de la inceputul propozitiei si de la finalul propozitiei
    }// cazul pentru full sentence
    public String translate(String text){
        String[] str = text.split("\\s+");//verific daca primesc un cuvant sau o propozitie(incerc sa impart pe cuvinte dupa delimitatorul spatiu)
        if (str.length > 1) return fullSentence(text); // daca am salvat mai sus mai mult de un cuvant (adica e propozitie) apelez cazul pentru full sentence
        if (checkFirstLetter(text)) return this.caseVowel(text); // daca nu e propozitie si e doar cuvant verific daca suntem in cazul vocala
        else {//daca nu e full sentence si nici vocala,verificam daca e cazul de cluster de consoane
                for (String item : consonantClusters) //parcurgem fiecare element din lista de clustere de consoane
                    if (text.indexOf(item) == 0) return caseCluster(text,item.length()); // verificam daca elementul din lista apare la inceputul cuvantului si daca da apelam cazul cluster

        }
        return caseConsonant(text);
    }
}
// daca nu suntem in niciunul din cazurile de mai sus,inseamna ca suntem in cazul de consoana si apelam cazul consoana
    //metoda care realizeaza efectiv traducerea