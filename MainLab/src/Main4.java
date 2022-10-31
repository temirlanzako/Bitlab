import java.util.Scanner;

public class Main4 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Insert name: ");
        String name = in.next();
        System.out.println("Insert surname: ");
        String surname = in.next();
        System.out.println("Insert your age: ");
        int age = in.nextInt();
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("age: " + age);
    }
}