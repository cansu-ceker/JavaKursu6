package Gun19_Yoktuk;

public class _05_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz(); // Math.random(); a benziyor
        merhabaYaz(); // yanı bır sey almadan gonderıyor

        merhabaYazIsme("İsmet");  //Math.Abs(-10) a benziyor
        cokMerhabaYaz(5); // ısmı alıyor, sonra cevabı gonderıyor burada y ada mıktarı alıp cevabı godnerıyor


    }
    public static void merhabaYaz()
    {
        System.out.println("Merhaba Dünya");   // mainde 2 tane yazıldıgı ıcın ekrana 2 kez merhaba dunya yazar
    }

    public static void merhabaYazIsme(String ad)
    {
        System.out.println("Merhaba"+ad);
    }

    public static void cokMerhabaYaz(int miktar)
    {
        for (int i = 0 ; i <miktar ; i++)
        System.out.println("Merhaba");

    }







}
