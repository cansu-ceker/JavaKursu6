package Gun27._01_Ornek;

public class Utility {

    public String getString(int sayi)
    {
        return String.valueOf(sayi);
        // string e çevir ver
    }

    //eğer bir metod nesnenin özelliklerini kullanıyorsa
    //   Utility ut=new Utility(); gibi nesne oluşturulmadan kullanılamaz
    // dolayısla STATIC olamaz
    // NESNE ŞART







    public static String getString2(int sayi)
    {
        return String.valueOf(sayi);
        // string e çevir ver
    }

    ///bağımsız metodlar yani STATIC metodlar
    // herhangi bir neseneye bağlı çalışması gerekmeyen metodlardır



}
