package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;
import static constans.Constants.*;
public class ProductSearchPage extends BasePage {
    public ProductSearchPage(AppiumDriver driver) {
        super(driver);
    }


    public ProductSearchPage urun_search() throws InterruptedException {
        waitSecons(5);;

       click(searchBox);
        infoLog("Ürün Arama text tıklandı");
        waitSecons(5);
        sendKeys(searchBox, "bot");
        passLog("Bot Araması yapıldı");

        waitSecons(5);

        return this;
    }
    public ProductSearchPage scroll() {
        TouchAction swipe = new TouchAction(driver);
        swipe.press(PointOption.point(492, 973));
        swipe.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
        swipe.moveTo(PointOption.point(408, 411));
        swipe.release();
        swipe.perform();

        return this;
    }

    public ProductSearchPage search(int i){

        getAllProducts().get(i).click();
        passLog("Ürün indise göre arandı");
        return this;
    }

    private List<WebElement>getAllProducts ()  {

        return findAll(listt);
    }

    public ProductSearchPage scroll2() {
        TouchAction swipe2 = new TouchAction(driver);
        swipe2.press(PointOption.point(534, 2101));
        swipe2.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
        swipe2.moveTo(PointOption.point(562, 352));
        swipe2.release();
        swipe2.perform();

        return this;
    }


    public ProductSearchPage search1(int i){

        getAllProducts2().get(i).click();
        passLog("Ürün indisi göre arandı");
        return this;
    }
    private List<WebElement>getAllProducts2 (){
        return  findAll(proList);

    }



    public ProductSearchPage Sepet () throws InterruptedException {
        waitSecons(5);
        click(sepete_ekle);
        passLog("Sepete Eklendi");
        waitSecons(5);
        click(sepete_git);
        passLog("Sepete Gidildi");
        waitSecons(5);
        click(sepet_urun_sil);
        passLog("Sepet Ürünü Silindi");
        waitSecons(5);
        click(urun_sil_onayla);
        passLog("Sepet Silme Onayladı");
        waitSecons(5);
        click(kategori_git);
        infoLog("Ürün silindi Profile geri dönüldü.");
        waitSecons(5);
        return this;
    }

}


