package Gun14;

import java.util.Scanner;

public class _07_forLoop {
    public static void main(String[] args) {

        // kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.


        Scanner oku=new Scanner(System.in);
        System.out.println("Rakam gir = ");
        int rakam= oku.nextInt();
        int toplam=0;

        for (int i=0 ; i<=rakam ; i++)
        {
            toplam=toplam+i;
        }
            System.out.println("toplam = " + toplam);


    }
}
