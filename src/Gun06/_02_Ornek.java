package Gun06;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {

        // kullanıcdan cadde(String) sokak(String),postakodu(int),ülke(String)
        // evSahibi(boolean) şeklinde adres bilgisi olarak yazdır


        Scanner okuStr= new Scanner(System.in);   // Stringleri okuması için
        Scanner okuInt=new Scanner(System.in);     // integer ları okuması için
        Scanner okuBool=new Scanner(System.in);    // booleanları okuması için

        System.out.print("Cadde: ");
        String cadde= okuStr.nextLine();   // nextLine birden fazla kelimeyi okur yani girilen adres uzunsa diye kullandık
                                             // next dersek sadece 1 kelime okur
        System.out.print("Sokak: ");
        String sokak= okuStr.nextLine();

        System.out.print("Ülke: ");
        String ulke= okuStr.nextLine();


        System.out.print("Posta kodu: ");
        int postaKodu= okuInt.nextInt();

        System.out.print("Ev sahibi misiniz = ");
        boolean cevap=okuBool.nextBoolean();   //True veya False

        System.out.println(" Adresiniz= " + cadde+" "+sokak+" "+postaKodu+" "+ulke+" "+cevap );
                                      // adresin kelimelerinin arasına bossluk olsun diye +" "+ koyduk




    }
}
