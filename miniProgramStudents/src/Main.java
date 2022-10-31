import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PRESS[1] TO ADD STUDENT");
        System.out.println("PRESS[2] TO LIST STUDENT");
        System.out.println("PRESS[0] TO EXIT");
        int[] ar = new int[2];
        String temp = "";
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();
            while(true){
                if (ar[i] == 1) {
                    System.out.println("Insert name: ");
                    String name = in.nextLine();
                    System.out.println("Insert surname: ");
                    String surname = in.nextLine();
                    System.out.println("Insert GPA: ");
                    Double gpa = in.nextDouble();
                    if (ar[i] == 2) {
                        temp = name +" "+ surname +" "+ gpa.toString();
                        System.out.println(temp);
                    }
                    if (ar[i] == 0) {
                        break;
                    }
                }

            }
        }
    }
}
/*

    public static void asd () {

    }
}

public class Main {
    public static void main(String[] args) {
        Student[] Students = new Student[9];
        // Students[0] = new Student();
        Students[0] = new Student(112, "John", "Smith", 2.5);
        Students[1] = new Student(123, "Viktor", "Babushka", 3.2);
        Students[2] = new Student(124, "Ilyas", "Nursultanov", 3.8);
        Students[3] = new Student(125, "Hasan", "Masanov", 4.0);
        Students[4] = new Student(126, "Mari", "Kasanov", 1.0);
        Students[5] = new Student(127, "Kasan", "Nasanov", 2.3);
        Students[6] = new Student(128, "Masan", "Dasanov", 1.8);
        Students[7] = new Student(129, "Nasan", "Sasanov", 3.1);
        Students[8] = new Student(130, "Uasan", "Rasanov", 4.0);
    }
}*/
