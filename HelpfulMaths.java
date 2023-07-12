import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();

        List<Integer> arr = Arrays
                .asList(ip.split("\\+"))
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(arr);

        String output = arr.stream().map(String::valueOf).collect(Collectors.joining("+"));
        System.out.println(output);
    }
}
