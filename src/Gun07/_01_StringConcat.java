package Gun07;

public class _01_StringConcat {
    public static void main(String[] args) {

      // concat : bir String diğerine birleştiriyor

         String s1="Merhaba";
         String s2="Dünya";

        System.out.println(" Birleşik hali= "+s1+s2 );

        // ya da aşağıdaki gibi

        System.out.println("Birleşik hali2 = "+s1.concat(s2));
                                           //s1 e bırlestır s2 yı

        // aşağıdaki seçenekler ise arada boşluk istersek diye :

        System.out.println("Birleşik hali3 = " +s1.concat(" ").concat(s2)); //s1 ,n yanına boluş, sonra yanına  s2 bırlestır

        System.out.println("Birleşik hali4 = " +s1.concat(" "+s2)); // s1 in yanına ( bosluk ve s2 yi ) birleştir


        System.out.println("s1 = " + s1);   // s1 in değeri değişmedi
        System.out.println("s2 = " + s2);   // s2 nin değeri değişmedi







    }
}
