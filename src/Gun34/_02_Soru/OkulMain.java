package Gun34._02_Soru;

public class OkulMain {
    public static void main(String[] args) {

      LiseOgrencisi lo1= new LiseOgrencisi("Cansu","Sayısal");  // TİPİ ZATEN BELLI BASTA LISEOOG DEDIK KENDI CLASSLARINDA DA TIPI BELIRLEDIK DIYE BURADA () ICINE YAZMAYA GEREK YOK
      LiseOgrencisi lo2=new LiseOgrencisi("fARUK","SAYISAL");
      IlkOgrencisi iO1=new IlkOgrencisi("ayşe","spor klubu");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("iO1 = " + iO1);

    }
}
