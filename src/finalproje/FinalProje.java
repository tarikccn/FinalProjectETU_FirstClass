package finalproje;

import java.util.Random;
import java.util.Scanner;

public class FinalProje {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Bank hesaplar = new Bank();
        Random rand = new Random();

        do {
            System.out.println("------BANKA UYGULAMASI------");
            System.out.println("YAPACAĞINIZ İŞLEMİ SEÇİNİZ \n"
                    + "YENİ HESAP VE İŞLEMLER 1\n"
                    + "MEVCUT HESAP VE İŞLEMLER 2\n"
                    + "ÇIKIŞ İÇİN 3");
            int sayi = console.nextInt();
            if (sayi == 1) {
                System.out.println("AÇACAĞINIZ BANKA HESABINI SEÇİNİZ \n"
                        + "KISA VADELİ HESAP 1\n"
                        + "UZUN VADELİ HESAP 2\n"
                        + "VADESİZ HESAP 3");
                int sayi2 = console.nextInt();
                if (sayi2 == 1) {
                    System.out.println("Bakiyenizi giriniz: ");
                    int bakiye = console.nextInt();
                    int ID = rand.nextInt(9999999);
                    if (bakiye >= 1000) {
                        System.out.println("Hesabınız oluşturuldu Hesap numaranız: " + ID);
                        ShortTerm hesap = new ShortTerm(ID, bakiye);//kısa vadeli hesap oluşturuldu.
                        hesaplar.getAccount().add(hesap);//Account türünden ArrayList e hesap atıldı.

                        do {
                            System.out.println(ID + " Li hesabınızda yapacağınız işlemler\n"
                                    + "Para çekme 1\n"
                                    + "Para yatırma 2\n"
                                    + "Kâr Hesaplama 3");
                            int sayi3 = console.nextInt();
                            if (sayi3 == 1) {
                                System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                                int miktar = console.nextInt();
                                if (hesap.getBalance() >= miktar) {
                                    hesap.withdraw(miktar);
                                    System.out.println("Güncel bakiye: " + hesap.getBalance() + " TL" + "\n");

                                } else {
                                    System.out.println("Yeterli miktarda bakiye bulunmuyor");
                                }
                            }
                            if (sayi3 == 2) {
                                System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                                int miktar = console.nextInt();
                                hesap.deposit(miktar);
                                System.out.println("Güncel bakiye: " + hesap.getBalance() + " TL" + "\n");

                            }
                            if (sayi3 == 3) {
                                System.out.println("Kârınız : " + hesap.Benefit() + "TL dir." + "\n");
                            }

                            System.out.println("Devam için 1\n"
                                    + "Çıkış için 2");
                            int sayi5 = console.nextInt();
                            if (sayi5 == 1) {
                                continue;
                            } else {
                                break;
                            }

                        } while (true);

                    } else {
                        System.out.println("Kısa vadeli hesap açmak için yeterli miktarda bakiyeniz bulunmamaktadır.");
                    }
                }// KISA VADELİ HESAP
                if (sayi2 == 2) {
                    System.out.println("Bakiyenizi giriniz: ");
                    int bakiye = console.nextInt();
                    int ID = rand.nextInt(9999999);
                    if (bakiye >= 1500) {
                        System.out.println("Hesabınız oluşturuldu Hesap numaranız : " + ID);
                        LongTerm hesap = new LongTerm(ID, bakiye);//UZUN VADELİ HESAP AÇTIK
                        hesaplar.getAccount().add(hesap);//Account türünden ArrayList e hesap atıldı.
                        do {
                            System.out.println(ID + " Li hesabınızda yapacağınız işlemler\n"
                                    + "Para çekme 1\n"
                                    + "Para yatırma 2\n"
                                    + "Kâr Hesaplama 3");
                            int sayi3 = console.nextInt();
                            if (sayi3 == 1) {
                                System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                                int miktar = console.nextInt();
                                if (hesap.getBalance() >= miktar) {
                                    hesap.withdraw(miktar);
                                    System.out.println("Güncel bakiye: " + hesap.getBalance() + " TL" + "\n");

                                } else {
                                    System.out.println("Yeterli miktarda bakiye bulunmuyor");
                                }
                            }
                            if (sayi3 == 2) {
                                System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                                int miktar = console.nextInt();
                                hesap.deposit(miktar);
                                System.out.println("Güncel bakiye: " + hesap.getBalance() + " TL" + "\n");

                            }
                            if (sayi3 == 3) {
                                System.out.println("Kârınız : " + hesap.Benefit() + "TL dir." + "\n");

                            }
                            System.out.println("Devam için 1\n"
                                    + "Çıkış için 2");
                            int sayi5 = console.nextInt();
                            if (sayi5 == 1) {
                                continue;
                            } else {
                                break;
                            }
                        } while (true);

                    } else {
                        System.out.println("Uzun vadeli hesap açmak için yeterli miktarda bakiyeniz bulunmamaktadır.");
                    }

                }//UZUN VADELİ HESAP
                if (sayi2 == 3) {
                    int ID = rand.nextInt(9999999);
                    System.out.println("Bakiyenizi giriniz: ");
                    int bakiye = console.nextInt();
                    System.out.println("Hesabınız oluşturuldu Hesap numarası: " + ID);
                    Current hesap = new Current(ID, bakiye);//VADESİZ HESAP OLUŞTURULDU
                    hesaplar.getAccount().add(hesap);//ARRAYLİST E ATILDI
                    do {
                        System.out.println(ID + " Li hesabınızda yapacağınız işlemler\n"
                                + "Para çekme 1\n"
                                + "Para yatırma 2");

                        int sayi3 = console.nextInt();
                        if (sayi3 == 1) {
                            System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                            int miktar = console.nextInt();
                            if (hesap.getBalance() >= miktar) {
                                hesap.withdraw(miktar);
                                System.out.println("Güncel bakiye: " + hesap.getBalance() + " TL" + "\n");

                            } else {
                                System.out.println("Yeterli miktarda bakiye bulunmuyor");
                            }
                        }
                        if (sayi3 == 2) {
                            System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                            int miktar = console.nextInt();
                            hesap.deposit(miktar);
                            System.out.println("Güncel bakiye: " + hesap.getBalance() + " TL" + "\n");
                        }
                        System.out.println("Devam için 1\n"
                                + "Çıkış için 2");
                        int sayi5 = console.nextInt();
                        if (sayi5 == 1) {
                            continue;
                        } else {
                            break;
                        }
                    } while (true);
                }// END OF VADESİZ HESAP
            }//END OF YENİ HESAP VE İŞLEMLER

            if (sayi == 2) {
                do {
                    System.out.println("YAPACAĞINIZ İŞLEMİ SEÇİNİZ:\n"
                            + "HESAP NUMARASINA PARA YATIRMA 1\n"
                            + "HESAP NUMARASINDAN PAR ÇEKME 2\n"
                            + "AÇILMIŞ OLAN HESAPLARI GÖRME 3\n"
                            + "HESAP NUMARALARINI GÖRME 4");

                    int sayi4 = console.nextInt();
                    if (sayi4 == 1) {
                        System.out.println("Hesap numarasını giriniz: ");
                        int no = console.nextInt();
                        for (int i = 0; i < hesaplar.getAccount().size(); i++) {
                            if (no == hesaplar.getAccount().get(i).getİD()) {
                                int index = i;
                                System.out.println("Yatırmak istediğiniz miktarı giriniz :");
                                int miktar = console.nextInt();
                                hesaplar.getAccount().get(index).deposit(miktar);

                            } 
                        }

                    }

                    if (sayi4 == 2) {
                        System.out.println("Hesap numarasını giriniz: ");
                        int no = console.nextInt();
                        for (int i = 0; i < hesaplar.getAccount().size(); i++) {
                            if (no == hesaplar.getAccount().get(i).getİD()) {
                                int index = i;
                                System.out.println("Çekmek istediğiniz miktarı giriniz :");
                                int miktar = console.nextInt();
                                if (hesaplar.getAccount().get(index).getBalance() >= miktar) {
                                    hesaplar.getAccount().get(index).withdraw(miktar);
                                }

                            } 
                        }
                    }

                    if (sayi4 == 3) {
                        for (int i = 0; i < hesaplar.getAccount().size(); i++) {
                            System.out.println(hesaplar.getAccount().get(i));
                        }
                    }
                    if (sayi4 == 4) {
                        for (int i = 0; i < hesaplar.getAccount().size(); i++) {
                            System.out.println(hesaplar.getAccount().get(i).getİD());

                        }
                    }
                    System.out.println("Devam için 1\n"
                            + "Çıkış için 2");
                    int sayi5 = console.nextInt();
                    if (sayi5 == 1) {
                        continue;
                    } else {
                        break;
                    }
                } while (true);

            }// MEVCUT HESAP VE İŞLEMLER
            if (sayi == 3) {
                break;
            }

        } while (true);

    }//END OF MAİN

}//END OF CLASS
