public class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff(){
    }
    public Staff(int id, String login, String password, String name, String surname,
                 double salary) {
        super(id,login,password,name,surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    @Override
    public void getData() {
        System.out.println("id:  " + id + "login:  " + login + "password:  " + password +
                "name:  " + name + "surname:  " +surname  + "salary:  " + salary + "  " + indexOfSubject);
        for(int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }
    public void addSubject(String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject = indexOfSubject +1;
        System.out.print("  " + indexOfSubject);
        }
    }
