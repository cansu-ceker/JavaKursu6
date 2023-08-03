package Gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {

        Calisan cal1= new Calisan();
        cal1.id=1;
        cal1.name="Cansu";
        cal1.name="Çeker";
       //  cal1.password="1234"; bu sekılde kendı sıfresını atadı yanı 8 karakter olsun şu bu kurallarını çiğner bu sekılde erişip kendı sıfresını atarsa, bunu engellemek ıcın private yaptık

        cal1.sifreAta("1234");  //bunun sonucunda zayıf sıfre yazar ekranda
        cal1.sifreAta("M123_sdf23");
        cal1.sifreGsoter();











    }
}
