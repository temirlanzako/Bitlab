public abstract class Teacher extends User {
    String nickName;
    String status;
    String subjects[] = new String[10];
    int sizeOfSubjects = 0;

    public Teacher(){
    }
    public Teacher (String nickName, String status, String subjects[], int sizeOfSubjects) {
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubject() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }
    public void addSubject(String subject) {
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects = sizeOfSubjects + 1;
    }
}

