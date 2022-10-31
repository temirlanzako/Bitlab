import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        String operators = "+-/*";
        int index = 0;
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < str.length(); i++){
            if(operators.contains(String.valueOf(str.charAt(i)))) {
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            str1 = str1 + str.charAt(i);
        }
        for (int i = index+1; i < str.length(); i++) {
            str2 = str2 + str.charAt(i);
        }
        if (str.charAt(index) == '+') {
            System.out.print(Integer.parseInt(str1 ) + Integer.parseInt(str2));
        }
        else if (str.charAt(index) == '-') {
            System.out.println(Integer.parseInt(str1) - Integer.parseInt(str2));
        }
        else if (str.charAt(index) == '*') {
            System.out.println(Integer.parseInt(str1) * Integer.parseInt(str2));
        }
        else if (str.charAt(index) == '/') {
            System.out.println(Integer.parseInt(str1) / Integer.parseInt(str2));
        }
    }
}


//        String[] str1 = in.next().split("//s");
//
//        char[] operators = new char [4];
//        int sum = 0;
//        if ("+" == str1[1]) {
//            sum = Integer.parseInt(String.valueOf(str1[0])) + Integer.parseInt(String.valueOf(str1[2]));
//        } else if (operators[1] == str1.charAt(i)) {
//            sum = Integer.parseInt(String.valueOf(str1.charAt(0))) - Integer.parseInt(String.valueOf(str1.charAt(2)));
//        } else if (operators[2] == str1.charAt(i)) {
//            sum = Integer.parseInt(String.valueOf(str1.charAt(0))) * Integer.parseInt(String.valueOf(str1.charAt(2)));
//        } else if (operators[3] == str1.charAt(i)){
//            sum = Integer.parseInt(String.valueOf(str1.charAt(0))) / Integer.parseInt(String.valueOf(str1.charAt(2)));
//        }
//
