package Gun45;

public class S56 {
    public static void main(String[] args) {
        String names[] ={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;

        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);  // omas // 2 dahil, 5 dahil demek doğru mu
                System.out.println(pwd[idx]);  // omas yazıldı
                idx++;
            }
        }catch(Exception e)
        {
            System.out.println("Invalid Name"); // Invalid Name
        }


       /*     for (String n : names) {                    Thomas ıcın omas yazıldı, index 1 arttı
            try {                                 sıra geldi Peter a, Peter da 2-5 var mı,  2-3-4 yani ter var 5 yok olmadıgı ıcın try catch e düşecek va Invalid Name yazılacak ekrana
                pwd[idx] = n.substring(2, 6);
                System.out.println(pwd[idx]);
                idx++;
            } catch (Exception e) {
                System.out.println("Invalid Name");
            }

        try catch herhangı bır for un ıcınde degıl
        o yuzden hatayı yazınca cıktı
        bır dongunun ıcıne dahıl degıl kı hatayı gorunce devam etsın


        eger kı , bır for dongusunun ıcıne yazılmıs olsaydı try catch, hatayı yakalayıp donguden doalayı devam ederdı dongu sartı tamamlanıncaya kadar
        bır sonrakı class ta S56_2 dekı gbı





     */








    }
}


