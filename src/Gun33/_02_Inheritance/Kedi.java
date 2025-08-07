package Gun33._02_Inheritance;

public class Kedi extends Hayvan {

    public Kedi(String renk, String cins, int kilo) {
        super(renk, cins, kilo);
        // super : miras alınan sınıf
    }


    // kedıdeyken konustu mıyavladı
    // kopekteyken konustu havladı yapcam yanı mırası alcam ve aldıgımı ozellestırcem yani


    // asagıdakını yazmak ıcın sag tık, generate, override methos ve sec . burada konustu metodunu sectık tekrar yazdıurdık

    @Override
    public void konustu() {
        super.konustu();   // super class tan yanı mıras alınan classtan gelen ses cıkardı yı yazdırmak ıcın bu kalsın dedık
        System.out.println("miyavladı");   //  cıkardıya ek olarak mıyavladı yazdırmak ıstedık dıye bunu yazdık
    }

   /*
   usttekını yazmasak da sadece bunu yazsaydık,
   @Override
   public void konustu() {
        System.out.println("miyavladı");   }

artık miras alınan olan konustu() yu yazmaz, bızım buraya yazdıgımızı yazardı ekrana yanı
mıras alınan metodtan gelen konustu() ıcındekı ses cıkardıyı yazma
buraya bızım yazdıgımız konustu() ıcındekı mıyavladı yı ekrana yazardı
aynı ısımle ıkı metod oldugu ıcın, en son bız ne yazdıysak onu yazar,


    */


}
