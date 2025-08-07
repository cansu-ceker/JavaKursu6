package Gun28._01_Ornek;

public class Ogrenci {

    int id;
    String ad;
    String soyad;
    int sinif;

/*
yapıcı metodlar: Constructor metodlar
                 bır seyı yenı ılk kez olustururken kullanılır
                  public Ogrenci(){}  seklındedır voıd vs yok
                  Constructor ın adı sınıfıyla aynıdır burada Ogrencı mesela
 2. ya da 3. yolu yazdıysan 1. boş olanı yazmak zorundasın 1. yı yazmazsan related problemı dıyor


egr kı mainde         Ogrenci ogr1=new Ogrenci();   yı yazmamıs olsaydık
1. yoldakı bos metodu yazmamızı ıstemeyecektı.
maınde bos varsa- classta bos metod yap



 */

    //  1. yol yapıcı metodlar: Constructor metodlar
    public Ogrenci()
    {

    }


    //2. yol  yapıcı metodlar: Constructor metodlar
    public Ogrenci(int id,String ad, String soyad,int sinif)
    {
    // en  yukarıda int id; dediğim  = burada id diye (int id) gonderdıgım
        this.id=id;    // senin id sana gonderdgıgım id
        this.ad=ad;    // senın adın sana gonderdıgım adın... demek
        this.soyad=soyad;
        this.sinif=sinif;
    }

    //  3. yol yapıcı metodlar: Constructor metodlar
    public Ogrenci(int id,String ad, String soyad)  // sınıf ı henuz vermedım dıyelım
    {
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinif=0;    //bu sekılde ısnıfı bos 0 dıyeılırım
    }


/*  // 3 un yerıne gecen yol

bır yukarıdakını yani:
public Ogrenci(int id,String ad, String soyad,int sinif) i da cagırarak bir yukarıdakını yaptırabılırız su sekılde:

   public Ogrenci (int id,String ad, String soyad)
    {
        this(id,ad,soyad,0); // this= Ogrenci,kendisi

    }

*/





}
