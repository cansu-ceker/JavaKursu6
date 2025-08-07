package Gun28._03_Ornek;

public class Book {

// bu 3unu bız yazdık
    String name;
    int publishYear;
    String author;


    //  asagıdakı constructor u elle yazmak yerıne:
    // sağ tik Generate - Const- () ıcınde ne olmasını ıstyoprsan sec
    // hıcbırını secmezsen generate -> const -> secme hıcbırını ve ok de
    public Book() {
    }





    //  asagıdakı constructor u elle yazmak yerıne:
    // sağ tik Generate -> Const -> () ıcınde ne olmasını ıstyoprsan sec- burada 3 unu sectım ve java kendı yapıyor contructor yazıyor


    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }



    // sağ tik Generate -> Const -> () ıcınde ne olmasını ıstyoprsan sec- burada 2sini sectım ve yazdı

    public Book(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;  //this(name,publishYear,""); seklınde yazmak ıstwseydık bunu elle yazmamız gerekırdı ve
                                        // this () seklınde cagırdıgımız ıcın olmayan verıyı int ise 0 str ıse "" seklınde belırtmemız gerekırdı
    }



 // sag tık -> generate -> toString   yazdırma komutu maınde dırekt sout olsun dıye

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }

}
