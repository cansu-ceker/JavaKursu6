package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {

        //     \n  -> yeni satır aç, alt satıra geçer
        //     \t  -> tab tuşuna bas, 2,3 harflik boşluk oluşturur
        //     \b  -> backspace, 1 karakter geri siler
        //     \"  -> tırnağı ekrana yazdırmak için kullanılır
        //     \\  ->ekrana bir tane \yazar
        //     \r  -> satır başına git demek, \r bence konulduğu yerden sonrasını yazdırıyor
        //     \
        //     \


        System.out.println("MerhabaDünya");      //MerhabaDünya
        System.out.println("Merhaba\nDünya");    //Merhaba yazar, alt satıra geçer Dünya yazar
        System.out.println("Merahaba\tDünya");   //Merhaba  Dünya   (tab tuşu kadar boşluklu yazar)
        System.out.println("Merhaba\bDünya");    //MerhabDünya      (konulduğu yerin bir öncesinden 1 karakter siler)
        System.out.println("Merhaba\b\bDünya2");  //MerhaDünya
        System.out.println("Merhaba\"Dünya");    //Merhaba"Dünya
        System.out.println("Merhaba\\Dünya");    //Merhaba\Dünya
        System.out.println("Merhaba\rDünya");    //Dünya   kendinden sonrakini yazdırır






    }
    }

