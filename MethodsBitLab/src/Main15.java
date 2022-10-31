import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] ar = new int[a];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();
        }
        asd(ar);

    }

    public static void asd(int[] ar) {
        int max = ar[0];
        int min = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
            if (min > ar[i]) {
                min = ar[i];

            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
   // Создайте такой метод, который принимает в аргументы массив целостных чисел.
   //     Выведите минимальный элемент и максимальный элемент массива.