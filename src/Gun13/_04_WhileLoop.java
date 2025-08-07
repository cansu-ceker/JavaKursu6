package Gun13;

public class _04_WhileLoop {
    public static void main(String[] args) {

        // ekrana 5 kez Merhaba yazdırın

        int sayac=1;

        while (sayac<=5)  // iken yap demek, dönme şartını yazıyoruz
        {
//            System.out.println("Merhaba");
//            sayac++;

           System.out.println((sayac++)+".Merhaba"); // bu sekılde sayac artırma ıslemı soutun ıcıne alabılırız

        }
        System.out.println("program bitti");



    }
}
