import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        int index = 0;
        for(int i =0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) == true) {
                index++;
            }
        }
        System.out.println(index);
    }
}
