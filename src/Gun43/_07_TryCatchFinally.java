package Gun43;

public class _07_TryCatchFinally {
    public static void main(String[] args) {

        String str="";
        long startTime=0;

        try {
            startTime=System.currentTimeMillis();
            System.out.println("hatadan önceki kısım");
            char ilkHarf=str.charAt(0);
            System.out.println("hatadan sonraki kısım");
        }catch (Exception ex)
        {
            System.out.println("hata bloğu çalıştı");
        }
        finally {
            // hata olsa da olmasa da  bu finally bölümü çalışıyor
            // try catch bloğuyle ilgili kodlar yazılır
            System.out.println("try-catch bloğu ile ilgili son yapılacaklar");
            System.out.println(System.currentTimeMillis()-startTime);
        }

        System.out.println("diğer çalışacak kodlar");
        System.out.println("program bitti");



    }
}
