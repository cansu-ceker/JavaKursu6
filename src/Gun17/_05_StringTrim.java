package Gun17;

public class _05_StringTrim {
    public static void main(String[] args) {

        // trim : String başındaki ve sonundaki boşlukları kırpar


        String text1= "     Merhaba Dünya              ";
        String text2= "     Merhaba         Dünya              ";

        System.out.println("Orijinal hali = " + text1);
        System.out.println("trimlenmiş1 hali = " + text1.trim());
        System.out.println("trimlenmiş2 hali = " + text2.trim());



    }
}
