package Gun13;

import java.util.Scanner;

public class _03_Switch {
    public static void main(String[] args) {

         //girilen bir ay numarasına göre 1 ayın kaç gğn sürdüğünü yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.print("Ay numarası kaç=");
        int sayi= oku.nextInt();


        switch (sayi)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("31"); break;

            case 2: System.out.println("28");break;

            case 4: case 6: case 9: case 11: System.out.println("30");break;  // bu şekilde yanyana da yazılabilir

            default: System.out.println("Hatalı ay no girdiniz");
        }



    }
}
