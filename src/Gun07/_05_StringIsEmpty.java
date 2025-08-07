package Gun07;

public class _05_StringIsEmpty {
    public static void main(String[] args) {

        // isEmpty : bir String in içinde bir şey var mı yok boolean olark verir
        // String in içi boş mu dolu mu demek


        String s1= "Merhaba";
        String s2= " ";
        String s3= "";

       System.out.println("s1 boş mu = " + s1.isEmpty()); //false
       System.out.println("s2 boş mu = " + s2.isEmpty()); //false - cnku bosluk var yanı dolu, bos degıl
       System.out.println("s3 boş mu = " + s3.isEmpty()); //true, bos yanı



  /* ya da çözüm :

        String s1= "Merhaba";
        String s2= " ";

        boolean bosMu=s2.isEmpty();
        System.out.println("s2 boş mu1 = " + bosMu);




         */









    }
}
