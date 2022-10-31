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
        double average = integers.stream()
                .mapToInt(element->element)
                .average().getAsDouble();
        integers.stream()
                .mapToInt(i -> i)
                .filter(i -> i > average)
                .forEach(i -> System.out.print(i + " "));
    }
}