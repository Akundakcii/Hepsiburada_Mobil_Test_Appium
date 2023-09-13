package base;

import io.appium.java_client.AppiumDriver;

import static constans.Constants.*;
public class OtomasyonPage extends BasePage {
    AppiumDriver driver;

    public OtomasyonPage(AppiumDriver driver) {
        super(driver);
    }

    //Giris Alert Menü
    public OtomasyonPage izinOnayla()  {
        waitSecons(5);
        click(izinlerOnayButton);
        waitSecons(5);
        infoLog("Gizlilik  Bölümü Geçildi");

        return this;
    }

    public OtomasyonPage reklamGec ()  {
        waitSecons(5);
        click(reklamKaldirma);
        waitSecons(5);
        passLog("Reklam geçildi.");
        return this;

    }
    public OtomasyonPage Kgiris ()  {
        waitSecons(5);
        click(kullaniciGirisTikla);
        waitSecons(5);
        passLog("Kullanıcı Girişi İçin Tıklama Yapıldı");
        return this;

    }
    public OtomasyonPage uyeGirsButton ()  {
        waitSecons(5);
        click(girisYapTiklama);
        waitSecons(5);
        passLog("Eposta ile giriş ");
        return this;

    }


    public OtomasyonPage kullaniciAdi ()  {
        waitSecons(5);
        sendKeys(epsotaTik,"Kullanıcı Adınızı Giriniz"); //Kullanıcı Adınızı Giriniz
        waitSecons(5);
        passLog("Eposta girişi yapıldı");
        return this;

    }
    public OtomasyonPage epostaGirisButton1 ()  {
        waitSecons(5);
       click(epostaGirsButton);
        waitSecons(5);
        passLog("Eposta giriş butuna tıklandı.");
        return this;
    }

    public OtomasyonPage SifreGiris ()  {
        waitSecons(5);
        sendKeys(SifreYazdirmaText,"Şifrenizi Buraya Giriniz"); //Şifre Girme Ekranı
        waitSecons(5);
        passLog("Şifre Girilme ekranı");
        return this;

    }
    public OtomasyonPage SifreGirisButton ()  {
        waitSecons(5);
        click(sifreGonder);
        waitSecons(5);
        passLog("Giriş yapıldı.");

        return this;

    }
    public OtomasyonPage ProfileGec ()  {

        waitSecons(5);
    click(hosgeldiniz);
        waitSecons(5);
        infoLog("Profil Alanına geçildi.");
        return this;
    }


}
