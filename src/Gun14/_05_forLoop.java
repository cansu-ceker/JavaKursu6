package Gun14;

public class _05_forLoop {
    public static void main(String[] args) {

        //1 den 5 e kadar olan sayıları ekrana yazdırınız


        int sayac=1;

        while (sayac<=5)
        {
            System.out.println("sayac = " + sayac);
            sayac++;
        }



         // döngünün kaç kere döneceği belliyse sayac vardır
        // sayacın başlangıç  değeri belli, artış değeri belli, şartı belliyse
        // bi güzellik yapıp döngüyü basitleştirmişler


        // başı belli,sonu belli, artışı belli ----> FOR DÖNGÜSÜ
        for (sayac=1 ; sayac<=5 ; sayac++)   //sayac++ dan sonra ; yok cunku ; ayıraç
        {
            System.out.println("sayac for = " + sayac);
        }

      /*
             Döngülerle ilgili sonuç özeti
          1- Kaç kere döneceği belli ise : FOR düngüsü
          2- Kaç kere döneceği belli değilse While veya doWhile
          3- kontrol başta ise While,  sonda doWhile kullanacağız.
       */













    }
}
