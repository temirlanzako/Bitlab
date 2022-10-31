import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add(in.nextInt());
        }
        int min = integers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min * min);
    }
}