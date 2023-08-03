package Gun32._01_Encapsulation;

public class Kisi {

 private  String ad; //25 karakter sınır
 private String soyad; //25
 private int yas;


 public void yasAta (int yas)
 {
     if(yas<0)
         System.out.println("hatalı giriş");
     else
         this.yas=yas;
 }

public void setAd (String ad)
{
    if (ad.length()<25)
        this.ad=ad;
    else
        System.out.println("hatali giriş");
}

public void setSoyad (String soyad)
{
    if (soyad.length()<25)
        this.soyad=soyad;
    else
        System.out.println("hatalı giriş");
}

public int yasVer ()
{
    return this.yas;
}


public String getSoyad ()   // atadıgın soyadı gerı ver

{
    return this.soyad;
}


public String getAd ()
{
    return this.ad;
}







}
