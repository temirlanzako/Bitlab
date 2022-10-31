import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int array[] = new int [a];
        for (int i = 0; i < a; i++) {
            array[i] = in.nextInt();
        }
        sum(array);
    }
    public static void sum(int[]array) {
        int average = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                count++;
                average+=array[i];
            }
        }
        System.out.println(average/count);
    }
}
