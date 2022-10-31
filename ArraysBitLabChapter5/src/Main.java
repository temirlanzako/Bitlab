public class Main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int temp = 0;
        *//*for (int j = 0; j < n; j++) {
            temp = a[0][j];
            a[0][j] = a[a.length-1][j];
            a[a.length-1][j] = temp;
        }*//*
        for (int i = 0; i < n; i++) {
            temp = a[0][i];
            a[0][i] = a[a.length-1][i];
            a[a.length-1][i] = temp;
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }*/
        int q[] = {1,2};
        int a[][][] = {{q,q,q},{q,q,q,q}};
        int result[] = a[0];

        System.out.println(result.length);
  /*      int b[][] = {{1,2,3},{4,5,6,7}};
        a = b;*/
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
        //System.out.println(a[0]);
        }
}