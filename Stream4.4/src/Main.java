import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            integers.add(in.nextInt());
        }
            integers.stream()
                    .filter(a -> a > 0)
                    .forEach(a -> System.out.print(a + " "));
    }
}