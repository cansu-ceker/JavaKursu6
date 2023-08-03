package Gun08;

public class _03_StringReplaceAll {
    public static void main(String[] args) {

        // replaceAll : replace gibi çalışır farkı Kriter (regex) verilebiliyor
        // regex : regular


        String text= "Merhaba1 Dünya234";

        System.out.println("text = " + text);
        System.out.println("abn leri _ ile değiştir = " + text.replaceAll("[abn]","_"));  //Merh___1 Dü_y_234
                                                                    // a,b,n leri _ yap


        System.out.println("A-Z  -> _ = " + text.replaceAll("[A-Z]","_"));  //  _erhaba1 _ünya234
                       // A Zye kadar BÜYÜK harfleri _ yap

        System.out.println("harfleri sil -> = " + text.replaceAll("[A-Z]","").replaceAll("[a-z]",""));  //1 234
                       // yani  üstüste replaceAll kullanılabilir
                       //önce büyük herfleri sil yaptırdık
                       //sonra küçük harfleri sil yaptırdık (tükçe karakterler kaldı çünkü bilg türkce bılmıyor) tek komutta


        System.out.println("0-9 arasını sil = " + text.replaceAll("[0-9]",""));  //Merhaba Dünya
                       // 0-9 arasını sayıları sil, geriye harfler kaldı sonucta



        System.out.println("0-9 dışındakileri sil = " + text.replaceAll("[^0-9]",""));  //1234
                      // 0-9 un dışındakileri ^ sil  , sadece rakamlar kaldı,
        // NEDEN 1 234 , cunku boslugu da sildi, 0-9 un dısında kalan seyler arasında her seyı sılıyor boslugu da sıldı

        //$500  -> 500 -> parseInt



    }
}
