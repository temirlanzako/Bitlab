public class Players {
    private String name;
    private double price;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPprice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Players() {
    }
    public Players (String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }
}
