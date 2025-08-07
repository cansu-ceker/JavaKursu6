package Gun35._01_Final.method;

public class AraclarMain {
    public static void main(String[] args) {

        Ucak u1=new Ucak("737");
        u1.setKilometre();


    }
}


//*******************  final özet  *****************************************
//  değişlenlerin basında olduğunde DEĞERİ sonradan değiştirilemez
//  methodların başında olduğunda OVERRIDE edilemez
//  classların başında olduğunda EXTEND edilemezler




 /* orijinalinin kullanılmasını ıstedgımz durumlarda  final kullanırız

      propertıeslere dıfinal dıyebıldıgımızı gormustuk
      class a  da diyebiliyoruz
                             public final class Tasitlar {  gibi
                                          String model;  }

      metod a da diyebiliyoruz,
      final yapılan metod override yapılamaz yanı ozellsetıremıyrıuz onu
                           public final void setKilometre() { }



*/