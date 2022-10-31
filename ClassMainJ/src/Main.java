package Second;

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
}

class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student() {
        this.id = 0;
        this.name = "No Name";
        this.surname = "No Surname";
        this.gpa = 0;

    }

    public Student(int id, String name, String surname, Double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData() {
        return "Id: " + id +
                ", Name: " + name +
                ", Surname: " + surname +
                ", GPA: " + gpa;
    }
}









