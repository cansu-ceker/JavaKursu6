package Gun35._03_polymorphism_soru;

public class OkulMain {
    public static void main(String[] args) {

      Ogrenci ogr=new Ogrenci("ayşe","yılmaz","öğrenci","5A");
      Calisan cal=new Calisan("ali","demir","tester","IT");


      Kisiler.kimlikBelgesiYazdir(ogr);
      Kisiler.kimlikBelgesiYazdir(cal);


    }
}
