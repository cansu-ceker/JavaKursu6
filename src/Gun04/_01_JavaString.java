package Gun04;

public class _01_JavaString {
    public static void main(String[] args) {
        int sayac=0;    // int tipi, sayac adı, 0 baslangı. değeri
        String ad="cansu"; // kelime veya kelimeler saklayacaksan String

        System.out.println("sayac = " + sayac);  // sayac=0 yazar
        System.out.println("ad  = " + ad ); // ad=cansu


        String soyad= "çeker";
        System.out.println("soyad = " + soyad);

        String tamAd=ad+" "+soyad;   // +" "+ yaptık ad soyad arası bosluk yapması için
                                    // + işareti sayılarda toplar
                                    // kelimelerde yanyana birleştirir

        System.out.println("isim = " + tamAd);  // cansu çeker



    }

}
