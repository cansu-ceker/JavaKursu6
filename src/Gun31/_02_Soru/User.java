package Gun31._02_Soru;


public class User {

    String username;
    Rol rol;
    Statu statu;

    public static void userSil (User user)
    {
        if (user.rol==Rol.ADMIN)
            System.out.println("Admin silinemez");
        else
            System.out.println("user silindi");
    }


    public User(String username, Rol rol, Statu statu) {
        this.username = username;
        this.rol = rol;
        this.statu = statu;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", rol=" + rol +
                ", statu=" + statu +
                '}';
    }
}

