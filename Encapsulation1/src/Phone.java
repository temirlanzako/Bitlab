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
