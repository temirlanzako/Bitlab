import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int size = in.nextInt();
                double scores[] = new double[size];
                for(int i=0;i<scores.length;i++){
                    scores[i] = in.nextDouble();
                }
                double total = 0;
                for(int i=0;i<scores.length;i++){
                    total+=scores[i];
                }
                double average = total/size;
                System.out.println("Total score : " + total);
                System.out.println("Average score : " + average);
            }
        }
    }
}