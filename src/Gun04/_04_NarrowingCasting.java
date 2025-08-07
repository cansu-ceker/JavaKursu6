package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {

        //  büyük alanı --> küçüğe atılabiliyor (daralma- narrowing)
        //  double --> float -->long --> int --> short --> byte
        // veri kaybı kesinlikle var

            int toplam=6700;
            byte sayi=5;

        //  sayi=toplam;   normalade bu olmaz neden? ,nt olan toplamı, byte olan sayıya yanı int i byte a yani buyugu kucuge atamazsın ya, ama sen bunu benım aklım
                          //başımda yapcam dersen     asagıdakı gibi yapılır:

        sayi=(byte)toplam;     //veri kaybı olmasa bile dikkatli yapılmalı
                               // ınt olan toplamı ı byte a cevırdım ondan sonra byte olan sayıya attım dıyoruz boylelıkle
        System.out.println("sayi = " + sayi);  // veri kaybı var

        double oran=3.7;  //ben tamsayı kısmını almak istiyorum ne yaparım:

        toplam=(int) oran; //bu sekılde bılerek sadece tam sayı kısmını aldım
        sayi=(byte)oran;   // ya da bu sekılde yaparım
        System.out.println("toplam = " + toplam); // veri kaybı var ama ben bunları bilerek yaptığım için sıkıntı yok

        System.out.println("sayi = " + sayi);




    }}
