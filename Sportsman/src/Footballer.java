public class Footballer extends Sportsman {
    protected String position;
    protected String club;

    public Footballer() {
    }
    public Footballer(String fullname, int age, String country, String position, String club) {
        super (fullname, age, country);
        this.position = position;
        this.club = club;
    }
    public void play() {
        System.out.println("Fullname: " + fullname + "Age: " + age + "Country: " + country +
                "Position: " + position + "club: " + club);
    }
}
