package Phone1;

public class Main {
    public static void main(String[] args) {
        Phone h1 = new Phone("Iphone", "7 SE", +100);
        System.out.println(h1.getData());
        Phone h2 = new Phone("Iphone", "8 ", +120);
        System.out.println(h2.getData());
        Phone h3 = new Phone("Iphone", "10 Pro Max", +234);
        System.out.println(h3.getData());
        Phone h4 = new Phone("Iphone", "11 Pro", +145);
        System.out.println(h4.getData());
        Phone h5 = new Phone("Iphone", "12 Pro Max", +250);
        System.out.println(h5.getData());
    }
}

    class Phone {
        String name;
        String model;
        int price;

        public Phone(String name, String model, int price) {
            this.name = name;
            this.price = price;
            this.model = model;
        }

        public String getData() {
            return " Name: " + name +
                    ", Price: " + price +
                    ", Model: " + model;
        }
    }