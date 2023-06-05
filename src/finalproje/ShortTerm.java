package finalproje;

import java.time.LocalDate;

public class ShortTerm extends Account {

    private double faizOrani = 0.17;
    private LocalDate tarih = LocalDate.now();

    public ShortTerm() {
        super();
        faizOrani = 0.17;
    }

    public ShortTerm(int İD, double bakiye) {
        super(İD, bakiye);
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
        return ("Kısa vadeli Hesap numarası :" + this.getİD() + " Hesap açılma tarihi: " + tarih + " Hesap bakiyesi :" + this.getBalance() + " TL");
    }

}
