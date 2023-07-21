import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        StringBuilder builder = new StringBuilder(ip.length());
        builder.append(Character.toUpperCase(ip.charAt(0)));
        for (int i = 1; i < ip.length(); i++) {
            builder.append(ip.charAt(i));
        }
        System.out.println(builder);
    }
}
