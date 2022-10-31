import java.io.*;
import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str1 = in.next();
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
    }
}