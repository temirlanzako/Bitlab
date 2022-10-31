import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] Students = new String[100];
        int i = 0;
        Scanner in = new Scanner (System.in);
        while (true) {
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");
            int select  = in.nextInt();
            if (select == 1) {
                Students = add(Students,i);
                i++;
            }
            if (select == 2) {
                for(int j = 0; j < i; j++) {
                    System.out.println(Students[j]);
                }
            }
            if (select == 0) {
                break;
            }
        }
    }
    public static String[] add(String[] Students, int i) {
        Scanner in = new Scanner(System.in);
        String name;
        String surname;
        double gpa;
        System.out.println("Insert name?");
        name = in.next();
        System.out.println("Insert surname?");
        surname = in.next();
        System.out.println("Insert GPA?");
        gpa = in.nextDouble();
        Students[i] = (name +" "+ surname +" "+ String.valueOf(gpa));
        return Students;

    }

    public void sum() {
        System.out.println(1);
    }

    public double sum(int avg) {
return  1.0;
    }

    public int sum(int x, int y) {
        System.out.println(x);
    }
}
