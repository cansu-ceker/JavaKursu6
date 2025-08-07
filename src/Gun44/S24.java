package Gun44;

public class S24 {
    public static void main(String[] args) {


        String [] str=new String[2];
        int idx=0;

        // bu adımda yazdırsak :
        //   for (int i = 0; i < str.length; i++) {System.out.println(str[i]);}
        // string degerı null cıkar


        for ( String s: str) {
            str[idx].concat("element"+idx);  // en basta zaten dızıye bır atama yapılmamıs kı null ıste , nulla concat de yapılmaz
            idx++;
        }


        for (idx=0 ; idx<str.length ;idx++)
        {
            System.out.println(str[idx]);
        }

  //     NULL değere bir şey eklenemez NULLPointer exception












    }
}
