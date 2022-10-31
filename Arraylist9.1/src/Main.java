import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Players> players = new ArrayList<>();
        players.add(new Players("Andery", 123.00, 20));
        players.add(new Players("Nordik", 123.57, 45));
        players.add(new Players("Aigerim", 12123.00, 12));
        players.add(new Players("Andery", 123.00, 20));
        players.add(new Players("Andery", 123.00, 20));
        players.add(new Players("Nusret", 18658.00, 22));
        players.add(new Players("Andery", 123.00, 20));
        players.add(new Players("Andery", 123.00, 20));
        players.add(new Players("Andery", 123.00, 20));
        players.add(new Players("RAmzik", 15675.00, 12));

        double average;
        int sumAge = 0;
        double sumPrice = 0;

        for (int i = 0; i < players.size(); i++) {
            sumPrice = sumPrice + players.get(i).getPrice();
            sumAge = sumAge + players.get(i).getAge();
        }
        average = sumPrice / players.size();
        System.out.println("AVERAGE PRICE = " + average + "__" +  "SUM AGE = " + sumAge);
    }
}

