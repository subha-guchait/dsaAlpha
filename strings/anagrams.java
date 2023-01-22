import java.util.*;

// Anagram: when teo string contains same charecter but in diffrent order. Ex: race and care

public class anagrams {
    public static boolean chkAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            if (Arrays.equals(str1charArray, str2charArray)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(chkAnagrams("amit", "imta"));
        System.out.println(chkAnagrams("amita", "imta"));
        System.out.println(chkAnagrams("amit", "mang"));
        System.out.println(chkAnagrams("amit", "tima"));
        
    }
}
