package Gun43;

import Tools.MyFunc;

public class _09_JavaCheckedAndUncheckedException {
    public static void main(String[] args) {


        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.



        String kelime="";
        char ilkHarf=kelime.charAt(0);  //  try catch kullanımı zorunlu değil, UnChecked Exception

        MyFunc.bekle(100);


        try {
            Thread.sleep(1000);  // 1 saniye bekle demek  bunu yazınca sleep ın altında kırmızı cıktı hata verdı

                                 //    try-catch mecbur : bunlara Checked Exception denir
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

/*         Thread.sleep(1000); yapınca sleep altında kırmızı hata cıktı
           kırmızıya ok u getırınce
          1. yontem ,More options var ona tıkladık try catch yap dedık,
          2. yontem, Add exception to method signature yapılır.

          1 ile 2 yı yapma arasındaki fark:

          1 de try catch e alıyor
          2 deA dd exception a tıklayınca, public static void main(String[] args) { olan method
                                           public static void main(String[] args) throws InterruptedException { oluyor dırekt kendı eklıyor

          2 yı kullanırsan MyFunc.bekle(100) gbı metodlu kullandıgında, yıne kulandıgın yerde hata verıyor benı ılaa try catch yap dıyor
          boyle ılla kı  zorunlu try catch kullandıran kodlara Checked Exception dıyoruz
                          zorunlu  olmayan try catch kullandıgımız  kodlara UnChecked Exception dıyoruz


 */





    }
}
