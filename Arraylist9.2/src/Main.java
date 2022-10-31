import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <BankApplication> allBanks = new ArrayList<>();
        allBanks.add(new BankApplication("FORTE"));
        allBanks.add(new BankApplication("EURASIA"));
        allBanks.add(new BankApplication("KASPI"));

        allBanks.get(0).adAccount(new Account(12, "John", "Smith", 123.23));
        allBanks.get(0).adAccount(new Account(14, "Viktor", "Lora", 12343.23));
        allBanks.get(1).adAccount(new Account(13, "Johasdan", "Smitasdh", 121233.23));
        allBanks.get(1).adAccount(new Account(15, "Johasdan", "Smitasdh", 21233.23));
        allBanks.get(2).adAccount(new Account(16, "Johasdan", "Smitasdh", 12133.23));
        allBanks.get(2).adAccount(new Account(17, "Johasdan", "Smitasdh", 12233.23));

        for (int i = 0; i < allBanks.size(); i++) {
            for (int j = i+1; j < allBanks.size(); j++) {
                BankApplication temp;
                if (allBanks.get(i).getAverageBalance() < allBanks.get(j).getAverageBalance()) {
                    temp = allBanks.get(i);
                    allBanks.set(i, allBanks.get(j));
                    allBanks.set(j, temp);
                }
            }
            System.out.println(allBanks.get(i).getBankData());
        }
    }
}

