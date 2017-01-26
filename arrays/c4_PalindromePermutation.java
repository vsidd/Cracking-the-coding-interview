package ctc.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Siddarthan on 21-Jan-17.
 */
public class c4_PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(palindromePermutation("tact coa"));
    }

    public static boolean palindromePermutation(String input){
        if(input == null || input.length() <=1 ){
            return true;
        }
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i = 0; i < input.length(); i ++){
            if(input.charAt(i) != ' '){
                int value = 1;
                if(countMap.containsKey(input.charAt(i))){
                    value = countMap.get(input.charAt(i));
                    value += 1;
                }
                countMap.put(input.charAt(i), value);
            }
        }
        int oddCount = 0;
        for(Character ch : countMap.keySet()){
            int value = countMap.get(ch);
            if(value %2 != 0){
                oddCount++;
                if(oddCount >=2){
                    return false;
                }
            }
        }
        return true;
    }
}
