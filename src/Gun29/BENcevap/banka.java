package Gun29.BENcevap;

public class banka {
    public static void main(String[] args) {

        musteri m1=new musteri(3,"cansu","ceker");
        m1.musteriHesap=new hesap();  // hesap adında baska bır class oldugu ve o class ın ıcındekılerı kullanabılmek adına bır tanımlama yaptım burada

        m1.musteriHesap.paraYatir(100);
        m1.musteriHesap.paraYatir(200);
        m1.musteriHesap.cekPara(50);

       System.out.println(m1.musteriHesap);



    }
}
