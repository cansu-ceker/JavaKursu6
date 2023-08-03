package Gun07;

public class _08_StringStartsWith {
    public static void main(String[] args) {

        // StartsWith  : bununla başlıyor mu
        // sonuç true veya false

        String text="HCL Teknoloji";  //LeasePlan


        System.out.println(" HC ile başlıyor mu= " +text.startsWith("HC") );  // true
        System.out.println(" te ile başlıyor mu= " +text.startsWith("te") );  //false
        System.out.println(" h ile başlıyor mu= " +text.startsWith("h") );   //false




    }
}
