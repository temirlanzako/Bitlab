public class Main {
    public static void main(String[] args) {
        double variable1 = 20.00d;
        double variable2 = 80.00d;
        double variable3 = (variable1 + variable2) * 100.00;
        System.out.println("Total value is equal to = " + variable3);
        double theRemainder = variable3 % 40d;
        System.out.println("theRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got Some Remainder");
        }










    }
}