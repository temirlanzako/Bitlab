public class CubeGold extends GoldShape {
    double side;

    public CubeGold() {
    }

    public CubeGold( double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }
}
