package test;

import driver.AppiumMobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import steps.ProfileSteps;

public class ProfileTest {

    public AndroidDriver driver = AppiumMobileDriver.getAppiumDriver();
    public ProfileSteps profileSteps = new ProfileSteps();

    @Before
    public void startTest() {
        driver.resetApp();
        driver.launchApp();
    }

    @Test
    public void setProfileSteps() {
        profileSteps.buttonLoginProfile();
        profileSteps.loginYandex();
        profileSteps.forgotPassword();
    }

    @Test
    public void loginIsCorrect() {
        profileSteps.buttonLoginProfile();
        profileSteps.loginYandex();
    }

    @Test
    public void checkForEmptyLoginField() {
        profileSteps.buttonLoginProfile();
        profileSteps.loginYandex();
        profileSteps.wrongPassword();
    }

    @Test
    public void passwordDisplay() {
        profileSteps.buttonLoginProfile();
        profileSteps.loginYandex();
        profileSteps.wrongPassword();
        profileSteps.showPassword();
    }

    @Test
    public void verificationDoNotRememberLogin() {
        profileSteps.buttonLoginProfile();
        profileSteps.forgotLogin();
    }

    @Test
    public void verificationIDoNotRememberThePassword() {
        profileSteps.buttonLoginProfile();
        profileSteps.loginYandex();
        profileSteps.forgotPassword();
    }

    @Test
    public void checkForEmptyField() {
        profileSteps.buttonLoginProfile();
        profileSteps.emptyField();
    }

    @Test
    public void invalidLogin() {
        profileSteps.buttonLoginProfile();
        profileSteps.loginСannotStartWithDigit();
    }

    @Test
    public void сheckButtonRegister() {
        profileSteps.buttonLoginProfile();
        profileSteps.registrationLogin();
    }

    @Test
    public void googleLoginVerification() {
        profileSteps.buttonLoginProfile();
        profileSteps.signInWithGoogle();
    }

    @Test
    public void facebookLoginVerification() {
        profileSteps.buttonLoginProfile();
        profileSteps.signInWithFacebook();
    }

    @Test
    public void vkontakteLoginVerification() {
        profileSteps.buttonLoginProfile();
        profileSteps.signInWithVkontakte();
    }

    @Test
    public void twitterLoginVerification() {
        profileSteps.buttonLoginProfile();
        profileSteps.signInWithTwitter();
    }

    @Test
    public void odnoklassnikiLoginVerification() {
        profileSteps.buttonLoginProfile();
        profileSteps.signInWithOdnoklassniki();
    }

    @Test
    public void mailLoginVerification() {
        profileSteps.buttonLoginProfile();
        profileSteps.signInWithMail();
    }

    @Test
    @DisplayName("Проверка пустого поля телефон при регистрации")
    public void noPhoneNumberDuringRegistration() {
        profileSteps.buttonLoginProfile();
        profileSteps.registrationLogin();
        profileSteps.noPhoneRegistration();
    }

    @Test
    public void continuePhoneNumberDuringRegistration() {
        profileSteps.buttonLoginProfile();
        profileSteps.registrationLogin();
        profileSteps.phoneRegistration();

    }

    @Test
    @DisplayName("Тест кнопки Продолжить регистрацию с вашей почтой")
    public void buttonContinueRegistrationWithYourMail() {
        profileSteps.buttonLoginProfile();
        profileSteps.registrationLogin();
        profileSteps.registrationWithYourMail();
    }

    @After
    public void doneTest() {
        driver.closeApp();
    }

}
