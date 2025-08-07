package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1= new Student(1,"cansu solmaz");
        Student ogr2= new Student(1,"faruk yılmaz");
        Student ogr3= new Student(1,"luna çeker");
      //Problem: hem id yi takip etmek zorundayım
      //         hem de id de hata olasılığı yüksek


        Student ogr10= new Student("cansuuuu");
        Student ogr11= new Student("farukkkk");
        Student ogr12= new Student("lunaaaaa");

        System.out.println("ogr10 = " + ogr10); // id 1
        System.out.println("ogr11 = " + ogr11); // id 2
        System.out.println("ogr12 = " + ogr12); // id 3



     //   ogr12.id=55555;    bu sekılde id ye erişilip atama yapılamaması için id yi int id değil de private int id diye yazarız
     //   Student.sayac=5005;   bu sekılde sayaca  erişilip atama yapılamaması için sayacın erısımını private yaptık private static int sayac=1; oldu

/*
    Student class ta
    int id=1; seklınde kalsaydı yanı basında statıc olmasaydı
              id bılgısı nesneye aıt olacaktı

                                                                                                  public Student(String fullName) {                                                                                            this.fullName = fullName;
                                                                                                    id++;    }
      Student ogr10= new Student("cansuuuu"); yeni bir ogrencı yanı yenı nesne olusturdugumda,  bu ogrencısının id si 2 oalcaktı ( 1 i 1 artırdı 2 )
      System.out.println("ogr10 = " + ogr10); // id 2


      Student ogr11= new Student("farukkkk"); bır daha yeni bir ogrencı yanı yenı nesne olusturdugumda,  bu ogrencısının id si de 2 oalcaktı ( 1 i 1 artırdı 2 )
      System.out.println("ogr11 = " + ogr11); // id 2


      Student ogr12= new Student("lunaaaaa"); bır daha yeni bir ogrencı yanı yenı nesne olusturdugumda,  bu ogrencısının id si de 2 oalcaktı ( 1 i 1 artırdı 2 )
      System.out.println("ogr12 = " + ogr12); // id 2

      neden?
      cunku basta id yi nesnee ait olarak bıraktık static yapmadık.
      dolayısıyla her nesne olsusumunda, nesnenın id sine bakıyor 1, ++ dan artırıp yazıyor
      yenı nesne olustururken yıne bakıyor bu nesnenın ıd sı ne 1 yıne artırıyor yazıyor e


      oysa ki, id yi static yaparsak,
      static int id=1; şeklinde
      1. nesneyı olusturdun, baktı bu statıc ve id ne 1 cnku ılk basta bız 1 verdık yazdı 1
      2. nesneyı olusturdun baktı statıc oldugu ıcın  en son degerını id yi korumus 1 i gordu 1 artırdı 2 yazdı
      3. nesneyı olusturdun statıc id en son neymı baktı 1 artırdı 3 oldu

      static oldugunda artık bır tane yanı her nesne olusumunda yenıden uretılmıyor o verı
      static tekrarlı olan,
             tum nesneye aıt olan
             sayac gbı ıslemlerde kullanılır


    public Student(String fullName) {                                                                                            this.fullName = fullName;
    id++;
     }

      this.id++; seklınde yazılmıyor cnku static e cevırdgımız verıyı this. seklınde yazamıyoruz o yuzden de bır sayac kullanarak,
      sayacı statıc yapıyoruz
      static int sayac=1;   sonra bu sayacı constructor da

    public Student(String fullName) {
        this.fullName = fullName;
        this.id=sayac++;          ------------ bu sekılde yapıyoruz
    }                                          hem this kullanmıs oluyoruz kı bu en dogrusu
                                               hem de id yi sayacla artırıyoruz

 */











    }
}
