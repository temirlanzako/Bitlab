public abstract class Food {
    String name;

    public Food() {
    }
    public Food(String name) {
        this.name = name;
    }

    public abstract double getCalories();

    public void printCalories() {
        System.out.println("MyCalories:  " + name + getCalories());
    }
}

