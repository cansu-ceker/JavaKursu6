package Gun28._02_Ornek;

public class Main {
    public static void main(String[] args) {


       Book kitap1= new Book();
       kitap1.name="cansu";
       kitap1.publishYear=1991;
       kitap1.author="seray";

       Book kitap2= new Book("sırrı can", 1997, "seray");

       Book kitap3= new Book("ceker", 2022);



// System.out.println(kitap1.toString());  asagıdakıyle aynı,toString()  yazsan da yazmasan da java o metodu bulup calıstıryorcnku metodu olustururken toString() yazdık ozel bır metod o
        System.out.println("kitap1"+ kitap1);
        System.out.println("kitap2"+ kitap2);
        System.out.println("kitap3"+ kitap3);

    }
}
