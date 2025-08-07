package Gun04;

public class _01_JavaString {
    public static void main(String[] args) {
        int sayac=0;    // int tipi, sayac adı, 0 baslangıc değeri
        String ad="cansu"; // kelime veya kelimeler saklayacaksan String

        System.out.println("sayac = " + sayac);  // sayac=0 yazar
        System.out.println("ad  = " + ad ); // ad=cansu


        String soyad= "çeker";
        System.out.println("soyad = " + soyad);

        String tamAd1=ad+" "+soyad;   // +" "+ yaptık ad soyad arası bosluk yapması için
                                    // + işareti sayılarda toplar
                                    // kelimelerde yanyana birleştirir
        System.out.println("isim = " + tamAd1);  // cansu çeker

        String tamAd2=ad+soyad;
        System.out.println("tamAd2 = " + tamAd2);  //cansuçeker





    }

}
