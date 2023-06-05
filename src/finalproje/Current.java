package finalproje;

import java.time.LocalDate;

public class Current extends Account {

    private LocalDate tarih = LocalDate.now();

    public Current() {
        super();

    }

    public Current(int ID, int balance) {
        super(ID, balance);
    }

    @Override
    public double deposit(double miktar) {
        double bakiye = this.getBalance() + miktar;
        tarih = LocalDate.now();
        this.setBalance(bakiye);
        return bakiye;
    }

    @Override
    public double withdraw(double miktar) {
        double bakiye = this.getBalance() - miktar;
        tarih = LocalDate.now();
        this.setBalance(bakiye);
        return bakiye;
    }

    @Override
    public double Benefit() {
        return 0;
    }

    @Override
    public String toString() {
        return ("Vadesiz Hesap numarası :" + this.getİD() + " Hesapa açılma tarihi: " + tarih + " Hesap bakiyesi: " + this.getBalance() + " TL");
    }

}
