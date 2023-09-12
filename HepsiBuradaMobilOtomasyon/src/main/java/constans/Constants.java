package constans;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class Constants {

//*****************
    public static final By izinlerOnayButton =By.id("com.android.permissioncontroller:id/permission_allow_button");
    public static final By reklamKaldirma = By.id("com.pozitron.hepsiburada:id/com_braze_inappmessage_full_close_button");

    public static final  By kullaniciGirisTikla = By.id("com.pozitron.hepsiburada:id/account_menu_button");
    public static final By girisYapTiklama = By.xpath("//android.view.ViewGroup[@content-desc=\"account_menu_button_1\"]/android.view.ViewGroup/android.widget.Button");

    public static final By epsotaTik = new By.ByClassName("android.widget.EditText");

    public static final By epostaGirsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.Button");

    public static final By SifreYazdirmaText = new By.ByClassName("android.widget.EditText");
    public static final By sifreGonder = new By.ByClassName("android.widget.Button");

    public static final By hosgeldiniz = new By.ByClassName("android.widget.Button");


    ///Girisi Ekranı için olan Yer
    //**********
//Profil bilgileri

    public static final By ayarlarLoc = By.xpath("//android.view.ViewGroup[@content-desc=\"account_menu_8\"]/android.view.View");
    public static final By bilgiupdate = By.xpath("//android.view.ViewGroup[@content-desc=\"child_account_menu_0\"]/android.widget.TextView");
    public static final By geriButton = By.id("com.pozitron.hepsiburada:id/imgBack");

    public static final By appinfo = By.xpath("//android.view.ViewGroup[@content-desc=\"child_account_menu_4\"]/android.widget.TextView");
    public static final By appinfoComeBack = new By.ByClassName("android.widget.Button");

    public static final By kredikartinfo = new By.ByXPath("//android.view.ViewGroup[@content-desc=\"child_account_menu_1\"]/android.widget.TextView");
    public static final By kartekle = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.TextView");
    public static final  By kredikartNo = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText");
    public static final By kredikartAd = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.EditText");
    public static final By kredikartDate = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.widget.EditText");
    public static final  By kredikartcvc = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[4]/android.widget.EditText");
    public static final By krediKayit = new By.ByClassName("android.widget.CheckBox");
    public static final By krediKayitButton = new By.ByClassName("android.widget.Button");
    public static  final By kayitliKrediCikis = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Image");

  public  static final By anamenuDon = new By.ById("com.pozitron.hepsiburada:id/iv_toolbar_user_account_menu");
    public static  final By profCikis =new By.ById("com.pozitron.hepsiburada:id/ivToolbarBack");

  // Profil bitti
    //********
    // Arama Ekranı

//
    public static final  By searchBox = new By.ById("com.pozitron.hepsiburada:id/etSearchBox");

    public static final By listt = new By.ByXPath("//*[@resource-id='com.pozitron.hepsiburada:id/search_suggestion']");
    public static final By proList = new By.ByXPath("//*[@resource-id='com.pozitron.hepsiburada:id/clProductBoxBottom']");//ürünleri listele
    public static final  By sepete_ekle = By.id("com.pozitron.hepsiburada:id/product_detail_add_to_cart_text");
    public static final By sepete_git = By.id("com.pozitron.hepsiburada:id/goBasketTxt");

    public static final By sepet_urun_sil = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.Image");

public static final  By urun_sil_onayla = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button");

public static final  By kategori_git = By.id("com.pozitron.hepsiburada:id/nav_graph_category");







}
