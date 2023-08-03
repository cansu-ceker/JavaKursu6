package Gun43;

import java.util.ArrayList;

public class _01_NesneObject {
    public static void main(String[] args) {

        // etrafımızda gördüğümüz her şey nesne
        // Kişi cinsinden demiştik Kisi ogr1=new Student(); demiştik en temel tip nesne, kaynak olan noktadan türüyor her şey
        // Nesne ogr1=new Student(); demiştik bundan hareketle

        ArrayList<Object>genelList=new ArrayList<>();
        genelList.add(1);
        genelList.add("ismet");
        genelList.add(3.5);
        genelList.add(true);  // görüldüğü gibi her şey ekleniyor

        System.out.println("genelList = " + genelList);

        // her tip eklenebiliyor çünkü bütün tipler Object ten türetildiği için

        double oran=10/3.0;
        System.out.println("oran = " + oran);  // bunun sonucunu 2 hane nasıl yazdırırım:

       // System.out.printf("formatı yaz", değişkenleri yaz); bu şekilde olur
        System.out.printf("%f",oran);  // %f = % işaretei değişkenin geleceği yer
                                       //      f işareti double, float yani kesirli olan demek

        System.out.printf("sonuç=%4.1f",oran); // 4 : toplamda 4 hane kullanıcak demek, nokta dahil
                                               // 1 : noktadan sonra kaç harf kullanılacak
                                               // bu sağa dayalı şekilde yazdı
                                               //  "sonuç=%4.1f\n" şeklinde de yazabiliriz, aşağı iner yazdıktan sonra

        System.out.printf("sonuç=%-4.1f",oran); // - koyunca sola dayalı şekilde yazdı

        int sayi=5;
        System.out.printf("Sonuç=%-5.2f, tamSayi=%d",oran, sayi); // f : double veya float
                                                                  // d : decimalden geliyor yani tamsayı
                                                                  // s : string değişkenler



    }
}
