import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList <Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add(in.nextInt());
        }
        int sum = integers.stream()
                .reduce(0, (a,b) -> a + b);
        double average = sum / n;
        System.out.println(sum + " " + average);
    }
}