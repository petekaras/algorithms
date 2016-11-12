/**
 * Created by peter on 11/4/16.
 */
public class Palindrome {

    public boolean isPalendrome(String word){
        if(word.length() <= 1){
            return true;
        }
        if(word.charAt(0) == word.charAt(word.length()-1)) {
            String trimmedWord = word.substring(1, word.length() - 1);
            return isPalendrome(trimmedWord);
        }else{
            return false;
        }

    }
}
