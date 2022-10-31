public class FerrariEngine extends Engine {
    public FerrariEngine() {
    }
    public FerrariEngine(double x,int y, double z){
        super(x,y,z);
    }
    public double efficiency() {
        return 0.25;
    }
    public double throttleEnergy() {
        return engineVolume * cyclinderAmount * 100;
    }

    @Override
    public double breakEnergy() {
        return engineWeight * 2;
    }
}