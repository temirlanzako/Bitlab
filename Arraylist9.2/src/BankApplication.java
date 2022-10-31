import java.util.ArrayList;

public class BankApplication {
    private String name;
    ArrayList<Account> accounts = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int index = 0;

    public void adAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i) {
        accounts.remove(i);
    }

    public BankApplication(String name) {
        this.name = name;
    }

    public Account getMaxAccount() {
        Account max = accounts.get(0);
        for (int i = 0; i < accounts.size(); i++) {
            if (max.getBalance() < accounts.get(i).getBalance()) {
                max = accounts.get(i);
            }
        }
        return max;
    }
    public double getAverageBalance() {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sum = sum + accounts.get(i).getBalance();
        }
        average = sum / accounts.size();
        return average;
    }
    public double getTotalBalance() {
        double sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sum = sum + accounts.get(i).getBalance();
        }
        return sum;
    }
    public int totalAccounts() {
        return accounts.size();
    }
    public String getBankData() {
        return "BANK NAME:  " + name + "| AMOUNT ACCOUNTS:  " + accounts.size() + "| ACCOUNT BALANCE:  " + getTotalBalance() +
                "| AVERAGE BALANCE:  " + getAverageBalance();
    }
}
