package ctc.arrays;

/**
 * Created by Siddarthan on 21-Jan-17.
 */
public class c6_StringCompression {
    public static void main(String[] args) {
        System.out.println(stringCompression("aaabaaaaccaaaaba"));
    }
    public static String stringCompression(String input){
        if(input == null || input.length() <= 2){
            return input;
        }
        input = input.toLowerCase();
        int count = 1;
        StringBuilder compressedString = new StringBuilder();
        for(int i = 0; i < input.length()-1; i++){
            if(input.charAt(i)==input.charAt(i+1)){
                count++;
            }else{
                if(count > 1){
                    compressedString.append(input.charAt(i));
                    compressedString.append(count);
                    count = 1;
                }else{
                    compressedString.append(input.charAt(i));
                }
            }
        }
        compressedString.append(input.charAt(input.length()-1));
        if(count>1){
            compressedString.append(count);
        }
        String returnString = compressedString.length()<input.length()? compressedString.toString() : input;
        return returnString;
    }
}
