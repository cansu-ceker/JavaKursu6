package Gun27._01_Ornek;

public class Utility {  // Utility: sınıfın, tipin adı

    public String getString(int sayi)
    {
        return String.valueOf(sayi);
        // string e çevir ver
    }

    //eğer bir metod nesnenin özelliklerini kullanıyorsa
    //Utility ut=new Utility(); gibi nesne oluşturulmadan kullanılamaz
    // dolayısla STATIC olamaz
    // NESNE ŞART







    public static String getString2(int sayi)
    {
        return String.valueOf(sayi);
        // string e çevir ver
    }

    ///bağımsız metodlar yani STATIC metodlar
    // herhangi bir nesneye bağlı çalışması gerekmeyen metodlardır
    // mainde:
    // classa adı. yani mesela bu ornek ıcın:
    // Utility. yaptıgımzdan noktaya basınca bunu mu bunu mu ıstyosun dıye onumuze gosterılenler statıc olanlardır , nesne olusturulmadan da kullanıldıgı ıcın



}
