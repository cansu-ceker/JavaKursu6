package Gun26._02_Ornek;

public class Person {

    String name;
    String surname;
    int age;

    // name, surname, age bunlara field, properties, özellik denir

    // cansu     adı-soyadı             koklar-konusur
    // nesnenin hem özelliği var hem de davranışları var
    // davranışlarına yani fonksiyonları yani metodları var
    /*
     araba dusunelim,
            rengi
            ağırlığı
            modeli
            markası    bunlar ılk bakısta gordugumuz, durumdur -> ÖZELLIKLERI

            gazaBasmak()  -> hızlanır
            freneBasmak() -> yavaşlar   bunlar -> FONKSİYONLARI -hareket metod
     */



    //3. yontem ıcın
    public void bilgiYazdir()   // statik yok bunda ve this. dıyoruz
    {
        System.out.println("adı: "+this.name);
        System.out.println("soyadı: "+this.surname);
        System.out.println("yaşı: "+this.age);
    }

    //4. yontem ıcın
    //yazdırılırken otomatik çağırılıyor
    public String toString()
    {
        return this.name+"\t"+this.surname+"\t"+this.age;
    }
/*
    public String toString2() // bu da olur
    {
       String yazilacakYazi=this.name+"\t"+this.surname+"\t"+this.age;

        return  yazilacakYazi;
    }
*/

    public void getBirthYear()
    {System.out.println("Doğum yılı = " + (2023-this.age));}

  /*
    public int getBirthYear2()  // bu da olur
    {
        return 2023-this.age;
    }


    public int getBirthYear3()  // bu da olur
    {
       int dogumYili=2023-this.age;
        return dogumYili;
    }

*/



}
