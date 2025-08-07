package Gun31._03_Enum;

public enum Aylar {          //programın işleyişi içinde değiştirilmez bunlar
    Tanimsiz(0,0,""),
    OCAK (1,31,"Ocak"),
    SUBAT(2,28,"Şubat"),
    MART(3,31,"Mart"),
    NISAN(4,30,"Nisan"),
    MAYIS(5,31,"Mayıs"),
    HAZIRAN(6,31,"Haziran"),
    TEMMUZ(7,31,"Temmuz"),
    AGUSTOS(8,31,"Ağustos"),
    EYLUL(9,30,"Eylül"),
    EKIM(10,31,"Ekim"),           // parantez ıcıne yazdıklarımızı dırekt kullanabılmek ıcın boyle yapabılırız
    KASIM(11,30,"Kasım"),         // asagıdakı gbı bır cons yapıp
    ARALIK(12,31,"Aralık");

    final int ayNo;            // bunlar degıstırılemez dıye fınal yaptık
    final int gunMiktar;
    final String ayAd;

    Aylar(int ayNo, int gunMiktar, String ayAd) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.ayAd = ayAd;
    }
}
