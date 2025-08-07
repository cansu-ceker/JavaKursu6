package Gun30._02_FinalVariables.Ornek1;

public class Student {

    final int id;   //nesne  burada   final int id=1; gbı atama yaparsak asagıca contructor da yazamayız cnku burada atamasını yaptık. final ne demek 1 kez atandı bıttı ona baska deger veremezssın ya const ay a basta burada deger atarsın  o yada  bu
    // değiştirilemez
    // yani sadece 1 kez veri atama şansı var, tc gbı atandı dogduktan sonra ve bıttı degıstırılmez final atama yapıldı yanı :D

    String fullName;  // nesneye ait cunku basına static koymadık

   private static int sayac=1;
   // private: özel, mainden sayaca atama yapılamasın dırekt dıye
   // static : cunku bır tane olsun ve class a aıt olsun dıye

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Student(String fullName) {
        this.fullName = fullName;
        this.id=sayac++;
    }

    @Override
    public String toString() {     // toString cons yaptık ki ekrana yazdırabılelım
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
