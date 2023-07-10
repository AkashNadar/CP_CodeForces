import java.util.Arrays;
import java.util.Scanner;

public class PetyaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();
        // int num1 = getValueFromArr(str1.toCharArray());
        // int num2 = getValueFromArr(str2.toCharArray());
        // if (num1 < num2) {
        // System.out.println("-1");
        // } else if (num1 > num2) {
        // System.out.println("1");
        // } else {
        // System.out.println("0");
        // }
        System.out.println(compareStr(str1, str2));
    }

    public static String compareStr(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) < str2.charAt(i))
                return "-1";
            if (str1.charAt(i) > str2.charAt(i))
                return "1";
        }
        return "0";
    }

}

// public static int getValueFromArr(char[] arr) {
// Arrays.sort(arr);
// int res = 0;
// for (int i = 0; i < arr.length; i++) {
// res = res + arr[i];
// System.out.println(arr[i] + " :- " + res);
// }
// System.out.println(res);
// return res;
// }
