package Gun07;

public class _02_StringContains {
    public static void main(String[] args) {
         // içermek içerik
        // contains : bir String in içerisinde karakter (lerin) var olup
        // olmadığını boolean cinsinden söyle true veya false
        // boolean kullanmayı şöyle akıl et, içeriğinde şu var mı evet yada hayır cevabı, baklava dilimi neydi boolean


              String cumle="Merhaba Dünya";

              boolean varMi =cumle.contains("a");
              System.out.println("varMi a = " + varMi);  //true


              System.out.println("varMi a = " + cumle.contains("a"));  //true
              System.out.println("varMi ya = " + cumle.contains("ya")); //true
              System.out.println("varMi z = " + cumle.contains("z")); //true

    }
}
