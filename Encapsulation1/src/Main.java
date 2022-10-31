public class Main {
    public static void main(String[] args) {
        Phone[] phones = new Phone[10];
        phones[0] = new Phone("Iphone", "13", 800, 2);
        phones[1] = new Phone("Iphone", "12 pro max", 1100, 1);
        phones[2] = new Phone("Samsung", "Galaxy10s", 200, 32);
        phones[3] = new Phone("Xyaomi", "Myami", 300, 64);
        phones[4] = new Phone("Nokia", "6230Gold", 800, 512);
        phones[5] = new Phone("SonyEricson", "z250", 100, 256);
        phones[6] = new Phone("Sony", "Vaernik", 200, 128);
        phones[7] = new Phone("LG", "Qwennn", 722, 1);
        phones[8] = new Phone("Samsung", "Galaxy9", 250, 2);
        phones[9] = new Phone("Iphone", "8", 700, 5);
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getCategory().equalsIgnoreCase("TOP") || phones[i].getCategory().equalsIgnoreCase("Simple")) {
                System.out.println(phones[i].getName() + ": " + phones[i].getCategory());
            }
        }
    }
}
public class Phone {
    private String name;
    private String model;
    private int price;
    private int memory;

    public Phone(String name, String model, int price, int memory) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void getPrice(int getPrice) {
        this.price = price;
    }

    public int setMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getCategory() {
        if (price >= 1000) {
            return  "TOP";
        }
        if (price < 1000 && price >= 500) {
            return  "Medium";
        }
        if (price < 500) {
            return "Simple";
        }
        return null;
    }

}
