package Gun30._04_Soru;

public class Sabitler {


    // değiştirilemez - nesne olusturulmadan kullanalım -
    //    final       -      static                     -

    // static yazmadan final int saat=24; deseydik,
    // Sabitler sb=new Sabitler(); yapmak ve
    // sb.dakika vs yazmamaız gerekırdı maine habıre, bunları yapmadan ılerleyelım dıye static ekledik basına

    public final static int birGundekiSaat=24;  // public koysak da olur koymasak da, koyunca ne oldu? dıger gunleden dıger classlardan da erişilebilir oldu herhang bır gunu mainine git Sabitler. yap bu parametrelerın secenek olarak geldıgını goreceksın
    public final static int birSaattekiDakika=60;
    public final static int birDakikadakiSaniye=60;


    public static int hesaplama(int gun, int saat, int dak)
    {
        int toplamSaniye= gun*   // burası kullanıcının gırdıgı gun de ne kadar sanıye var bulma
                Sabitler.birGundekiSaat
                *Sabitler.birSaattekiDakika
                *Sabitler.birDakikadakiSaniye
                +
                saat*  // burası kullanıcının gırdıgı saatte ne kadar sanıye var bulma
                        Sabitler.birSaattekiDakika
                        *Sabitler.birDakikadakiSaniye
                +
                dak* Sabitler.birDakikadakiSaniye;  // burası kullanıcının gırdıgı dakıkada ne kadar sanıye var bulma

        return toplamSaniye;
    }









}