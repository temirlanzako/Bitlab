import java.util.Scanner;

public abstract class ERPSystem extends User {
    User [] memory = new User[1000];
    int sizeOfUsers = 0;

    public void addUser(User u) {
        memory[sizeOfUsers] = u;
        sizeOfUsers += sizeOfUsers;
    }
    public void printAllUsers() {
        for (int i = 0; i < memory.length; i++) {
            System.out.println(memory[i]);
        }
    }
    public void printUser(int index) {
        Scanner in = new Scanner(System.in);
        index = in.nextInt();
        for (int i = 0; i < memory.length; i++) {
            if (index == i) {
                System.out.println(memory[i]);
            }
            if (index > memory.length) {
                System.out.println("No such user in the index");
            }
        }
    }
}


