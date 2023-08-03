package Gun30._04_Soru;

public class Sabitler {


    // değiştirilemez - nesne olusturulmadan kullanalım -
    //    final       -      static                     -

    // static yazmadan final int saat=24; deseydik,
    // Sabitler sb=new Sabitler(); yapmak ve
    // sb.dakika vs yazmamaız gerekırdı maine habıre, bunları yapmadan ılerleyelım dıye static ekledik basına bir de

    final static int birGundekiSaat=24;
    final static int birSaattekiDakika=60;
    final static int birDakikadakiSaniye=60;


    public static int hesaplama(int gun, int saat, int dak)
    {
        int toplamSaniye= gun*
                Sabitler.birGundekiSaat
                *Sabitler.birSaattekiDakika
                *Sabitler.birDakikadakiSaniye
                +
                saat*
                        Sabitler.birSaattekiDakika
                        *Sabitler.birDakikadakiSaniye
                +
                dak* Sabitler.birDakikadakiSaniye;

        return toplamSaniye;
    }









}