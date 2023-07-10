import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 1;
        int col = 1;
        for (col = 1; col <= 5; col++) {
            if (sc.nextInt() == 1) {
                break;
            }

            if (col == 5) {
                row++;
                col = 0;
            }
        }
        System.out.println(Math.abs(row - 3) + Math.abs(col - 3));
    }
}
