package ctc.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Siddarthan on 21-Jan-17.
 */
public class c2_CheckPermutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("aaabb","aabbb"));
    }

    public static boolean isPermutation(String input1, String input2){
        if(input1==null && input2==null){
            return true;
        }
        if(input1.length()==0 && input2.length()==0){
            return true;
        }
        if(input1.length() != input2.length()){
            return false;
        }
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i = 0; i < input1.length(); i++){
            int value = 1;
            if(countMap.containsKey(input1.charAt(i))){
                value = countMap.get(input1.charAt(i));
            }
            countMap.put(input1.charAt(i),value);
        }
        int count = countMap.size();
        for(int i = 0; i < input2.length(); i++){
            if(!countMap.containsKey(input2.charAt(i))){
                return false;
            }
            int value = countMap.get(input2.charAt(i));
            value -= 1;
            if(value < 0){
                return false;
            }
            countMap.put(input2.charAt(i), value);
        }
        return true;
    }
}
