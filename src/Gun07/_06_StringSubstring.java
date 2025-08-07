package Gun07;

public class _06_StringSubstring {
    public static void main(String[] args) {

        //substring -> string in belli ir bölümünü alma işlemi yapar


       //           012345678...
        String cumle= "Merhaba arkadaşlar";
                                   // 3 nolu indexten 9 nolu index E KADAR al
        String parca1=cumle.substring(3,9);   // 3 den 9 a kadar al 9 dahil DEĞİL
        System.out.println("parca1 = " + parca1); //haba a


        String parca2=cumle.substring(8,15);
        System.out.println("parca2 = " + parca2);  // arkadaş

        String parca3=cumle.substring(8);   // 8 den sonuna kadar yazdır demek
        System.out.println("parca3 = " + parca3);  //arkadaşlar


        System.out.println("parcaaa = " + cumle.substring(8));







    }
}
