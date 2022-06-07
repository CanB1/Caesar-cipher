import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SezarSifreleme szr = new SezarSifreleme();
        Scanner sc = new Scanner(System.in);
        int secim = 0;
        String metin = "";
        while (true) {
            System.out.println("1-Metin Şifrele\n" + //İşlem Seçim Ekranı
                    "2-Şifre Çöz\n" + "3-Çıkış");
            secim = sc.nextInt();
            if (secim != 1 && secim != 2 && secim != 3 ){
                System.out.println("Yanlış İşlem Girdiniz");
            }
            else {
                break;
            }
        }
        if (secim == 1){
            sc.nextLine();
            System.out.println("Şifrelenecek Metni Giriniz");
            metin = sc.nextLine();
            szr.metniDuzenle(metin); //Metni ilk önce düzenleyip daha sonra şifrelenmiş şekilde yazdırma
            System.out.println("Şifrelenmiş Metin :");
            System.out.println(szr.sifrele());
        }
        else if (secim == 2){
            sc.nextLine();
            System.out.println("Şifresi Çözülecek Metni Giriniz");
            metin = sc.nextLine();
            szr.metniDuzenle(metin); //Metni ilk önce düzenleyip daha sonra şifresi çözülmüş şekilde yazdırma
            System.out.println("Şifresi Çözülmüş Metin :");
            System.out.println(szr.sifreCoz());
        }
        else {
            System.out.println("Çıkış Yapılıyor...");
        }


    }
}
