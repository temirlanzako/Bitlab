import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User[] userData = new User[5];
        for (int i = 0; i < userData.length; i++) {
            Scanner in =  new Scanner (System.in);
            System.out.println("ENTER NAME");
            String name = in.nextLine();
            System.out.println("ENTER SURNAME");
            String surname = in.nextLine();
            System.out.println("ENTER AGE");
            int age;
            try {
                age = Integer.parseInt(in.next());
            }
            catch (Exception e){
                age = 0;
            }
            userData[i] = new User(name, surname, age);
        }
        for (int i = 0; i < userData.length; i++) {
            System.out.println(userData[i].userData());
        }
        int sum = 0;
        int avg;
        for (int i = 0; i < userData.length; i++) {
            sum = userData[i].age + sum;
        }
        avg = sum/5;
        System.out.println(avg);
    }
 }
