public class Main {
    public static void main(String[] args) {
        Chocolate snickers = new Chocolate("snickers  ", 15);
        Chocolate twix = new Chocolate("twix  ", 18);

        Coke cocaCola = new Coke("Cola  ", 500, true);
        Coke fuse = new Coke("Fuse  ", 500, false);

        Burger burgerKing = new Burger("burgerKing  ",1, 2);
        Burger mcDonalds = new Burger("mcDonalds  ",2, 3);

        Food type[]  = new Food[6];
        type[0] = snickers;
        type[1] =twix;
        type[2] = cocaCola;
        type[3] = fuse;
        type[4] = burgerKing;
        type[5] = mcDonalds;

        for (int i = 0; i < type.length; i++) {
            type[i].printCalories();
        }
    }
}
