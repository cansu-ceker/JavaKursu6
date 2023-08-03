package Gun30._02_FinalVariables.Ornek1;

public class Student {

    final int id;   //nesne
    // değiştirilemez
    // yani sadece 1 kez veri atama şansı var, tc gbı atandı dogduktan sonra ve bıttı degıstırılmez final atama yapıldı yanı :D

    String fullName;  // nesneye ait cunku basına static koymadık

   private static int sayac=1;

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
