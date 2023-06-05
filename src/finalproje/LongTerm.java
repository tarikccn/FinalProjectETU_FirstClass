package finalproje;

import java.time.LocalDate;

public class LongTerm extends Account {

    private double faizOrani = 0.24;
    private LocalDate tarih = LocalDate.now();

    public LongTerm() {
        super();
        faizOrani = 0.24;
    }

    public LongTerm(int ID, double bakiye) {
        super(ID, bakiye);
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
        return (tarih.getDayOfYear() - this.getObject().getDayOfYear()) * (faizOrani / 365) * (this.getBalance());
    }

    @Override
    public String toString() {
        return ("Uzun vadeli Hesap numarası :" + this.getİD() + " Hesap açılma tarihi :" + tarih + " Hesap bakiyesi :" + this.getBalance() + " TL");
    }

}
