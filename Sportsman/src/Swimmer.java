public class Swimmer extends Sportsman {
    protected String style;
    protected double recordTime;

    public Swimmer() {
    }
    public Swimmer(String fullname, int age, String country, String style, double recordTime) {
        super(fullname, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }
    public void play() {
        System.out.println("Fullname: " + fullname + "Age: " + age + "Country: " + country +
                "Style: " + style + "RecordTime: " + recordTime);
    }
}
