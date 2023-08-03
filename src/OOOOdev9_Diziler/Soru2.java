package OOOOdev9_Diziler;

public class Soru2 {
    public static void main(String[] args) {

        //Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.
        //_Cevap böyle olmalı :  "dlroW olleH"_

        String text= "Hello World";
        char [] dizi= new char[text.length()];

        for (int i = (dizi.length-1) ; i >= 0 ; i--)
        {
            dizi[i]=text.charAt(i);
            System.out.print(dizi[i]);


    }
}
}