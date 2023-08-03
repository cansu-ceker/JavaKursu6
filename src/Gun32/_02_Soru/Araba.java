package Gun32._02_Soru;

public class Araba {

    private String renk;
    private int model;
    private int motorHacmi;
    private int kapiSayisi;

    public Araba() {
    }

    // bu asagıdakılerı yapmanın kısa yolu
    // sag tik, generate, getter and setter, sonra hepsını seç
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public Araba(String renk, int model, int motorHacmi, int kapiSayisi) {
//        this.renk = renk;
//        this.model = model;
//        this.motorHacmi = motorHacmi;
//        this.kapiSayisi = kapiSayisi;

        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayisi(kapiSayisi);

    }


    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }

    public void setMotorHacmi (int motorHacmi)
    {
        if(motorHacmi<0)
            System.out.println("hatalı giriş");
        else
            this.motorHacmi=motorHacmi;
    }

    public void setKapiSayisi (int kapiSayisi)
    {
         if (kapiSayisi<7)
             this.kapiSayisi=kapiSayisi;
         else
             System.out.println("hatalı giriş");
    }

   public void setModel (int model)
   {
       if (model<0)
           System.out.println("hatalı giriş");
       else
           this.model=model;
   }







}
