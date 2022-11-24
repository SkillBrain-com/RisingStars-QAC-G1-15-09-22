
public class PigLatinTranslator{
    String translate(String source){
        String[] words = source.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            if (result.toString().isBlank()) {
                result = new StringBuilder(getWord(w));
            } else {
                result.append(" ").append(getWord(w));
            }
        }
        return result.toString();
    }
    private static String getWord(String source) {
        int i;
        char lastChar = 0;
        for (i=0; i< source.length(); i++){
            char currentChar = source.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'){
              break;
           }
            if (currentChar == 'y' && lastChar != 0){
                break;
            }
            if (currentChar == 'u'){
                if (lastChar != 'q') {
                    break;
                }
            }
            if (currentChar == 't'){
                if (lastChar == 'y'){
                    i = 0;
                    break;
                }
            }
            if (currentChar == 'r'){
                if (lastChar == 'x'){
                    i=0;
                    break;
                }
            }
            lastChar = currentChar;
        }
        return source.substring(i) + source.substring(0, i) + "ay";
    }
}