package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {

        int sayi;  //hafızada int kadar yer kaplar, sadece tamsayı atılabilir.
                   // tam sayılarda default int , int i sayı kabul edıyor java


        //tamsayilar
        byte byteDeger=7;   //-128 - 127
        short shortDeger=1645;   // -32000 - 32000
        int intDeger=250000;
        long longDeger=45669789343879863L;   // eşitliğin iki tarafı da aynı olmalı
                                             // sol taraf long, sağ taraf da long olcak o sebeple L koyduk
                                             //koymasaydık sag tarafı int sanardı bılgısayar


        //ondalıklı sayıların default u double
        //ondalıklı sayı görünce double sayıyor java
        double doubleDeger=3.157484863546894945364;  //noktadan sonra 16 haneye kadar hassasiyeti var
        float floatDeger=3.54587487F; // F koymasaydık bilgisayr onu ondalıklı diye double sanardı
                                     // noktadan sonra 5 haneye kadar hassasiyeti var ama kararsız



        //karakter ve Harfler
        char basHarf='A';   //bir tane harf saklayabilir, harfte tek tırnak
        String isim="cansu";  //kelime veya cümle saklayabilir, uzunluğu değişken


        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("floatDeger = " + floatDeger);

    /* tamsayı mı kullanacaksın ( toplam, sayı gibi)--- int sayi=5;

    oran mı,kesir mi yapacaksın kusüratlı mı olacak------ double oran=3.15;
    harf mi kullancan---------- char harf='A';
    Kelime  mi kullancan--------String isim="cansu"


    byteDeger=7
    shortDeger=1645
    intDeger=250000
    longDeger=45669789343879863L
    doubleDeger=3.157484863546894945364
    floatDeger=3.54587487F
    basHarf='A'
    isim="cansu"
    boolean durum=false


    kısaca bana lazım olanlar:
    int sayi=5;
    double oran=3.14;
    char harf='A'
    String isim="ismet";
    boolean durum=false;


     */



    }
}
