import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int ar[][] = new int[a][a];
        for (int i =0; i<ar.length; i++) {
            for (int j=0; j<ar.length; j++) {
                ar[i][j] = in.nextInt();
            }
        }

        asd(ar);
    }
    public static void asd (int[][] ar) {
        for(int j = 0; j <ar.length; j++){
            int temp = ar[0][j];
            ar[0][j] = ar[ar.length -1][j];
            ar[ar.length - 1][j] = temp;

        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
