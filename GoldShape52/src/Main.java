public class Main {
    public static void main(String[] args) {
        SphereGold sg1 = new SphereGold(25.0);
        SphereGold sg2 = new SphereGold(23.0);
        SphereGold sg3 = new SphereGold(25);

        CubeGold cg1 = new CubeGold(23.0);
        CubeGold cg2 = new CubeGold(25.3);
        CubeGold cg3 = new CubeGold(27.1);

        GoldShape[] shapes = new GoldShape[6];
        shapes[0] = sg1;
        shapes[1] = sg2;
        shapes[2] = sg3;
        shapes[3] = cg1;
        shapes[4] = cg2;
        shapes[5] = cg3;

//        double volumnes = 0;
        for(int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getPrice());
        }
    }
}

