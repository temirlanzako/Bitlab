public class Gymnast extends Sportsman {
   protected int height;
   protected int weight;
   protected String style;

    public Gymnast(){
    }
    public Gymnast(String fullname, int age, String country, int height, int weight, String style) {
        super (fullname,age,country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }
    public void play() {
        System.out.println("Fullname: " + fullname + "Age: " + age + "Country: " + country +
                "Height: " + height + "Weight: " + weight + "Style: " + style);
    }
}
