import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        List<String> initialInput = Arrays.asList(ip.split(" "));
        int k = Integer.parseInt(initialInput.get(initialInput.size() - 1));
        int noOfPlayers = ip.charAt(0);
        String playerResults = sc.nextLine();
        // Arrays.stream(playerResults.split("
        // ")).mapToInt(Integer::parseInt).forEach(element -> {
        // if (element > k)
        // op++;
        // });
        List<String> res = Arrays.asList(playerResults.split(" "));
        int baseTarget = Integer.parseInt(res.get(k - 1));
        for (String r : res) {
            if (Integer.parseInt(r) >= baseTarget && Integer.parseInt(r) > 0)
                op++;
        }
        System.out.println(op);
    }
}
