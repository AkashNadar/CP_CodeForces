
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> arr = Arrays.asList(input.split(" "));
        int totalArea = Integer.parseInt(arr.get(0)) * Integer.parseInt(arr.get(1));
        System.out.println(totalArea / 2);
    }
}
