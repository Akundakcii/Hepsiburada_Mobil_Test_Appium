package org.example;

import base.BaseTest;
import base.OtomasyonPage;
import base.ProfilPage;
import base.ProductSearchPage;

import org.testng.annotations.*;
import reports.ExtentTestReports;

public class Otomasyon extends BaseTest {
    OtomasyonPage otomasyonPage;
ProfilPage profilPage;
ProductSearchPage productSearchPage;

    @BeforeSuite
    public void setupSuite(){
        ExtentTestReports.beforeTest();


    }
    @AfterSuite
    public void afterSuite(){
        ExtentTestReports.afterTest();
    }
    @BeforeClass
    public void before(){
    otomasyonPage = new OtomasyonPage(getAppiumDriver());
    profilPage = new ProfilPage(getAppiumDriver());
    productSearchPage = new ProductSearchPage(getAppiumDriver());

    }
@Test
    public void test() throws InterruptedException {
        Thread.sleep(1000);
        otomasyonPage
                .izinOnayla()
                .reklamGec()
                .Kgiris()
                .uyeGirsButton()

                .kullaniciAdi()
                .epostaGirisButton1()
                .SifreGiris()
                .SifreGirisButton()
                .ProfileGec();

}

@Test
public void test2() throws InterruptedException {
        Thread.sleep(1000);
        profilPage
                .ayarlar()
                .bilgiler()
                .comeBack()
                .hakkinda()
                .hakkindaComeback()
                .kredibutton()
                .kredibilgi();

}

@Test
public void test3() throws InterruptedException {
        Thread.sleep(1000);
        productSearchPage

                .urun_search()
                .scroll()
                .search(0)
                .scroll2()
                .search1(1)
                .Sepet();













}

@AfterClass
public void After() {
        tearDown();
}


}
