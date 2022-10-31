public class Main {
    public static void main(String[] args) {
        Player[] Players1 = new Player[7];
        //Players1[0] = new Player();
        Players1[1] = new Player(1, "Baba", "Roba", "Def");
        Players1[2] = new Player(2, "Nadal", "Rafael", "GoalKeeper");
        Players1[3] = new Player(3, "Federe", "Roger", "Def");
        Players1[4] = new Player(4, "Stanislav", "Wawrrinka", "Attack");
        Players1[5] = new Player(5, "Alexander", "Golubev", "SemiDef");
        Player[] Players = new Player[6];
        Players[1] = new Player(1, "Ismail", "Dodgev", "Def");
        Players[2] = new Player(2, "Housein", "Rodrigez", "GoalKeeper");
        Players[3] = new Player(3, "Fedya", "Rogeeer", "Def");
        Players[4] = new Player(4, "Stanislav", "Wawrrinka", "Attack");
        Players[5] = new Player(5, "Kurmangazy", "Gereev", "SemiDef");

        Club[] Clubs = new Club[2];
        Clubs[0] = new Club("Real Madrid", "Spain", 1, Players1);
        Clubs[1] = new Club("Barcelona", "Spain", 2, Players);
        for (int j = 0; j < 2; j++) {
            Clubs[j].printClubData();
        }
    }
}

    class Player {
        int number;
        String name;
        String surname;
        String position;

        public Player() {
            this.number = 0;
            this.name ="No name";
            this.surname = "No surname";
            this.position = "No position";
        }
        public  Player(int number, String name, String surname,String position) {
            this.number = number;
            this.name = name;
            this.surname = surname;
            this.position = position;
        }
        public String toString() {
            return number +" "+ name +" "+ surname +" "+ position;
        }
    }
    class Club {
    String name;
    String country;
    int ratingPoints;
    Player[] players;

        public Club(String name, String country, int ratingPoints, Player[] players) {
            this.name = name;
            this.country = country;
            this.ratingPoints = ratingPoints;
            this.players = players;
        }
        public void printClubData(){
            System.out.println(name +" "+country+" "+ratingPoints);
            for(int i = 0; i < players.length; i++) {
                System.out.println(players[i]);
            }

        }
    }
