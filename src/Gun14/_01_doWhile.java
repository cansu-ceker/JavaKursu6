package Gun14;

import java.util.Scanner;

public class _01_doWhile {
    public static void main(String[] args) {

        //kullanıcı 0 değerini giderene kadar
        //girdiği sayıların toplamını bulunuz


        Scanner oku=new Scanner(System.in);

        int toplam=0;
        System.out.print("sayi giriniz=");
        int sayi= oku.nextInt();
        toplam=toplam+sayi;


        while (sayi!=0)    //sayının 0 dan farklı oldugu zaman döngü dönsün demek
                            // dongunun yanı whıle ın ıcınde olan ne varsa dısarıda onu once tanımlaman lazım
        {
            System.out.print("sayi giriniz=");
            sayi=oku.nextInt();
            toplam=toplam+sayi;
        }

        System.out.println("toplam = " + toplam);










    }
}
