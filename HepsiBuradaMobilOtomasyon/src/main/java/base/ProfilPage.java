package base;

import io.appium.java_client.AppiumDriver;
import static constans.Constants.*;
public class ProfilPage extends BasePage{
    AppiumDriver driver;
    public ProfilPage(AppiumDriver driver) {
        super(driver);
    }
public ProfilPage ayarlar ()  {
    waitSecons(5);
    click(ayarlarLoc);
    waitSecons(5);
    infoLog("Prfoil İşlemleri");
    return this;
}
    public ProfilPage bilgiler ()  {
        waitSecons(5);
        click(bilgiupdate);
        waitSecons(5);
        passLog("Bilgiler Bölümüne.");
        return this;
    }
    public ProfilPage comeBack ()  {
        waitSecons(5);
        click(geriButton);
        waitSecons(5);
        passLog("Profile geri dönüldü.");
        return this;
    }
    public ProfilPage hakkinda () {
        waitSecons(5);
        click(appinfo);
        waitSecons(5);
        passLog("Hakkında bölümüne tıklandı");
        return this;
    }
    public ProfilPage hakkindaComeback () {
        waitSecons(5);
        click(appinfoComeBack);
        waitSecons(5);
        passLog("Profile geri dönüldü");
        return this;
    }
    public ProfilPage kredibutton () {
        waitSecons(5);
        click(kredikartinfo);
        infoLog("Kredi Ekleme Butona tıkladı");
        waitSecons(5);
        click(kartekle);
        passLog("Kredi kartı Ekleme alanı");
        waitSecons(5);
        return this;
    }
    public ProfilPage kredibilgi () {
        waitSecons(5);
        sendKeys(kredikartNo,"4355084355084358");
        passLog("Kredi No ekleme");
        waitSecons(5);
     sendKeys(kredikartAd,"Semsettin Karas");
        passLog("Kredi kart İsim giris.");
        waitSecons(5);
       sendKeys(kredikartDate,"1226");
       passLog("Kredi Ay Gün giris");
        waitSecons(5);
        sendKeys(kredikartcvc,"000");
        passLog("Cvc kodu girildi");
        waitSecons(5);
        click(krediKayit);
        passLog("Kredi kayıt edildi");
        waitSecons(5);
        click(krediKayitButton);


        waitSecons(5);
        click(kayitliKrediCikis);
        waitSecons(5);
        click(anamenuDon);
        waitSecons(5);
click(profCikis);
passLog("Profil Geçildi");
        waitSecons(5);
        return this;
    }

}
