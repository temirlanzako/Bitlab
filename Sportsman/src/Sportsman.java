public class Sportsman {
    protected String fullname;
    protected int age;
    protected String country;

    public Sportsman() {
        this.fullname = "No fullname";
        this.age = 0;
        this.country = "No Country";
    }
    public Sportsman(String fullname, int age, String country) {
        this.fullname = fullname;
        this.age = age;
        this.country = country;
    }

    public void play() {
        System.out.println("Fullname: " + fullname + "Age: " + age + "Country: " + country);
    }
}
