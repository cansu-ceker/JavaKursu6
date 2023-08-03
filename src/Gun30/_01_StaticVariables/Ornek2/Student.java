package Gun30._01_StaticVariables.Ornek2;

public class Student {
    int id=1;   //nesne
    String fullName;  // nesneye ait cunku basına static koymadık

   static int sayac=1;  //kime ait:class a cunku basına static yaptık artık o class a ait
    //sen bitanesin.
    // static olmadan herzaman 1 le başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.

    // basına static koyduklarımızı this dıye cagıramayız, this.sayac olmaz yani, sayac static yapmıstık dıye
    // thıs yanı bu dıyerek bu nesnenın ozellıgı , nesnenın bu idsi , nesnenin bı bılmemnesı demiş oluyoruz cnku


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
