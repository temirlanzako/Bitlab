import java.util.Scanner;

public class Main12 {
      {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        asd(str);
    }
    public static void asd (String str) {
        String chars = "aeiouy";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (chars.contains(String.valueOf(str.charAt(i)))) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
