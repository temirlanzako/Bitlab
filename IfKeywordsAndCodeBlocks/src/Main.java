public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 3400;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        calculateScore(true, 3400, 5,100);

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);
        }

        int score2 = 10000;
        int levelCompeleted2 = 8;
        int bonus2 = 200;

        if (gameOver == true) {
            int finalScore2 = score2 + (levelCompeleted2 * bonus2);
            System.out.println("Your final score2 was = " + finalScore2);
        }

    }
    public static void calculateScore (boolean gameOver, int score, int levelCompleted, int bonus);
}