import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int op = 0;
        for (int i = 0; i < no; i++) {
            String statement = sc.next();
            op = (statement.charAt(1) == '+') ? op + 1 : op - 1;
        }
        System.out.println(op);
    }
}
