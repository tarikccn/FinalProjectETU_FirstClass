package finalproje;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Account {

    private LocalDate object = LocalDate.of(2019, 01, 01);
    private int İD;
    private double balance;

    Account() {
        this.balance = 0;
        this.İD = 0;
        object = LocalDate.of(2019, 01, 01);

    }

    Account(int İD, double balance) {
        this.İD = İD;
        this.balance = balance;

    }

    public int getİD() {
        return İD;
    }

    public void setİD(int İD) {
        this.İD = İD;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getObject() {
        return object;
    }

    public void setObject(LocalDate object) {
        this.object = object;
    }

    public abstract double deposit(double miktar);

    public abstract double withdraw(double miktar);

    public abstract double Benefit();

}
