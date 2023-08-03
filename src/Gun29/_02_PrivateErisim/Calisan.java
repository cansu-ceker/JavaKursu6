package Gun29._02_PrivateErisim;

public class Calisan {


     int id;        //default cunku public yok basında oradan anladık
     String name;  //default cunku public yok basında oradan anladık
     String surname;  //default cunku public yok basında oradan anladık
    // String password; //default cunku public yok basında oradan anladık

    //şifreye erişilemesin ben kontrolunu yapoayım adam erişip kendı sıfresını atamasın kurallara uygun mu sıfresı vs bakalım bız dıye onu prıvate yapmalıyız

   private  String password;  // bak basına private yazdık sımdı bu private oldu, mainde

public  void  sifreAta (String sifre)
{
    if (sifre.length()<8)
        System.out.println("zayıf şifre");
    else {
        this.password = sifre;
        System.out.println("Şifre başarıyla atandı");
    }
}

public void sifreGsoter()
{
    System.out.println("****"+this.password.substring(4));  // 4ten sonrasını gosterttik
}





}
