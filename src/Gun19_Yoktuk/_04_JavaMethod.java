package Gun19_Yoktuk;

public class _04_JavaMethod {
    public static void main(String[] args) {  // ana metod diğer metodlardan buranın içinden çağırılacak

        int enb=  Math.max(5,6);  // mac metodu değer/ler  almış, geriye büyük olanı  vermi
        double rndSayi=Math.random();  // hiçbir şey almıyor, sadece veriyor

        System.out.println("Merhaba Dünya"); //veri alıyor, götürüp ekrana yazıyor
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // kullanması kolay, çağırması kolau,tekrar tekrar kullanabilirsin


    }

    // metodların yazılabileceği yer - YA main in üstü ya da altıdır, genelde altına yazılır

    public static void merhabaYaz ()
    {

        System.out.println("Merhaba Dünya : Metoddan");
    }



}
