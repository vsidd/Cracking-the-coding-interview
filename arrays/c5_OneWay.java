package ctc.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Siddarthan on 21-Jan-17.
 */
public class c5_OneWay {
    public static void main(String[] args) {
        System.out.println(isOneWay("pale","ple"));
        System.out.println(isOneWay("pales","pale"));
        System.out.println(isOneWay("pale","bale"));
        System.out.println(isOneWay("pale","bake"));
    }

    public static boolean isOneWay(String input1, String input2){
        if(input1 == null && input2 == null){
            return true;
        }
        if(input1.equalsIgnoreCase(input2)){
            return false;
        }
        if(input1.length()==input2.length()){
            return editCheck(input1, input2);
        }
        if(input1.length() < input2.length()){
            return addCheck(input1,input2);
        }
        if(input1.length() > input2.length()){
            return removeCheck(input2,input1);
        }
        return true;
    }

    public static boolean editCheck(String input1, String input2){
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i = 0; i < input1.length(); i++){
            int value = 1;
            if(countMap.containsKey(input1.charAt(i))){
                value = countMap.get(input1.charAt(i));
                value += 1;
            }
            countMap.put(input1.charAt(i), value);
        }
        int editCount = 0;
        for(int i = 0; i < input1.length(); i++){
            if(!countMap.containsKey(input2.charAt(i))){
                editCount++;
            }else{
                int value = countMap.get(input2.charAt(i));
                value--;
                if(value<=-1){
                    editCount++;
                }
                if(editCount>=2){
                    return false;
                }
                countMap.put(input2.charAt(i), value);
            }
        }
        if(editCount>=2){
            return false;
        }
        return true;
    }

    public static boolean addCheck(String input1, String input2){
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i = 0; i < input1.length(); i++){
            int value = 1;
            if(countMap.containsKey(input1.charAt(i))){
                value = countMap.get(input1.charAt(i));
                value += 1;
            }
            countMap.put(input1.charAt(i), value);
        }
        int editCount = 0;
        for(int i = 0; i < input2.length(); i++){
            if(!countMap.containsKey(input2.charAt(i))){
                editCount++;
            }else{
                int value = countMap.get(input2.charAt(i));
                value--;
                if(value<=-1){
                    editCount++;
                }
                if(editCount>=2){
                    return false;
                }
                countMap.put(input2.charAt(i), value);
            }
        }
        if(editCount>=2){
            return false;
        }
        return true;
    }

    public static boolean removeCheck(String input1, String input2){
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i = 0; i < input1.length(); i++){
            int value = 1;
            if(countMap.containsKey(input1.charAt(i))){
                value = countMap.get(input1.charAt(i));
                value += 1;
            }
            countMap.put(input1.charAt(i), value);
        }
        int editCount = 0;
        for(int i = 0; i < input2.length(); i++){
            if(!countMap.containsKey(input2.charAt(i))){
                editCount++;
            }else{
                int value = countMap.get(input2.charAt(i));
                value--;
                if(value<=-1){
                    editCount++;
                }
                if(editCount>=2){
                    return false;
                }
                countMap.put(input2.charAt(i), value);
            }
        }
        if(editCount>=2){
            return false;
        }
        return true;
    }
}
