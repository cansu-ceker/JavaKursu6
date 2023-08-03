package Gun32._03_Soru;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class MainOkul {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        Okul yeniOkul=new Okul("kabataş",3);
        do{
            System.out.print("öğrencinin adı=");
            String ad=okuStr.nextLine();

            System.out.print("öğrencinin soyadı=");
            String soyad=okuStr.nextLine();

            System.out.print("öğrencinin yaşı=");
            int yas=okuInt.nextInt();

            if (yas<15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
            yeniOkul.getOgrencileri().add(ogr);}
            else
            System.out.println("öğrenci yaşı bu okul için uygun değil");

        }while (yeniOkul.getOgrencileri().size()<yeniOkul.getKontenjan());

        System.out.println("yeniOkul.getOgrencileri() = " + yeniOkul.getOgrencileri());


    }
}
