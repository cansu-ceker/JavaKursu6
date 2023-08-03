package Gun26._02_Ornek;

public class Person {

    String name;
    String surname;
    int age;

    // bunlara field, properties, özellik denir

    // nesnenin hem özelliği var hem de davranışları var
    // davranışlarına-fonksiyonları yani metodları var

    public void bilgiYazdir()  //3. yontem ıcın
    {
        System.out.println("adı: "+this.name);
        System.out.println("soyadı: "+this.surname);
        System.out.println("yaşı: "+this.age);
    }

    //yazdırılırken otomatik çağırılıyor
    public String toString()
    {
        return this.name+"\t"+this.surname+"\t"+this.age;
    }

    public String toString2() // bu da olur
    {
       String yazilacakYazi=this.name+"\t"+this.surname+"\t"+this.age;

        return  yazilacakYazi;
    }

    public void getBirthYear()
    {
        System.out.println("Doğum yılı = " + (2023-this.age));
    }

    public int getBirthYear2()  // bu da olur
    {
        return 2023-this.age;
    }

    public int getBirthYear3()  // bu da olur
    {
       int dogumYili=2023-this.age;
        return dogumYili;
    }





}
