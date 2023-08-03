package OOOOdev9_Diziler;

public class Soru1 {
    public static void main(String[] args) {
        //Bu String'i oluşturun. "Removes white space from both ends of a string"
        //String'deki kelime sayısını yazdırınız.

       String text= "Removes white space from both ends of a string";
        String [] dizi= text.split(" ");
        System.out.println("Kelime sayısı = " + dizi.length);


    }
}
