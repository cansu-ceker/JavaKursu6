package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

         // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print(" Cümle girin = ");
        String cumle= oku.nextLine();



        // 1.YOL :
        boolean varMi =cumle.contains("a");

        if (varMi==true)
            System.out.println(" EVET ");

        if(varMi==false)
            System.out.println(" HAYIR");




       // 2. YOL :

        if(cumle.contains("a")==true)
            System.out.println(" EVET ");

        if(cumle.contains("a")==false)
            System.out.println(" HAYIR ");





        // 3. YOL :

        if(cumle.contains("a"))
            System.out.println(" EVET ");

        if(!cumle.contains("a"))               // oradaki ! , DEĞİLSE DEMEK, yani bu sayır diyor ki, true değilse aşağıdakini yazdır
            System.out.println(" EVET ");       //  if(!cumle.contains("a"))  İLE if(cumle.contains("a")==false)   AYNI ŞEY DEMEK





         //alternatif :


        cumle.contains("a");      // a yı içeriyor mu
        cumle.indexOf("a");       // a içeriyor ise index ini verir ( 0-...)
                                  //  a içermiyorsa -1 verir


        if(cumle.indexOf("a")>=0)
            System.out.println(" evet");

        if (cumle.indexOf("a")==-1)
            System.out.println("hayır ");








    }
}
