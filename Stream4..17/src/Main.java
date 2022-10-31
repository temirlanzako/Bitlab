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
        int sum = IntStream
                .range(0, n)
                .filter(i -> i % 2 == 0)
                .filter(i -> integers.get(i) != 0)
                .map(i -> integers.get(i))
                .reduce(1,(a,b) -> a*b);
        System.out.println(sum);
    }
}
