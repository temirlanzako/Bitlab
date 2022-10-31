public class Main {
    public static void main(String[] args) {
        FerrariEngine fE1 = new FerrariEngine(23.0, 12, 12.0);
        FerrariEngine fE2 = new FerrariEngine(12.1, 35, 22.1);
        FerrariEngine fE3 = new FerrariEngine(19.0, 41, 15.0);
        FerrariEngine fE4 = new FerrariEngine(21.3, 12, 11.3);
        FerrariEngine fE5 = new FerrariEngine(22.7, 3, 18.0);

        RenaultEngine rE1 = new RenaultEngine(19.1, 12, 42.1);
        RenaultEngine rE2 = new RenaultEngine(28.6, 12, 32.3);
        RenaultEngine rE3 = new RenaultEngine(18.2, 12, 31.1);
        RenaultEngine rE4 = new RenaultEngine(23.1, 12, 22.2);
        RenaultEngine rE5 = new RenaultEngine(12.3, 12, 12.7);

        Engine[] allEngines = new Engine[10];
        allEngines[0] = fE1;
        allEngines[1] = fE2;
        allEngines[2] = fE3;
        allEngines[3] = fE4;
        allEngines[4] = fE5;
        allEngines[5] = rE1;
        allEngines[6] = rE2;
        allEngines[7] = rE3;
        allEngines[8] = rE4;
        allEngines[9] = rE5;

        for(int i = 0; i < allEngines.length; i++) {
            System.out.println(allEngines[i].getMaxSpeed());
        }
    }
}

