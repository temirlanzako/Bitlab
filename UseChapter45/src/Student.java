public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname,
                   double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }
    @Override
    public void getData() {
        System.out.println("id:  " + id + "login:  " + login + "password:  " + password +
                "name:  " + name + "surname:  " + surname + "gpa:  " + gpa + "  " + indexOfCourses);
        for (int i = 0; i < indexOfCourses; i++) {
            System.out.println(courses[i]);
        }
    }

    public  void addCourses(String course) {
       courses[indexOfCourses] = course;
       indexOfCourses = indexOfCourses + 1;
       System.out.print("  " + indexOfCourses);
        }
    }