public class Main {
    public static void main(String[] args) {
        Gymnast g1 = new Gymnast("Tima Mukash ", 28, "Kaz", 186, 78, "Agressor");
        Gymnast g2 = new Gymnast("Sob Rnoasd ", 23, "Bel", 178, 70, "Def");
        Gymnast g3 = new Gymnast("Valera Nastal ", 19, "Rus", 183, 773, "Crowl");

        Footballer f1 = new Footballer("Zinadin Zidan ", 31, "Fra ", "Attack ", "ManUnited");
        Footballer f2 = new Footballer("Cristiano Ronaldo ", 29, "Spa ", "Attack ", "RealMadrid");
        Footballer f3 = new Footballer("Ibrahimovic Islam ", 31, "Ger ", "Def ", "Bavaria");

        Swimmer s1 = new Swimmer("Basf aas ", 23 , "KG ", "Crowling", 12.1);
        Swimmer s2 = new Swimmer("Kniqwe qweq ", 19 , "UZ ", "Butterfly", 11.9);
        Swimmer s3 = new Swimmer("Ase Sasd ", 33 , "TJ ", "Random", 10.9);

        Sportsman[] sportsmen = {g1,g2,g3,f1,f2,f3,s1,s2,s3};

        OlympicGames o1 = new OlympicGames("Chicago ", 2020, sportsmen);
        o1.play();
    }
}
