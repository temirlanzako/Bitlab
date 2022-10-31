public abstract class Engine {
    protected double engineVolume;
    protected int cyclinderAmount;
    protected double engineWeight;

    public Engine() {
    }

    public Engine(double engineVolume, int cyclinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cyclinderAmount = cyclinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCyclinderAmount() {
        return cyclinderAmount;
    }

    public void setCyclinderAmount(int cyclinderAmount) {
        this.cyclinderAmount = cyclinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }

    public abstract double efficiency();

    public abstract double throttleEnergy();

    public abstract double breakEnergy();

    public double getMaxSpeed() {
        return (throttleEnergy() - breakEnergy() * efficiency());
    }
}
