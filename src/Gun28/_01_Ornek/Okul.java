package Gun28._01_Ornek;

public class Okul {
    public static void main(String[] args) {



        Ogrenci ogr1=new Ogrenci();
/*     bu sekılde () bos yanı bır sey gondermeden nesne olusturunca baska classta  bır metod olusturmana gerek yok ben senı anlıyorum dıyor java
      fakat asagıdakıler gıbı eger kı ( ıcıne verı yazarak) olusturacaksam nesneyı, dıyor kı sen bunun metodunu yaz
                                      bunun adı da Constructor metodlar dır
      ve sen bır tane bıle (ıcıne verı yazarak) Constructor metod olusturuyorsan,
                                      () bos olarak olusturdugun metod ıcın de bır metod yazmak zorundasın
                                      1 dolu varsa bunun metodunu yazıyosun zaten + () bos ıcın de metod yazman lazım

*/


        ogr1.id=1;
        ogr1.ad="ismet";
        ogr1.soyad="temur";
        ogr1.sinif=6;
        System.out.println("ad = " + ogr1.ad);


// 2.yol
        Ogrenci ogr2=new Ogrenci(3,"mehmet","yılmaz",5);  // oluştuturken ilk yapılacakları () içine koyabılırız ama class ta tanımladık metod ıcınde thıs thıs dıye
        System.out.println("ogr 2 adı = " + ogr2.ad);



// 3. yol
        Ogrenci ogr3= new Ogrenci(3,"ayşe","demir");
        System.out.println("ogr 3 adı= " + ogr3.ad);

// 3 un yerıne gecen yol
//        Ogrenci ogr4= new Ogrenci(3,"cansu","ceker");
//        System.out.println("ogr 4 adı= " + ogr4.ad);



    }
}
