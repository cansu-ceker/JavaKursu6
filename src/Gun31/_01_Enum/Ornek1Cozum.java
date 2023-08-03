package Gun31._01_Enum;


public class Ornek1Cozum {
       // enumaration  : numaralandırılmış simgeler demek , ınt degıl zaqten 1-0 yazmmak hanı boolean sonucu 1yada 0 dır bız ama true false gorururuz, onun gbı 1-0 yazmayalım sımge yazalım dedık yanı ınt degıl
       // 0 dan baslıyor sırayla gıdıyor enum sıra yapıyor o hafızada 0-1-2.. gıdıyor bız onu ne ısım verdıysek oyle kullanıyoruz
       // kelime olarak gecer, harflerlebaslayıpsayı verebılırz ama cnasu5 gbı ama gerek yok kafa karısmasın
       public static void main(String[] args)
       {
           Aylar ay=Aylar.MAYIS;

           switch (ay)
           {
               case SUBAT: System.out.println(28); break;
               case OCAK:
               case MART:
               case MAYIS:
               case TEMMUZ:
               case AGUSTOS:
               case EKIM:
               case ARALIK: System.out.println(31); break;
               case NISAN:
               case HAZIRAN:
               case KASIM:
               case EYLUL: System.out.println(30);break;

           }

           if (ay==Aylar.MAYIS)
               System.out.println("zam ayı");

           System.out.println("ay = " + ay);   // toString SIMGE MAYIS
           System.out.println("ay.name() = " + ay.name());  //SIMGE MAYIS
           System.out.println("ay.ordinal() = " + ay.ordinal());  //SIMGE nin indexi 5 yani mayıs 5 işte

           
           for (Aylar a : Aylar.values())
               System.out.println(a.name()+ "- " + a.ordinal());

       }


// Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.


}
