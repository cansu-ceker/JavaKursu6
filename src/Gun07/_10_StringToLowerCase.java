package Gun07;

public class _10_StringToLowerCase {
    public static void main(String[] args) {

        // toLowerCase :   String i küçük harfe çevirir

        String text="Merhaba Dünya";

        System.out.println("Orijinal hali = " + text);

        System.out.println("küçük hali = " + text.toLowerCase());

        String hepsiKucukHal=text.toLowerCase();
        System.out.println(hepsiKucukHal);

        boolean basliyorMu1=text.startsWith("M");  //true
        boolean basliyorMu2=text.startsWith("m");  // false

        // ben küçük mü girildi bilmiyorum

        boolean basliyorMu3=text.toLowerCase().startsWith("m");  // true, text in hepsini küçüğe çevirdi sonra bu çevrilen m ile mi başlıyor dedi cevap evet cunku zaten kucuge cevırdık cumleyı
                            // merhaba dünya    //true

        System.out.println("basliyorMu1 = " + basliyorMu1);
        System.out.println("basliyorMu2 = " + basliyorMu2);
        System.out.println("basliyorMu3 = " + basliyorMu3);

    }
}
