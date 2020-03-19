package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ProfileElement {
    private AndroidDriver driver;

    public ProfileElement(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(id = "ru.yandex.market:id/profileTabFragment")
    public AndroidElement profileTabFragment;

    //-------------- Мои отзывы --------------//

    @AndroidFindBy(id = "ru.yandex.market:id/myOpinions")
    public AndroidElement buttonMyOpinions;

    @AndroidFindBy(id = "ru.yandex.market:id/tab1")
    public AndroidElement tabGoodsOpinions;

    @AndroidFindBy(id = "ru.yandex.market:id/tab2")
    public AndroidElement tabShopsOpinions;

    @AndroidFindBy(id = "ru.yandex.market:id/city")
    public AndroidElement buttonCity;

    @AndroidFindBy(id = "ru.yandex.market:id/notifications")
    public AndroidElement buttonNotifications;

    @AndroidFindBy(id = "ru.yandex.market:id/feedback")
    public AndroidElement buttonFeedback;

    @AndroidFindBy(id = "ru.yandex.market:id/about")
    public AndroidElement buttonAbout;

    //-------------- Войти --------------//

    @AndroidFindBy(id = "ru.yandex.market:id/loginBtn")
    public AndroidElement buttonLogin;

    @AndroidFindBy(id = "ru.yandex.market:id/layout_login")
    public AndroidElement layoutLogin;

    @AndroidFindBy(id = "ru.yandex.market:id/edit_login")
    public AndroidElement sendKeysLogin;

    @AndroidFindBy(id = "ru.yandex.market:id/action_registration")
    public AndroidElement buttonRegistration;

    @AndroidFindBy(accessibility = "Перейти вверх")
    public AndroidElement buttonBack;

    @AndroidFindBy(id = "ru.yandex.market:id/button_forgot_login")
    public AndroidElement buttonForgotLogin;

    @AndroidFindBy(id = "ru.yandex.market:id/edit_phone_number")
    public AndroidElement passportAuthorization;

    @AndroidFindBy(id = "ru.yandex.market:id/input_phone_code")
    public AndroidElement phoneCode;

    @AndroidFindBy(id = "ru.yandex.market:id/action_use_sms")
    public AndroidElement buttonConfirmBySMS;

    @AndroidFindBy(id = "com.google.android.gms:id/cancel")
    public AndroidElement cancelAndroid;

    @AndroidFindBy(id = "ru.yandex.market:id/text_primary_display_name")
    public AndroidElement primaryDisplayName;

    public void typeLoginPhone(String login){
        sendKeysLogin.sendKeys(login);
    }

    public void typeNumberPhone(String number){
        passportAuthorization.sendKeys(number);
    }

    @AndroidFindBy(id = "ru.yandex.market:id/edit_password")
    public AndroidElement sendKeysPassword;

    @AndroidFindBy(accessibility = "Show password")
    public AndroidElement buttonShowPassword;

    @AndroidFindBy(id = "ru.yandex.market:id/button_forgot_password")
    public AndroidElement buttonForgotPassword;

    public void typePassword(String password){
        sendKeysPassword.sendKeys(password);
    }

    @AndroidFindBy(id = "ru.yandex.market:id/button_next")
    public AndroidElement buttonNext;

    @AndroidFindBy(id = "ru.yandex.market:id/button_lite_next")
    public AndroidElement buttonLiteNext;

    @AndroidFindBy(id = "ru.yandex.market:id/text_social_message")
    public AndroidElement socialMessage;

    @AndroidFindBy(accessibility = "Google")
    public AndroidElement googleLogin;

    @AndroidFindBy(id = "com.google.android.gms:id/account_picker_container")
    public AndroidElement googleView;

    @AndroidFindBy(className = "android.webkit.WebView")
    public AndroidElement facebookView;

    @AndroidFindBy(id = "com.android.chrome:id/action_bar_root")
    public AndroidElement ChromeView;

    @AndroidFindBy(accessibility = "Facebook")
    public AndroidElement facebookLogin;

    @AndroidFindBy(accessibility = "ВКонтакте")
    public AndroidElement vkontakteLogin;

    @AndroidFindBy(accessibility = "Twitter")
    public AndroidElement twitterLogin;

    @AndroidFindBy(accessibility = "Одноклассники")
    public AndroidElement odnoklassnikiLogin;

    @AndroidFindBy(accessibility = "Mail.ru")
    public AndroidElement mailRuLogin;

    @AndroidFindBy(id = "ru.yandex.market:id/button_social_auth_more")
    public AndroidElement moreLogin;

    @AndroidFindBy(id = "ru.yandex.market:id/text_error")
    public AndroidElement textError;

    @AndroidFindBy(id = "ru.yandex.market:id/webview")
    public AndroidElement passwordRecoveryScreen;

    public boolean islayoutLogin(){return layoutLogin.isDisplayed();}

    public boolean isGoogleView(){return googleView.isDisplayed();}

    public boolean isFacebookView(){return facebookView.isDisplayed();}

    public boolean isChromeView(){return ChromeView.isDisplayed();}

    public boolean isTestError(){return textError.isDisplayed();}

    public boolean isAndroidPopup(){return cancelAndroid.isDisplayed();}

    public boolean isPassportAuth(){return passportAuthorization.isDisplayed();}

    public boolean isPhoneCode(){return phoneCode.isDisplayed();}

    public boolean isDisplayedLogin(){
        return buttonLogin.isDisplayed();
    }

    public boolean isPrimaryDisplayName(){return primaryDisplayName.isDisplayed();}

    public boolean isPasswordRecoveryScreen(){return passwordRecoveryScreen.isDisplayed();}

}
