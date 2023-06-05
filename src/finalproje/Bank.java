package finalproje;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> account = new ArrayList<>();
    private LocalDate object = LocalDate.now();

    public ArrayList<Account> getAccount() {
        return account;
    }

    public void setAccount(ArrayList<Account> account) {
        this.account = account;
    }

    public LocalDate getDate() {
        return object;
    }

    public void deposit(int ID, int miktar) {
        for (int i = 0; i < account.size(); i++) {
            if (ID == account.get(i).getİD()) {
                int index = i;
                double para = account.get(index).getBalance();
                double bakiye = para + miktar;
                account.get(index).setBalance(bakiye);

            }
        }
    }

    public void withdraw(int ID, int miktar) {
        for (int i = 0; i < account.size(); i++) {
            if (ID == account.get(i).getİD()) {
                int index = i;
                double para = account.get(index).getBalance();
                if (para >= miktar) {
                    double bakiye = para - miktar;
                    account.get(index).setBalance(bakiye);
                } else {
                    System.out.println("Çekmek istediğiniz miktarda para hesapta bulunmamaktadır.");
                }
            }
        }
    }

}
