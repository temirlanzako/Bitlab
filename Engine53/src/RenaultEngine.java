public class RenaultEngine extends Engine {
    double extraTurboEnergy;

    public RenaultEngine() {
    }

    public RenaultEngine(double x, int y, double z) {
        super(x, y, z);
    }

    @Override
    public double efficiency() {
        return 0.27;
    }

    public double throttleEnergy() {
        return engineVolume * cyclinderAmount * 110 + extraTurboEnergy;
    }

    @Override
    public double breakEnergy() {
        return engineWeight * 2.1;
    }
}
