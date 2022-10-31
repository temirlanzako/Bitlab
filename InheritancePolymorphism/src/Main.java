public class Main {
    public static void main(String[] args) {
        Car c1 = new Car ("Honda ", "CR_V ", 120 , 1995 , 180.0 );
        Car c2 = new Car ("Honda ", "HR_V ", 130 , 2000 , 155.0 );
        Car c3 = new Car ("Honda ", "Odyssey ", 180 , 2018 , 240.0 );

        Toyota t1 = new Toyota ("Toyota ", "Camry ", 350 , 1991 , 530.0 , "Japan");
        Toyota t2 = new Toyota ("Toyota ", "Corolla ", 190 , 2001 , 160.0 , "Japan");
        Toyota t3 = new Toyota ("Toyota ", "Highlander ", 300 , 2019 , 229.0 , "Japan");

        Mercedes m1 = new Mercedes("Mercedes ", "E200 ", 180 , 1998 ,243.0 , "E ");
        Mercedes m2 = new Mercedes("Mercedes ", "E250 ", 200 , 2016 ,245.0 , "E ");
        Mercedes m3 = new Mercedes("Mercedes ", "E350 ", 213 , 2001 ,323.0 , "E ");

        Car cars[] = {c1,c2,c3,t1,t2,t3,m1,m2,m3};
        for(int i = 0; i < cars.length; i++) {
            cars[i].ride();
        }
    }
}
