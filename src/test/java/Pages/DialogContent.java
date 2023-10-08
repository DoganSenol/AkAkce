package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//a[text()='Hesap Aç'])[1]")
    public WebElement createAccountLink;
    @FindBy(css = "input[id='rnufn']")
    public WebElement firstNameInput;
    @FindBy(css = "input[id='rnufs']")
    public WebElement lastNameInput;
    @FindBy(css = "input[id='rnufe1']")
    public WebElement email1Input;
    @FindBy(css = "input[id='rnufe2']")
    public WebElement email2Input;
    @FindBy(css = "input[id='rnufp1']")
    public WebElement password1Input;
    @FindBy(css = "input[id='rnufp2']")
    public WebElement password2Input;
    @FindBy(xpath = "//span[@class='radio_v8']//input[@name='rngc']")
    public List<WebElement> GenderChoise;
    @FindBy(xpath = "//select[@id='locpr']")
    public WebElement selectCity1;
    @FindBy(xpath = "//select[@id='locds']")
    public WebElement selectCity2;
    @FindBy(xpath = " //select[@id='bd']")
    public WebElement BirthDay;
    @FindBy(xpath = " //select[@id='bm']")
    public WebElement BirthMonth;
    @FindBy(xpath = " //select[@id='by']")
    public WebElement BirthYear;
    @FindBy(xpath = "//input[@id='rnufpca']")
    public WebElement IAgree;
    @FindBy(xpath = "//input[@id='rfb']")
    public WebElement CreateAccountButton;
    @FindBy(xpath = "(//a[@rel='nofollow'])[1]")
    public WebElement verify;
    @FindBy(xpath = " (//a[@rel='nofollow'])[2]")
    public WebElement loginLink;
    @FindBy(xpath = "//input[@id='life']")
    public WebElement loginEmail;
    @FindBy(xpath = "//input[@id='lifp']")
    public WebElement loginPassword;
    @FindBy(xpath = "//input[@id='lfb']")
    public WebElement loginButton;







    public WebElement getWebelement(String strElement){
        switch (strElement){

            case "createAccountLink": return this.createAccountLink;
            case "firstNameInput": return this.firstNameInput;
            case "lastNameInput": return this.lastNameInput;
            case "email1Input": return this.email1Input;
            case "email2Input": return this.email2Input;
            case "password1Input": return this.password1Input;
            case "password2Input": return this.password2Input;
            case "GenderChoise": return (WebElement) this.GenderChoise;
            case "selectCity1": return this.selectCity1;
            case "selectCity2": return this.selectCity2;
            case "BirthDay": return this.BirthDay;
            case "BirthMonth": return this.BirthMonth;
            case "BirthYear": return this.BirthYear;
            case "IAgree": return this.IAgree;
            case "CreateAccountButton": return this.CreateAccountButton;
            case "verify": return this.verify;
            case "loginLink": return this.loginLink;
            case "loginEmail": return this.loginEmail;
            case "loginPassword": return this.loginPassword;
            case "loginButton": return this.loginButton;






        }


        return null;
    }




}
