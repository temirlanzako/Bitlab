public  class UserBeanlmp extends Users implements UserBean {
    Users[] users;
    public UserBeanlmp() {
    }
    public UserBeanlmp(String name, String surname, Users[]users) {
        super(name,surname);
        this.users = users;
    }

    @Override
    public void getAllUsers() {
            for(int i = 0; i < users.length; i++) {
                System.out.println(users[i]);
            }
        }

    @Override
    public String getUsersByName(String name) {
        return name;
    }
    public String getUsersBySurname(String surname) {
        return surname;
    }
}
