package Gun33._01_Inheritance;

public class SirketMain {
    public static void main(String[] args) {

        YoneticiYeni yy= new YoneticiYeni();
        yy.setAd("cansu");
        yy.zamYap();
        System.out.println("yy = " + yy);


        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.

        // private olunca gettersetter yaparak kapsulleme yapılması zorunludur

        //Inheritans bir tane super class oluyor

    }
}
