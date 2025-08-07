package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız bir Toplam rakamı, kullanıcının vereceği  başlangıç tarihine göre
        // yine kullanıcnın verdiği kadar taksit yaptırarak, ödeme planını ekrana yazdırınız.
        // Kullanıcıdan tarih, para miktarı ve taksit sayısı alınacak
        // Çıktı olarak taksit no, taksit tarihi, ödenecek miktar şeklinde liste verilecek

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Taksit başlangıç tarihini giriniz (22.05.2023) şeklinde = ");
        String tarih=okuStr.nextLine();
        LocalDate baslangicTarihi=LocalDate.parse(tarih,f);

        System.out.print("Toplam tutarı girin=");
        int paraMik=okuInt.nextInt();

        System.out.print("Kaç taksit =");
        int taksitSayisi=okuInt.nextInt();

      int taksitMik=paraMik/taksitSayisi;  // bir aya düşen ödeme

        for (int i = 0 ; i <=taksitSayisi; i++)
        {
            System.out.print(i +"-");
            System.out.print("  "+baslangicTarihi.plusMonths(i-1).format(f));  //başlangıctakı durum bu dıye i yi -1 den baslattık
            System.out.print(" " + taksitMik+"TL   ");

        }























    }
}
