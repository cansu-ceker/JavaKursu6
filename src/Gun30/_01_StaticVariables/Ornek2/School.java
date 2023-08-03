package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1= new Student(1,"cansu solmaz");
        Student ogr2= new Student(1,"faruk yılmaz");
        Student ogr3= new Student(1,"luna çeker");
    //Problem: hem id yi takip etmek zorundayım, hem de hata olasılığı yüksek


        Student ogr10= new Student("cansuuuu");
        Student ogr11= new Student("farukkkk");
        Student ogr12= new Student("lunaaaaa");

        System.out.println("ogr10 = " + ogr10); // id 1
        System.out.println("ogr11 = " + ogr11); // id 2
        System.out.println("ogr12 = " + ogr12); // id 3



     //   ogr12.id=55555;    bu sekılde id ye erişilip atama yapılamaması için id yi int id değil de private int id diye yazarız














    }
}
