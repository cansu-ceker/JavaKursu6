package Gun08;

public class _07_JavaComparisonOperators {
    public static void main(String[] args) {

        // eşit mi, farklı mı, büyük mü, küçük mü, büyük eşit mi, küçük eşit mi


        int a=50;
        int b=50;

        //  = atama işareti
        //  == eşit mi? demek

        boolean esitMi= (a==b);
        System.out.println("a ile b eşit mi1 = " + esitMi);            //true

        // ya da boolean yazmadan direkt aşağıdakini yazarız

        System.out.println("a ile b eşit mi2 = " + (a==b));             //true

        System.out.println("a b den farklı mı = " + (a!=b));            //false

        System.out.println("a b den büyük mü = " + (a>b));              //false
        System.out.println("a b den küçük mü = " + (a<b));              //false

        System.out.println("a b den büyük veya eşit mi = " + (a>=b));   //true
        System.out.println("a b den küçük veya eşit mi = " + (a<=b));   //true


        //   a==b  eşit mi a ile b
        //   a!=b  farklı mı a ile b













    }
}
