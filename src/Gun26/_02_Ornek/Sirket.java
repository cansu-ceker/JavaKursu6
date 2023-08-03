package Gun26._02_Ornek;

import Gun26._01_Ornek.Ogrenci;

import java.util.ArrayList;

public class Sirket {
    public static void main(String[] args) {

        Person personel1=new Person();  // nesne1
        Person personel2=new Person();  //nesne2

        personel1.name="Cansu";
        personel1.surname="Çeker";
        personel1.age=32;

        personel2.name="Faruk";
        personel2.surname="Çeker";
        personel2.age=39;

//1.yöntem
        System.out.println("personel1 = " + personel1.name);
        System.out.println("personel1 = " + personel1.surname);
        System.out.println("personel2 = " + personel2.age);

//2.yöntem metod ıle cagırmak

        BilgiYazdir(personel1);
        BilgiYazdir(personel2);

//3. yol, davranıs metodundan cagırdık, class ın ıcınde yazdıgımzı metoddtan
        personel1.bilgiYazdir();
        personel2.bilgiYazdir();

//4. yol
        System.out.println("personel1 = " + personel1);   // public String toString() ten geldı Person classın ıcındekinden
        System.out.println("personel2 = " + personel2);


        personel1.getBirthYear();
        personel2.getBirthYear();

        System.out.println("personel1in doğum yılı = " + personel1.getBirthYear2());
        System.out.println("personel2nin doğum yılı = " + personel2.getBirthYear3());

    }

    public static void BilgiYazdir(Person personel)  // yukarıdan personel1 i buraya gönderince metodda  personel1 in degerlerını buluyor ,personel2 yi de gönderiyoruz o sebeple yukarıdakı parantez ıclerıne hem personel1 hem personel2 yazdık
    {
        System.out.println("personel1 = " + personel.name);
        System.out.println("personel1 = " + personel.surname);
        System.out.println("personel2 = " + personel.age);
    }

}
