package Gun17;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {

        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // Bu gun hava cok guzel -> 5

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle girin=");
        String cumle= oku.nextLine();
                                               //split("+") falan da yapabılırız + ya gore cumleyı bol demıs oluruz
        String[] kelimeler=cumle.split(" ");  // cumleyı 1 bosluga gore bol dıyoruz ve bunun sonucunu [] a atadık
        System.out.println("kelimeler = " + kelimeler.length);  // kac kelıme var onu yazdırdık
    }
}
  /*      klimler çok  değişti

          String[] kelimeler=cumle.split(" ");

          kelimeler[0] -> "iklimler"
          kelimeler[1] -> "çok"
          kelimeler[2] -> "değişti"

          elime.length -> 3

   */