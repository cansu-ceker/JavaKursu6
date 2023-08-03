package Gun43;

import java.util.Scanner;

public class _08_ThrowExample_2 {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.println("YENİ ŞİFRE OLUŞTURMA");

        System.out.println("yeni şifre");
        String newPassword= oku.nextLine();

        try {

        if (newPassword.length()<8)
        {
            throw new Exception("şifre en az 8 karakter olmalı");
        }

        if (newPassword.length()>15)
        {
            throw new Exception("şifre en fazla 15 karakter olmalı");
        }


        }catch (Exception ex){
            // hatalar bir yere toplanıp, heosi için yazılması gereken kodlar
            // bir arada burda yapılabilir. mesela log tutma gibi

            System.out.println("lütfen dikkat");
            System.out.println(ex.getMessage());
            // hangi ip ten baglandıgını kaydedersın
            // yapılacak ortak ısler

        }



    }
}
