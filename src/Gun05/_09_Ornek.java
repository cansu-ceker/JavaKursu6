package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını(kg) double, boyunu(m) double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)

        Scanner oku=new Scanner(System.in);

        System.out.println(" Ağırlığınızı girin (kg)= ");
        Double kilo= oku.nextDouble();

        System.out.println(" Boyunuzu girin (m)= ");
        Double boy= oku.nextDouble();

        System.out.println("Boyunuz = " + boy + "\t"+ "Kilonuz"+ kilo);

        Double vki= kilo /(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz = " + vki);



    }
}
