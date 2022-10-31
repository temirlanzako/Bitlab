import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     String[] students = new String[100];
     String[] staffs = new String[100];
     int i = 0;
     int u = 0;
     Scanner in = new Scanner(System.in);
     while (true) {
         System.out.println("PRESS [1] ADD USER");
         int a = in.nextInt();
         if(a == 1){
             System.out.println("PRESS [1] TO ADD STUDENT");
             System.out.println("PRESS [2] TO ADD STAFF");
             int stdstf = in.nextInt();
             if (stdstf == 1){
                 students = addStd(students, i);
                 i++;
             }
             if (stdstf == 2) {
                 staffs = addStf(staffs, u);
                 u++;
             }
         }
         if (a == 2) {
             System.out.println("PRESS [2] TO LIST USERS");
             int b = in.nextInt();
             while(true){
             if (b == 2) {
                 System.out.println("PRESS [1] TO LIST STUDENTS");
                 System.out.println("PRESS [2] TO LIST STAFF");
                 int list = in.nextInt();
                 if (list == 1) {
                     for(int j = 0; j < i; j++) {
                         System.out.println(students[j]);
                     }
                 }
                 if (list == 2) {
                     for(int k = 0; k < u; k++) {
                         System.out.println(staffs[k]);
                            }
                         }
                     }
             if (b != 2) {
                 System.out.println("PRESS [0] TO EXIT");
                 int c  = in.nextInt();
                 if(c == 0){
                     break;
                 }
             }
                }
            }
         }
    }

    public static String[] addStd(String[] students, int j) {
        String student;
        Scanner in = new Scanner(System.in);
        student = in.nextLine();
        students[j] = new String (student);
        return students;
    }
    public static String[] addStf(String[] staffs, int k) {
        String staff;
        Scanner in = new Scanner (System.in);
        staff = in.nextLine();
        staffs[k] = new String (staff);
        return staffs;
    }
}