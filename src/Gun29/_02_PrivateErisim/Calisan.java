package Gun29._02_PrivateErisim;

public class Calisan {   // diğer paketlerden bu class a erısılebılır fakat:
                         // aşagıdakı default erişim yaptıgımız id, name,surname e baska paketlerden erısılemez sadece kendı paketındekıler (PrivateErisim adlı paketın ıcındekıler) bu bılgılere erısebılır


    int id;          //default erişim---> cunku public yok basında oradan anladık, yani public int id; şeklinde başında bir şey yok
     String name;     //default erişim---> cunku public yok basında oradan anladık
     String surname;  //default erişim---> cunku public yok basında oradan anladık
 //  String password; //default erişim---> cunku public yok basında oradan anladık

    //şifreye erişilemesin ben kontrolunu yapayım adam erişip kendı sıfresını atamasın kurallara uygun mu sıfresı vs bakalım bız dıye onu prıvate yapmalıyız

   private  String password;  // bak basına private yazdık sımdı bu private oldu, mainde
                              // private koyduk kı basına herkes erisemesin
                              // private koyarak password e erısımıne sınır koymus olduk
    // private e erısmek ıcın metod yaptık
    // hatta bır metod yazayım ki, adam sıfresını ban gondersın ben bı kontrol edeyım kurallara uygun mu vs yanı
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
