package Gun08;

public class _02_StringReplaceFirst {
    public static void main(String[] args) {

        // replaceFirst : bir String içindeki karakter(leri)  verilenle değiştirir. Sadece ilkini degıstırır

        String  text= "Merhaba Dünya";
                                                                      //sadece ilk a yı e ile degıstır
        System.out.println("ilk a yı e ile değiştir = " + text.replaceFirst("a","e"));  // Merheba Dünya
        System.out.println("ilk ba yı de ile değiştir = " + text.replaceFirst("ba","de")); // Merhade Dünya
        System.out.println("ilk Dünya yı Java ile değiştir = " + text.replaceFirst("Dünya","Java"));  //Merhaba Java
        System.out.println("ilk a yı boşluk ile değiştir = " + text.replaceFirst("a"," "));  // Merh ba Dünya
        System.out.println("ilk a yı sil '' ile değiştir = " + text.replaceFirst("a",""));  // Merhba Dünya





    }
}
