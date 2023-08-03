package OOOOdev11_Metodlar;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

//        adı  reverseWord olan bir method oluşturun
//        Bu methodun String olarak bir parametresi olmalıdır
//        Ve bu cümledeki kelimelerle tersine çevirmeli
//        Ters halini yazdırın.
//        Örnek 1 :
//        Dize: Java yazın
//        dönüş şöyle olmalıdır:  yazın Java


        reverseWord ();

    }

        public static void reverseWord ()
        {

            Scanner oku=new Scanner(System.in);
            System.out.print("Cümle Giriniz=");
            String cumle=oku.nextLine();

            String [] kelime= cumle.split(" ");


            for (int i = kelime.length-1 ; i >=0 ; i--)
            {
                System.out.print(kelime[i]+" ");

            }





        }





}
