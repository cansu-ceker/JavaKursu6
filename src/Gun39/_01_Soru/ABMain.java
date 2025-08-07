package Gun39._01_Soru;

public class ABMain {
    public static void main(String[] args) {

        A a = new A();  // etkisi yok bunun, A classındakı statık oldugu ıcın ıcındekıne, classtan ulasırım, classın adı ne = A, A classında bır contructor yok kı calısınca etksıı olsun
        System.out.println("A.mesaj="+ A.mesaj);   //A dan merhaba


        B b =new B();
        System.out.println("A.mesaj="+ A.mesaj);   //B den merhaba
                                                   // B deki metod calıstı satatık degısken olan mesaj ın degerını degıstırdı mesaja yenı bır verı yuklendı B den merhaba yuklendı onu yazar

        A a2= new A();   // evet nesen olusturuldu, nesen olusturmanın satıge bır etkısı yok kı, statık sınıfa aıttır nesneyle ısı yok
        System.out.println("A.mesaj="+ A.mesaj); //B den merhaba yazdı yanı mesajın son degerını yazdı














    }
}
