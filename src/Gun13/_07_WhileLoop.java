package Gun13;

public class _07_WhileLoop {
    public static void main(String[] args) {

        //1 den 100e kadar olan sayıların toplamını bulunuz

        int sayi=1;
        int toplam=0;

        while (sayi<=100)
        {
            toplam=toplam+sayi;
            sayi++;
        }
        System.out.println("toplam="+toplam);


    }
}
