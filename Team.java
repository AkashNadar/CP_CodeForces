import java.util.Scanner;
import java.util.regex.Pattern;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        int problems = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < problems; i++) {
            String problemsKnown = sc.nextLine();
            // Add digits seperated by space " " in string
            int sum = Pattern.compile(" ").splitAsStream(problemsKnown).mapToInt(Integer::parseInt).sum();
            if (sum >= 2)
                op++;
        }
        System.out.println(op);
    }
}
