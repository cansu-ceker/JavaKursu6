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
        // hepsınde tekrar edenler  varsa bu veri class a aittir, basına static yazmalıyız ki

        // class ta static olarak o tekrar edenı yazarız, mainde de:

        Ogrenci ogr1=new Ogrenci("ADAAAAAAA","ÇEKEEEEEEER");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd="Süleyman Demirel İlkokulu";
        System.out.println("ogr1 tekrarla = " + ogr1);


        // aynı verinin hafızada NESNE sayısı kadar tekrarlanması engellendi

        // static degıskenlerde bı tane oldugu ıcın sen bı tanesın dedgımz ıcın, en son ne deger ne yazı atandıysa onu yazar,
        // static i erişim nasıl olur, yanı onu nası yazdırırırz gbı dusunebılırız

    }
}
