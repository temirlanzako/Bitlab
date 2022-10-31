public class main3 {
    public static void main(String[] args) {
        int a[] = {12, 12, 12, 1};
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                if (a[i] < a[i + 1]) {
                    a[i + 1] = a[i];
                }
            }

        }

        System.out.println(a[a.length - 1]);
    }
}
// && - AND
// || - OR
