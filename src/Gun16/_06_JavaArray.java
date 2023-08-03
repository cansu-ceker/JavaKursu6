package Gun16;

public class _06_JavaArray {
    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz. trtr, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

       String [] kanal={"trt","atv","fox","ahaber","halk"};

     int randomIndex= (int)(Math.random()*kanal.length);

        System.out.println("random bir kanal = " + kanal[randomIndex]);

    }
}
