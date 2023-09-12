package base;

import io.appium.java_client.AppiumDriver;

import static constans.Constants.*;
public class OtomasyonPage extends BasePage {
    AppiumDriver driver;

    public OtomasyonPage(AppiumDriver driver) {
        super(driver);
    }

    //Giris Alert Menü
    public OtomasyonPage izinOnayla() throws InterruptedException {
        Thread.sleep(1000);
        click(izinlerOnayButton);
        Thread.sleep(1000);
        infoLog("Gizlilik  Bölümü Geçildi");

        return this;
    }

    public OtomasyonPage reklamGec () throws InterruptedException {
        Thread.sleep(1000);
        click(reklamKaldirma);
        Thread.sleep(1000);
        passLog("Reklam geçildi.");
        return this;

    }
    public OtomasyonPage Kgiris () throws InterruptedException {
        Thread.sleep(1000);
        click(kullaniciGirisTikla);
        Thread.sleep(1000);
        passLog("Kullanıcı Girişi İçin Tıklama Yapıldı");
        return this;

    }
    public OtomasyonPage uyeGirsButton () throws InterruptedException {
        Thread.sleep(1000);
        click(girisYapTiklama);
        Thread.sleep(1000);
        passLog("Eposta ile giriş ");
        return this;

    }


    public OtomasyonPage kullaniciAdi () throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(epsotaTik,"Kullanıcı Adınızı Giriniz"); //Kullanıcı Adınızı Giriniz
        Thread.sleep(1000);
        passLog("Eposta girişi yapıldı");
        return this;

    }
    public OtomasyonPage epostaGirisButton1 () throws InterruptedException {
        Thread.sleep(1000);
       click(epostaGirsButton);
        Thread.sleep(1000);
        passLog("Eposta giriş butuna tıklandı.");
        return this;
    }

    public OtomasyonPage SifreGiris () throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(SifreYazdirmaText,"Şifrenizi Buraya Giriniz"); //Şifre Girme Ekranı
        Thread.sleep(1000);
        passLog("Şifre Girilme ekranı");
        return this;

    }
    public OtomasyonPage SifreGirisButton () throws InterruptedException {
        Thread.sleep(1000);
        click(sifreGonder);
        Thread.sleep(1000);
        passLog("Giriş yapıldı.");

        return this;

    }
    public OtomasyonPage ProfileGec () throws InterruptedException {

        Thread.sleep(1000);
    click(hosgeldiniz);
    Thread.sleep(1000);
        infoLog("Profil Alanına geçildi.");
        return this;
    }


}
