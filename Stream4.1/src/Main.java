import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] nums={6,19,26,9,46,8,5,65,90,25};

        IntStream
                .range(0,10)
                .filter(i -> i==n)
                .forEach(i -> System.out.println(nums[i]));

    }
}