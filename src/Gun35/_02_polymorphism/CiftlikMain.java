package Gun35._02_polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek ko1=new Kopek("karabaş");
//        ko1.ses();  // havladı
//        ko1.kokladi();  // kokladı

        Kedi ke1=new Kedi("tekir");
//        ke1.ses();  //miyavladı
//        ke1.tirmaladi();  // tirmaladı
//
//      kopekSesi (ko1);  // havladı
//      kediSesi(ke1); // miyavladı
//
//        // kopekSesi(ke1); olmadı

      hayvanSesi(ko1);
      hayvanSesi(ke1);


      // setlerden HashSet
        //Maplerden HashMap
        //Listlerden ArrayList

        // Hayvanlardan Kedi
        // Hayvanlardan Kopek
        // Hayvanlardan hayvan


       // Referansın       NESNE
       //ortak kaynagın     nin
        // TİPİ            TİPİ
        Hayvan hayvan1=new Hayvan("ördek");  // hayvanlardan 1 hayvan
        Hayvan hayvan2=new Kopek("kangal");  // hayvanlardan 1 köpek
        Hayvan hayvan3=new Kedi("boncuk");   // hayvanlardan 1 kedi

        System.out.println("**********************************");
        hayvan1.ses();  // ses cıkardı yazar
        hayvan2.ses();  // havladı
        hayvan3.ses();  //mıyavladı

        System.out.println("**********************************");
        ((Kopek)hayvan2).kokladi();

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNE istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.


    }

    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();
         // bir classın altında kim oldugunu bulma yöntemi
        if (hayvan instanceof Kopek) // hayvan aslında kopekse
            ((Kopek)hayvan).kokladi();

        if (hayvan instanceof  Kedi)  // hayvan aslında kediyse
            ((Kedi)hayvan).tirmaladi();
    }


    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }
}
//  Hayvan classından türettiğimiz-extend yaptığımız için
//  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
//  köpek ve kedi için classlarında Override yaparak yazdığımız
//  özellikleri alarak yazdı.
//  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
//  yazdıklarımızı hayvanSesi methodunda yazdıramayız. illa iflemeli
