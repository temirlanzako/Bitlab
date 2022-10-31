package Theme_Class;

public class Main {
    public static void main(String[] args) {
        Phone h1 = new Phone();
        Phone h2 = new Phone("Iphone", "13ProMAx", 200);
        System.out.println(h1.getData());
        System.out.println(h2.getData());
    }
}
    public class Phone {
        String name;
        String model;
        int price;

        public Phone() {
            this.name = "No name";
            this.model = "No model";
            this.price = 0;
        }

        public Phone(String name, String model, int price) {
            this.name = name;
            this.price = price;
            this.model = model;
        }

        public String getData() {
            return "Name: " + name +
                    ",Price: " + price +
                    ",Model: " + model;
        }
}