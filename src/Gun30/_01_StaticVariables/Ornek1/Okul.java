package Gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {

//        Ogrenci ogr1= new Ogrenci("İsmet", "temur", "Atatürk İlkokulu");
//        Ogrenci ogr2= new Ogrenci("cansu", "korkmaz", "Atatürk İlkokulu");
//        Ogrenci ogr3= new Ogrenci("faruk", "çeker", "Atatürk İlkokulu");
//        ...
//        ...
//        ...
//        Ogrenci ogr499= new Ogrenci("seray", "gezer", "Atatürk İlkokulu");
//        Ogrenci ogr500= new Ogrenci("mehmet","yatar", "Atatürk İlkokulu");

        // burada Atatürk İlkokulunda oldugu gibi
        // hepsınde tekrar edenler  varsa bu veri nesneye ait değil,  class a aittir, basına static yazmalıyız ki
        // bır seyın basına statik yazınca o class a ait olmus oluyor artık
        // class ta static olarak o tekrar edenı yazarız, mainde de:

        Ogrenci ogr1=new Ogrenci("ADAAAAAAA","ÇEKEEEEEEER");
        System.out.println("ogr1 = " + ogr1);

     //   ogr1. dıyerek okul adına erısmemem cnku okul adı class a aır bır bılgı, nesneye (yanı buradakı ogr1)e aıt bır verı degıl, ogr2 ye de ogr3e de ... hesıne aıt bır se dıye bız onu class a aıt yaptık statıc yazarak basına

        Ogrenci.okulAd="Süleyman Demirel İlkokulu";
        System.out.println("ogr1 tekrarla = " + ogr1);  // en son verılen degerı yazar


        // AYNI verinin çok kez girişi engellendi böylelikle
        // AYNI verinin hafızada NESNE sayısı kadar tekrarlanması engellendi

        // static degıskenlerde bı tane oldugu ıcın sen bı tanesın dedgımz ıcın, en son ne deger ne yazı atandıysa onu yazar,
        // static i erişim nasıl olur, yanı onu nası yazdırırırz gbı dusunebılırız

    }
}
