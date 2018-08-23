import java.util.Arrays;
import java.util.List;

/**
 * ClosureExample.java
 *
 * @author g106108 (Garrett Griffin)
 * @since 8/3/18
 */
public class ClosureExample {
    public static void main(String args[]) {
       System.out.println(countCode("aafesssscodescodescose"));
        System.out.println(endOther("aafesssscodescodescose", "afesssscodescodescose"));


    }

    public static int countCode(String str) {
        int count = 0;
        for(int i= 0; i < str.length()-3; i++){
            if(str.substring(i, i+2).equals("aa") && str.charAt(i + 3) == 'e'){
                count++;
            }
        }
        return count;

    }

    public static boolean endOther(String a, String b) {
        if(a.length() < b.length()) {
            String temp = a;
            a = b.toLowerCase();
            b = temp.toLowerCase();
        }

        return a.substring(a.length() - b.length()).equals(b);
    }
}
