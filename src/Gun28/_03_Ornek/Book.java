package Gun28._03_Ornek;

public class Book {

// bu 3unu bız yazdık
    String name;
    int publishYear;
    String author;

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    // sağ tik Generate - Const- sec 3 unu  ne olmasını ıstyoprsan sec java kendı yapıyor yazıyor


    // hıcbırını secmezsen generate-const-secme ok de
    public Book() {
    }

    public Book(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }



 // sag tık-generate-toString yazdırma komutu maınde dırekt sout olsun dıye

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}
