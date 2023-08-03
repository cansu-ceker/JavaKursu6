package Gun28._01_Ornek;

public class Okul {
    public static void main(String[] args) {
      // Scanner oku= new Scanner (System.in);


// 1. yol
        Ogrenci ogr1=new Ogrenci();

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



    }
}
