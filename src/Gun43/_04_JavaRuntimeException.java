package Gun43;

import java.util.Scanner;

public class _04_JavaRuntimeException {
    public static void main(String[] args) {

        boolean dogruCalisti=true;
        do {


       try {  // bu sekılde yazılarak, hatay bölgesine şerit çektik
            Scanner oku = new Scanner(System.in);

            System.out.print("Sayi1=");
            int sayi1 = oku.nextInt();

            System.out.print("Sayi2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
           dogruCalisti=true;
        }
       catch (Exception hata) // hata olursa yakala ve aşağıdaki bölümü çalıştır demek
       // hatamesjlarını hata isimli Exception cinsinden değişkene attım diyor
       {
           System.out.println("Hata oluştu");  // program kırılmadı ekrana hata olustu yazdı,
           System.out.println("hata.getMessage() = " + hata.getMessage());   // hatanın sebebını yazdırdık ekrana
           System.out.println("Lütfen 2. sayıyı sıfır vermeyiniz");
           dogruCalisti=false;
       }

        }while (!dogruCalisti);  //dogruCalismadıysa dön, dogru calısana kadar kullanıcıdan sayı gırmesını tekrarlattık bu do whıle dongusu ıle
        
        

        //  6/0 yapınca hata verıyor. kullanıcı hata aldı ama bu hata ne neyı yanlıs yaptı bı dahakı sffere neyı yapmaması lazım onu bılmıyor su an anlamadı kullanıcı
        // ekrana şu şu hatayı yaptınız yazsa guzel olmaz mı? olur.
        
        // { } ile bolumu sectı try dedı deneme hata bolgesı şeriti çekildi. catch ile de hatayı yakalattık

    }
}
