/**
 * Created by peter on 11/24/16.
 */
public class Palindrome2 {

        public static boolean isPalindrome(String word) {
            while(word.length() > 1){
                word = word.toLowerCase();
                String first = word.substring(0,1);
                String last = word.substring(word.length()-1,word.length());
                word = word.substring(1,word.length()-1);
                if(!first.equals(last)){
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            System.out.println(Palindrome2.isPalindrome("Deleveled"));
        }

}
