package Gun33._01_Inheritance;

public class YoneticiYeni extends  Personel {


    // Diğer classın her özelliğini ve metodlarını
    // alıp kullanmaya INHERITANCE yani kalıtım yani miras alma denir.
    // şu şekilde alınır:
    //       ................ extends ...............
    // yeni actıgın class adı extends almak ıstedıgın ozellıklerın bulundugu clasın adı
    //...(subclass, child).....extends ten oncekı classa verılen ısımler
    //                                 extends ten sonra gelen yanı ozellıklerını aldıgımız sınıfa ..( super class, parent class, base class)... denir

    // birazını alayım bazısını almayayım yok,
    // babadan miras para kaldı alayım borç kaldı almayayım yok HER SEYI ALIRSIN INHERITANCE ile


    // yani bu classta
    // hem Personel ısımlı class ta ne varsa aynısı burada da var
    // hem de ne yazmak ıstersen o var, alttaki metodu yazdık mesela

    public void zamYap ()
    {
        System.out.println("Zam yapıldı.");
    }

}
