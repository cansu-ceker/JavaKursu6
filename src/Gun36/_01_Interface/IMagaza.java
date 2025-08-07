package Gun36._01_Interface;

//yapılacaklar listesi
public interface IMagaza {
    void BilgileriAl();
    void KrediSkorunuKontrolEt();
    void KrediSecenekleriniGoster();
    void BelgeleriImzalat();
    void KrediyiKullandir();
    void KrediSkorunuGoster();

    void oncekiAlisverisleriniKontrolEt();  // bunu sonradan bu class a ekleyınce implements ettıgımız Trendyol/hepsıburada da class alt cızgı oldu kırmzılastı,
                                            // o kırmızıya ok u getır, create tıkla ne eklendı orada gosterıyor zaten onu sen de ekle calssına
                                            // implement ettgın classa yanı bı sey daha eklendı oradan bılıyoruz



}
