package Gun08;

public class _01_StringReplace {
    public static void main(String[] args) {

         // replace : bir String içindeki karakter(leri) verilenle değiştirir hepsini


        String text="Merhaba Dünya";
        System.out.println("text = " + text);
        //                                                        ( bunu , bununla) değiştir
        System.out.println("a ları e ile  değiştir = " + text.replace("a","e"));  //Merhebe Dünye
        System.out.println("ba yı de ile değiştir = " + text.replace("ba","de"));  //Merhade Dünya
        System.out.println("Merhaba yı Hello ile değiştir = " + text.replace("Merhaba","Hello")); //Hello Dünya
        System.out.println("a ları boşluk ' ' ile değiştir ="  + text.replace("a"," ")); // Merh b  Düny
        System.out.println("a ları '' ile değiştir, a lar silindi ="  + text.replace("a","")); // Merhb Düny
        
        
        
        
        
    }
}
