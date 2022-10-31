import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add(in.nextInt());
        }
            IntStream.range(0, 9)
                    .filter(a -> a%2 == 0)
                    .forEach(a -> System.out.print(integers.get(a) + " "));
        }
    }