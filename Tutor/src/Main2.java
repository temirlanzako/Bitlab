public class Main2 {
    public static void main(String[] args) {
        int[] inputArray = {3, 6, 7,5,7};
        int[] chavchik = new int[10];
        int j  = 5;
        for (int i = 0; i < 5; i++) {
            chavchik[j] = inputArray[i];
            j++;

        }

        for (int x = 0; x < 10; x++) {
            System.out.print(chavchik[x]);
        }

        System.out.println();

        int numericValue = Integer.parseInt("200");
        char a1 = "1+2".charAt(0);
        int in1 = Character.getNumericValue(a1);
        System.out.println(in1);
        System.out.println(numericValue);
        System.out.println("200");
    }
}
