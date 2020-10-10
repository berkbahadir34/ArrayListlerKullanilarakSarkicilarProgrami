import java.util.Scanner;

public class Main {
    private static Sarkicilar sarkicilar=new Sarkicilar();
    private static Scanner scanner=new Scanner(System.in);
    public static void islemleri_bastir(){
        System.out.println("\t 0- İşlemleri Görüntüle");
        System.out.println("\t 1- Şarkıcıları Görüntüle");
        System.out.println("\t 2- Şarkıcı Ekle");
        System.out.println("\t 3- Şarkıcı Güncelle");
        System.out.println("\t 4- Şarkıcı Sil");
        System.out.println("\t 5- Şarkıcı Ara");
        System.out.println("\t 6- Uygulamadan Çık");

    }
    public static void sarkici_goruntule(){
        sarkicilar.sarkicilari_bastir();
    }
    public static void sarkici_ekle(){
        System.out.println("Eklemek İstediğiniz şarkıcının ismi:");
        String isim=scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_guncelle(){
        System.out.println("Hangi Pozisyondaki Şarkıcıyı Güncellemek İstersiniz?(örnek:1,2,3)");
        int pozisyon =scanner.nextInt();
        scanner.nextLine();//Dummy input..
        String yeni_isim=scanner.nextLine();

        sarkicilar.sarkici_guncelle(yeni_isim,pozisyon-1);
    }
    public static void sil(){
        System.out.println("Silmek İstediğiniz Pozisyonu Giriniz");
        int pozisyon =scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon-1);
    }
    public static void ara(){
        System.out.println("Aramak İstediğiniz Şarkıcı İsmini Giriniz");
        String isim =scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }
    public static void main(String[] argc){


        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz.");

        islemleri_bastir();

        boolean cikis=false;
        int islem;

        while (!cikis){
            System.out.println("Bir İşlem Seçiniz");
            islem=scanner.nextInt();
            scanner.nextLine();
            switch (islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("Programdan Çıkılıyor....");
                    break;

            }

        }


    }
}
