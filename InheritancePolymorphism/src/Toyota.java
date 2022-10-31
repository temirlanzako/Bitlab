public class Toyota extends Car {
    protected String manufacturer;

    public Toyota() {
        super();
        manufacturer = "No manufacturer";
    }

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public void ride() {
        System.out.println("Name: " + name + "Model: " + model + "maxSpeed: " + maxSpeed + "Year: " + year +
                "Volume: " + volume + "Manufacturer: " + manufacturer);
    }
}
