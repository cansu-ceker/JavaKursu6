package Gun35._02_polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {    // en altta tanım var

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
        /*
         kopekSesi(ke1); olmadı kedı kopegı kopek de kedıyı kabul etmedı

         public static void kopekSesi (Kopek k){    (buraya ) ke1 gonderdık, dedi ki ben kopegıım kedıyı kabul etmem
         k.ses();
        */

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
        ((Kopek)hayvan2).kokladi();     // hayvan2 sen kopeksın dıyrouzsu sekılde (Kopek)hayvan2


    }

        public static void kopekSesi(Kopek kopek){
            kopek.ses();
        }

        public static void kediSesi(Kedi kedi){
            kedi.ses();
        }


    public static void hayvanSesi(Hayvan hay){                                        //  kedı extends hayvan
        hay.ses();                                                                    //  kopek extends hayvan yaptık ya classları yanı kedı de kopek de hayvan dedık, kedı de kopek de hayvan oldugunu bılıyor su an o yuzden hayvan
         // bir classın altında kim bu kedı mı kopek mı oldugunu bulma yöntemi if     //  public static void hayvanSesi(Hayvan hay) yapınca bu hem kedıyı hem kopegı kabul ettı ıkısı de hayvan dıye
        if (hay instanceof Kopek) // gelen hay, sen hayvanlarda  kopeksen                 INHERITANCE aldıgım tıpe burunuyorum dıyor yanı
            ((Kopek)hay).kokladi();                                                   //  kedıyım ama hayvanım aslında   kedi extends hayvan
                                                                                      //  kopegım ama hayvanım aslında   kopek extends hayvan
        if (hay instanceof  Kedi)  // gelen hay, sen hayvanlard kediysen
            ((Kedi)hay).tirmaladi();
    }



}
//  Hayvan classından türettiğimiz-extend yaptığımız için
//  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
//  köpek ve kedi için classlarında Override yaparak yazdığımız
//  özellikleri alarak yazdı.
//  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
//  yazdıklarımızı hayvanSesi methodunda yazdıramayız. illa iflemeli

/*
    classlar ınherıtance aldgı yanı kaynak class ın tıpınde  uretılırse, o super class ın tıpıne burunuyorlar kendı ozellklerını kaybetmıyorlar.
    ama kendı ozellıklerını gosteremıyorlar. onların kendı ozellıklerının ortay cıkması ıcın sen kopeksın sen kedısın gbı belırtmemız grekıyor

    buna cok cesıtlılık denır POLYMORPHISM deniyor

*********************----------Polymorphism----------***********************************
                    çok formluluk  - Çok çeşitlilik
                           şizofren bir konu

         Bir NESNE istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
         ve bu şekilde kullanılabilmesine Polymorphism denir.

         öğretmenin okulda "fizik öğretmeniyim" demesi,"matematık ogretmenıyım" demesi
         mahallede "öğretmenim" demesi gibi.
         ama okula gıttıgınde matematık ogretmenın matematık
                              fızık ogretmenının fızık dersı anlatması da ozellıklerını gostermesı

       Aynı sınıftan turedıgı zman o merkezı sınıf yanu super clasın turunde bır nesneyı baska bır yeregonderıp oradan yıne kendı metodunda calısma olayına

       farklı metodlarda ffarklı referans tıplerıyla calısmasına denır







 */