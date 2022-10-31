public class Burger extends Food {
    int meatAmount;
    int meatType;

    public Burger() {
    }

    public Burger(String name, int meatType, int meatAmount) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;

    }

    public double getCalories() {
        while (true) {
            if (meatType == 1) {
                return meatAmount * 840;
            }
            if (meatType == 2) {
                return meatAmount * 560;
            }
            if (meatType != 1 || meatType != 2 || meatAmount != 1 || meatAmount != 2 || meatAmount !=3) {
                return 0;
            }
        }
    }
}
