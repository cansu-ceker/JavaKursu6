package Gun43;

public class _03_JavaException {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");
        String kelime=""; // ; koymadıgımız dusunelım

        System.out.println("Program bitti");

       //  COMPILE ERROR :  derleme zamanı hataları : program çalışamadığı zaman olan hatalar.
        // ; koymadın mesela daha program çalışmadı bu derleme  zamanı hatasıdır

        String kelime2="";
        char harf=kelime2.charAt(3);    // String index out of range: 3 haatsı alıyoruz, kelime boş ki 3. harfı olsun
        System.out.println("Program bıttı");

        // RUNTIME ERROR :  çalışma zamanı hataları :  program run start etti ama sonra aldığımız hatalar
        // RUNTIME EXCEPTION da denir
    }
}
