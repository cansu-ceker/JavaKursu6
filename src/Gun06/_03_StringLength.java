package Gun06;

public class _03_StringLength {
    public static void main(String[] args) {

        //StringLength   -->  bir String in uzunluğunu verir

        String cumle ="Bu gün hava çok güzel";

      int uzunluk=cumle.length();  // bu 1 olsun
                                  // cumle nin uzunluğu yani karakter sayısı , boşluk da bir karakter
                                   //int yerine double yazsan hiçbir şey olmaz, double int i kapsadığı için bilg kendisi çevirir sıkıntı yapma ama mesela byte falan yazamayız hata verir

       System.out.println("uzunluk = " + uzunluk);  // bu 2 olsun
        //1 ve 2 yi yazmadan direkt alttaki gibi de yazabiliriz

        System.out.println("uzunluk2=" + cumle.length());


         //boşlukları da sayıyor yani 21 cevap








    }
}
