package Proje01;

import java.util.Scanner;

public class _01_KahveMakinasi {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz? \n Türk kahvesi \n Filte Kahve \n Espresso ");
        String hangiKahve= oku.nextLine();


        if (hangiKahve.equalsIgnoreCase("Türk Kahvesi"))
            System.out.println(hangiKahve+" hazırlanıyor.");

        else if (hangiKahve.equalsIgnoreCase("Filtre Kahve"))
                System.out.println(hangiKahve+" hazırlanıyor.");

        else if(hangiKahve.equalsIgnoreCase("Ekspresso Kahve"))
                System.out.println(hangiKahve+" hazırlanıyor.");
        else
            System.out.println("Hatalı tuşlama yaptınız.");


        System.out.print("Süt eklememizi ister misiniz ? \n (Evet veya Hayır olarak cevaplayınız): ");
        String sut= oku.nextLine();

        if (sut.equalsIgnoreCase("Evet"))
            System.out.println("Süt ekleniyor.");

        else if(sut.equalsIgnoreCase("Hayır"))
               System.out.println(" Süt eklenmiyor.");
        else
            System.out.println("Hatalı tuşlama yaptınız.");


        System.out.print("Şeker ister misiniz ?\n (Evet veya hayır cevabını veriniz) :  ");
        String seker= oku.nextLine();

        if (seker.equalsIgnoreCase("Evet"))
        {
            System.out.print("Kaç şeker olsun?");
            int kacSeker = okuInt.nextInt();

            System.out.println(kacSeker+ " şeker ekleniyor");
        }

        else
            System.out.println(" Şeker eklenmiyor.");


        String bosKod =oku.nextLine();

        System.out.println("Hangi boyutta olsun ? \n (Büyük boy - orta boy - küçük boy olarak giriniz.) :");
        String boyut=oku.nextLine();

        if (boyut.equalsIgnoreCase("Büyük boy"))
            System.out.println("Kahveniz \t" + boyut + "\t hazırlanıyor.");

        else if(boyut.equalsIgnoreCase("orta boy"))
            System.out.println("Kahveniz\t" + boyut + " hazırlanıyor.");
        else
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");

        System.out.println(hangiKahve+" "+ boyut+ " hazırdır.");















    }
}
