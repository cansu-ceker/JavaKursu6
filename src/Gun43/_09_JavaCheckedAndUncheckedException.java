package Gun43;

public class _09_JavaCheckedAndUncheckedException {
    public static void main(String[] args) {


        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.




        String kelime="";
        char ilkHarf=kelime.charAt(0);  // zorunlu değil, UnChecked Exception

        try {
            Thread.sleep(1000);  // 1 saniye bekle demek  bunu yazınca sleep ın altında kırmızı cıktı hata verdı
                                 // oray geldık try catch yap dedık more options dan tıklayınca bu 1. yontem  ya da
                                 //    try-catch mecbur : bunlara Checked Exception denir
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
