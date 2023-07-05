import java.util.Scanner;

public class WayToLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for (int i = 0; i < no; i++) {
            String ip = sc.next();
            if (ip.length() > 10) {
                String op = new String();
                StringBuilder sb = new StringBuilder();
                sb.append(ip.charAt(0));
                sb.append(Integer.toString(ip.length() - 2));
                sb.append(ip.charAt(ip.length() - 1));
                System.out.println(sb);
                continue;
            }
            System.out.println(ip);
        }
    }
}