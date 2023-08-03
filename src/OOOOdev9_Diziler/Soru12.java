package OOOOdev9_Diziler;

import java.applet.Applet;

public class Soru12 {
    public static void main(String[] args) {

        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın.


        String [] dizi= {"Apple","Orange","Banana","Pineapple"};



        for (int i = 0 ; i <dizi.length ; i++)
        {
              if (dizi[i].equals("Apple"))

                  System.out.println("varMi Apple = " +dizi[i].equals("Apple"));

        }













    }
}
