package Gun43;

import java.util.Scanner;

public class _08_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("YENİ ŞİFRE OLUŞTURMA");

        System.out.println("yeni şifre");
        String newPassword= oku.nextLine();

        if (newPassword.length()<8) {
            System.out.println("lütfen dikkat !  şifre en az 8 karakter olmalı");
            // hangi ip den bağlanıldı
            // yapılacak ortak işler
        }

        if (newPassword.length()>15) {
            System.out.println("lütfen dikkat !  şifre en fazla 15 karakter olmalı");
            // hangi ip den bağlanıldı
            // yapılacak ortak işler
        }



    }
}
