package Gun31._02_Soru;

public class Main {
    public static void main(String[] args) {

        User user1=new User("cansu",Rol.ADMIN,Statu.AKTIF);
        User user2=new User("faruk",Rol.MUDUR,Statu.PASIF);
        User user3=new User("luna",Rol.SATIS,Statu.AKTIF);


        User.userSil(user1);
        User.userSil(user2);
        User.userSil(user3);





















    }
}
