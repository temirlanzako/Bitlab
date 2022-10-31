import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(tre(num,num1,num2));
    }
    public static String tre (int num, int num1, int num2) {
        if(num <= num1 + num2 && num2 <= num1 + num && num1 <= num + num2) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
 //   Напишите метод, который в аргументы принимает три натуральных числа a, b, c. Определите, существует ли треугольник с такими сторонами.

 //       Если треугольник существует, выведите строку YES, иначе выведите строку NO