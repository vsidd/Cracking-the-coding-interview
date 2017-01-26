package ctc.arrays;

/**
 * Created by Siddarthan on 21-Jan-17.
 */
public class c3_URLify {

    public static void main(String[] args) {
        System.out.println(urlLify("Mr John Smith    "));
    }
    public static String urlLify(String input){
        char[] str = input.toCharArray();
        int k = str.length-1;
        int j = str.length-1;
        while(str[k]==' '){
            k--;
        }
        for(int i = k; i >= 0;i--){
            str[j] = str[i];
            str[i] = ' ';
            j--;
        }
        int i = 0;
        j++;
        for(; j < str.length-1; j++){
            if(str[j]==' '){
                str[i] = '%';
                str[++i] = '2';
                str[++i] = '0';
            }else{
                str[i] = str[j];
            }
            i++;
        }
        return new String(str);
    }
}
