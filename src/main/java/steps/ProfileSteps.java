package steps;

import driver.AppiumMobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import page.ProfileElement;

public class ProfileSteps {
    public AndroidDriver driver = AppiumMobileDriver.getAppiumDriver();

    ProfileElement profileElement = new ProfileElement(driver);

    @Step("Переход во вкладку профиль")
    public void buttonLoginProfile() {
        profileElement.profileTabFragment.click();
        profileElement.buttonLogin.click();
    }

    @Step("Корректный логин , переход на экран с паролем")
    public void loginYandex() {
        profileElement.sendKeysLogin.click();
        profileElement.typeLoginPhone("test");
        profileElement.buttonNext.click();
        profileElement.isPrimaryDisplayName();
    }

    @Step("Ввод некорректного пароля")
    public void wrongPassword() {
        profileElement.typePassword("test");
        profileElement.buttonNext.click();
        profileElement.isTestError();
    }

    @Step("Кнопка посмотреть пароль")
    public void showPassword() {
        profileElement.buttonShowPassword.click();
    }

    @Step("Кнопка я не помню пароль")
    public void forgotPassword() {
        profileElement.buttonForgotPassword.click();
        profileElement.isPasswordRecoveryScreen();
    }


    @Step("Поле логин пустое")
    public void emptyField() {
        profileElement.buttonNext.click();
        profileElement.isTestError();
    }

    @Step("Проверка некорректного логина")
    public void loginСannotStartWithDigit() {
        profileElement.sendKeysLogin.click();
        profileElement.typeLoginPhone("111test");
        profileElement.buttonNext.click();
        profileElement.isTestError();
    }

    @Step("Кнопка Не помню свой логин")
    public void forgotLogin() {
        profileElement.buttonForgotLogin.click();
        profileElement.isPassportAuth();
    }

    @Step("Кнопка Зарегистрироваться")
    public void registrationLogin() {
        profileElement.buttonRegistration.click();
        profileElement.isPassportAuth();
    }

    @Step("Кнопка входа через Гугл почту")
    public void signInWithGoogle() {
        profileElement.googleLogin.click();
        profileElement.isGoogleView();
    }

    @Step("Кнопка входа через Facebook")
    public void signInWithFacebook() {
        profileElement.facebookLogin.click();
        profileElement.isFacebookView();
    }

    @Step("Кнопка входа через ВКонтакте")
    public void signInWithVkontakte() {
        profileElement.vkontakteLogin.click();
        profileElement.isChromeView();
    }

    @Step("Кнопка входа через Twitter")
    public void signInWithTwitter() {
        profileElement.moreLogin.click();
        profileElement.twitterLogin.click();
        profileElement.isChromeView();
    }

    @Step("Кнопка входа через Одноклассники")
    public void signInWithOdnoklassniki() {
        profileElement.moreLogin.click();
        profileElement.odnoklassnikiLogin.click();
        profileElement.isChromeView();
    }

    @Step("Кнопка входа через Mail")
    public void signInWithMail() {
        profileElement.moreLogin.click();
        profileElement.mailRuLogin.click();
        profileElement.isChromeView();
    }

}
