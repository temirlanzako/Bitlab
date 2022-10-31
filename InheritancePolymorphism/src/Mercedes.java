public class Mercedes extends Car {
    protected String classType;

    public Mercedes() {
        super();
        this.classType = "No ClassType";
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public void ride() {
        System.out.println("Name: " + name + "Model: " + model + "maxSpeed: " + maxSpeed + "Year: " + year +
                "Volume: " + volume + "classType: " + classType);
    }
}
