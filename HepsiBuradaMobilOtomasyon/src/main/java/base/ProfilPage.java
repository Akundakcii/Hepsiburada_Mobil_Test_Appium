package base;

import io.appium.java_client.AppiumDriver;
import static constans.Constants.*;
public class ProfilPage extends BasePage{
    AppiumDriver driver;
    public ProfilPage(AppiumDriver driver) {
        super(driver);
    }
public ProfilPage ayarlar () throws InterruptedException {
        Thread.sleep(1000);
    click(ayarlarLoc);
    Thread.sleep(1000);
    infoLog("Prfoil İşlemleri");
    return this;
}
    public ProfilPage bilgiler () throws InterruptedException {
        Thread.sleep(1000);
        click(bilgiupdate);
        Thread.sleep(1000);
        passLog("Bilgiler Bölümüne.");
        return this;
    }
    public ProfilPage comeBack () throws InterruptedException {
        Thread.sleep(1000);
        click(geriButton);
        Thread.sleep(1000);
        passLog("Profile geri dönüldü.");
        return this;
    }
    public ProfilPage hakkinda () throws InterruptedException{
        Thread.sleep(1000);
        click(appinfo);
        Thread.sleep(1000);
        passLog("Hakkında bölümüne tıklandı");
        return this;
    }
    public ProfilPage hakkindaComeback () throws InterruptedException{
        Thread.sleep(1000);
        click(appinfoComeBack);
        Thread.sleep(1000);
        passLog("Profile geri dönüldü");
        return this;
    }
    public ProfilPage kredibutton () throws InterruptedException{
        Thread.sleep(1000);
        click(kredikartinfo);
        infoLog("Kredi Ekleme Butona tıkladı");
        Thread.sleep(1000);
        click(kartekle);
        passLog("Kredi kartı Ekleme alanı");
        Thread.sleep(1000);
        return this;
    }
    public ProfilPage kredibilgi () throws InterruptedException{
        Thread.sleep(1000);
        sendKeys(kredikartNo,"4355084355084358");
        passLog("Kredi No ekleme");
        Thread.sleep(1000);
     sendKeys(kredikartAd,"Semsettin Karas");
        passLog("Kredi kart İsim giris.");
        Thread.sleep(1000);
       sendKeys(kredikartDate,"1226");
       passLog("Kredi Ay Gün giris");
        Thread.sleep(1000);
        sendKeys(kredikartcvc,"000");
        passLog("Cvc kodu girildi");
        Thread.sleep(1000);
        click(krediKayit);
        passLog("Kredi kayıt edildi");
        Thread.sleep(1000);
        click(krediKayitButton);

        Thread.sleep(1000);
        click(kayitliKrediCikis);
        Thread.sleep(1000);
        click(anamenuDon);
        Thread.sleep(1000);
click(profCikis);
passLog("Profil Geçildi");
Thread.sleep(1000);
        return this;
    }

}
