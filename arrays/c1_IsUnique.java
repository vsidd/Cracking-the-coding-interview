package ctc.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Siddarthan on 21-Jan-17.
 */
public class c1_IsUnique {
    public static void main(String[] args) {
        System.out.println(isUniqueByBits("abc"));
    }

    public static boolean isUnique(String input){
        if(input==null || input.length()==0){
            return true;
        }
        Set<Character> charSet = new HashSet<>();
        for(int i = 0;i < input.length(); i++){
            if(charSet.contains(input.charAt(i))){
                return false;
            }
            charSet.add(input.charAt(i));
        }
        return true;
    }

    //assume upper and lower characters are same
    public static boolean isUniqueByBits(String input){
        if(input==null || input.length()==0){
            return true;
        }
        input = input.toLowerCase();
        int charSet = 0;
        for(int i = 0; i < input.length(); i++){
            int charVal = input.charAt(i) - 'a';
            int bitSet = 1<<charVal;
            if((charSet & bitSet) != 0){
                return false;
            }
            charSet = charSet | bitSet;
        }
        return true;
    }
}
