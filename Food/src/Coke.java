public class Coke extends Food {
    double volumeLiters;
    boolean isSparkling;

    public Coke() {
    }

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super (name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getCalories() {
        if (isSparkling == true) {
            return volumeLiters * 400;
        } else
            return volumeLiters * 100;
    }
}
