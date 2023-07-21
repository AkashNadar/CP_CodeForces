import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        Set<Character> charSet = ip.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
        if ((charSet.size() % 2) == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
