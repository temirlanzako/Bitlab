public class Main {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("It is an alien, and I should run away");
        }
        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) { // && - AND operator//
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > secondTopScore) || (topScore < 100)) { // || -  OR operator
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is TRUE");
            boolean isCar = false;
            if (!isCar) {
                System.out.println("sadsada"); // ! - checking if boolean is false
            }
            isCar = true;
            boolean wasCar = isCar ? true : false;
            if (wasCar) {
                System.out.println("wasCar is true");
            }
        }
    }
}