public class Main {
    public static void main(String[] args) {
        Student std1 = new Student(123  , "adimns  ", "13XX45  ",
                "Tima  ", "Mukashev  ", 4.0);
        Student std2 = new Student(123  , "adimns  ", "asdasd  ",
                "Leha  ", "Pereverzev  ", 3.3);
        Student std3 = new Student(123  , "adimns  ", "qwerty  ",
                "Vera  ", "Gubina  ", 2.7);
        Student std4 = new Student(123  , "adimns  ", "6544321  ",
                "Nastya  ", "Evleeva  ", 1.3);
        Student std5 = new Student(123  , "adimns  ", "123444x112 ",
                "Yerke  ", "Jaksylykov  ", 3.5);
std5.addCourses("Math");
        Staff stf1 = new Staff(123  , "adimns  ", "13XX45  ",
                "Tima  ", "Mukashev  ", 422.0);
        Staff stf2 = new Staff(123  , "adimns  ", "asdasd  ",
                "Leha  ", "Pereverzev  ", 311.3);
        Staff stf3 = new Staff(123  , "adimns  ", "qwerty  ",
                "Vera  ", "Gubina  ", 2323.7);
        Staff stf4 = new Staff(123  , "adimns  ", "6544321  ",
                "Nastya  ", "Evleeva  ", 1001.3);
        Staff stf5 = new Staff(123  , "adimns  ", "123444x112 ",
                "Yerke  ", "Jaksylykov  ", 32323.5);
stf1.addSubject("geometry");
        User u1 = new User(123  , "adimns  ", "13XX45  ",
                "Tima  ", "Mukashev  ");
        User u2 = new User(123  , "adimns  ", "asdasd  ",
                "Leha  ", "Pereverzev  ");
        User u3 = new User(123  , "adimns  ", "qwerty  ",
                "Vera  ", "Gubina  ");
        User u4 = new User(123  , "adimns  ", "6544321  ",
                "Nastya  ", "Evleeva  ");
        User u5 = new User(123  , "adimns  ", "123444x112 ",
                "Yerke  ", "Jaksylykov  ");

        User[] users = {std1,std2,std3,std4,std5,stf1,stf2,stf3,stf4,stf5,u1,u2,u3,u4,u5};
        for (int i = 0; i < users.length; i++) {
            users[i].getData();
        }
    }
}
