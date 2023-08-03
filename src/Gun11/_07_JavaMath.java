package Gun11;

public class _07_JavaMath {
    public static void main(String[] args) {

        int a=-12;   // double versek de aşağıdaki komutlar çalışır
        int b=4;

        System.out.println("a nın mutlak değeri= "+ Math.abs(a));  //12   absolute= mutlak değer
        System.out.println("a ve d den büyük olanı=  "+ Math.max(a,b));  //4
        System.out.println("a ve d den küçük olanı=  "+ Math.min(a,b));  //-12
        System.out.println("2 nin 3. kuvveti ="+ Math.pow(2,3));  //2*2*2
        System.out.println("b nin karekökü= "+ Math.sqrt(b));  //b nin karekökü
        System.out.println("3.1 in round (yuvarlama) ="+ Math.round(3.1));  //3   round=yuvarlama
        System.out.println("3.5 ün round (yuvarlama) ="+ Math.round(3.5));  //4

        System.out.println("3.1 in üstündeki en yakın tamsayı ="+ Math.ceil(3.1));  //4   ceil =tavan
        System.out.println("3.5 in üstündeki en yakın tamsayı ="+ Math.ceil(3.1));  //4

        System.out.println("3.1 in altındaki en yakın tamsayı ="+ Math.floor(3.1));  //3   floor= yer
        System.out.println("3.5 in altındaki en yakın tamsayı ="+ Math.floor(3.5));  //3


    }
}
