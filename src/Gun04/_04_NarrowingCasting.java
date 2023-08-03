package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {

            int toplam=6700;
            byte sayi=5;

        //  sayi=toplam;   normlade bu olmaz ya, ama sen bunu benım aklım
                          //başımda yapcam dersen     asagıdakı gibi yapılır:

        sayi=(byte)toplam;     //veri kaybı olmasa bile dikkatli yapılmalı
        System.out.println("sayi = " + sayi);  // veri kaybı var

        double oran=3.7;  //ben tamsayı kısmını almak istiyorum

        toplam=(int) oran; //bılerek sadece tam sayı kısmını aldım
        sayi=(byte)oran;
        System.out.println("toplam = " + toplam); // veri kaybı var ama ben bunları bilerek yaptığım için sıkıntı yok






    }}
