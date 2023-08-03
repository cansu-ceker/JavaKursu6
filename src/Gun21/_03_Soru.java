package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, (hocanın kac not gırecegı bellı degıl dıye ArrayList yapmak zorundayız)
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner okuInt=new Scanner(System.in);  // int giriş için
        Scanner okuStr=new Scanner(System.in);  // String giriş için ayrı ayrı tanıtmak gerek


        ArrayList<Integer> notlarList = new ArrayList<>();
        double toplam=0;
        String cevap="";

       do
       {
           System.out.print("Not giriniz = ");
           int not= okuInt.nextInt();
           notlarList.add(not);
           toplam=toplam+not;


           System.out.println("Not girmeye devam mı ( E/H ) ? ");  // E-e-H-h  girecek kullanıcı
           cevap=okuStr.next();
       }

       while ( cevap.equalsIgnoreCase("E") );  // döngünün devam şartı, e de olsa E de olsa gir bu döngüye


        // ortalamayı kaç öğrenci geçmiş

        double ort=toplam/notlarList.size();

        int gecenSayisi=0;

        for (int i = 0 ; i <notlarList.size(); i++)
        {
            if (notlarList.get(i)>= ort)
                gecenSayisi++;
        }



        System.out.println("ortalamayı geçen öğrenci sayısı = " + gecenSayisi);



    }
}