package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {

        //girilen bir adı ekrana yazdırın

       Scanner okuyucu= new Scanner(System.in); //klavyeden okutur
        System.out.print("isim giriniz=");  // dıyelım kı adını cansu luna olarak gırdın

        String okunanIsim=okuyucu.next();  //next kelime okur, cansu yazdırı mesela bu komut

        System.out.println("okunanIsim = " + okunanIsim);

        System.out.println("Bitti");

/* String okunanTamIsim= okuyucu.nextLine();  // nextLine  satırı okudugundan cansu lena yazdırır bu komut
 System.out.println("okunanTamIsim = " + okunanTamIsim);

 bu nottakı kısmı ben yazdım ama calısmadı amacım cansu luna gırılınce tam ad olarak ekrana cansu luna yazdırmaktı ??????????

 */



        /*
          okuyucu.next()     -> bir kelime okur
          okuyucu.nextLine() -> tüm satırı okur cümle gibi

          okuyucu.nextInt()   -> bir tam sayı(int)
          okuyucu.nextShort() -> bir tam sayı(short)
          okuyucu.nextByte()  -> bir tam sayı(byte)
          okuyucu.nextLong()  -> bir tam sayı(long)

          okuyucu.nextDouble() -> bir ondalıklı sayı(double)
          okuyucu.nextFloat()  -> bir ondalıklı sayı(float)

          okuyucu.nextBoolean() -> true veya false girişi için


        Scanner x= new Scanner(System.in); //klavyeden okutur
        System.out.print("isim giriniz=");

        String y=x.next();  //next kelime okur


        System.out.println("okunanIsim = " + y);
        System.out.println("Bitti");

*/









    }
}
