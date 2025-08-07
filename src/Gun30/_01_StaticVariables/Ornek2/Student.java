package Gun30._01_StaticVariables.Ornek2;

public class Student {
   private int id=1;   //nesneye ait bu sekılde yazılınca
    //   mainde ogr12.id=55555;    bu sekılde id ye erişilip atama yapılamaması için id yi int id değil de private int id diye yazarız

    // static int id; deseydik basında statıc oldugu ıcın id artık sınıfa aıt olacaktı
    String fullName;  // nesneye ait cunku basına static koymadık

    private static int sayac=1;  //kime ait:class a cunku basına static yaptık artık o class a ait
    //mainde Student.sayac=5005;   bu sekılde sayaca erişilip atama yapılamaması için sayacın erısımını private yaptık private static int sayac=1; oldu
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
