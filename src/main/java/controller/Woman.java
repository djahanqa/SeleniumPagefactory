package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Woman extends ScriptBase {
    @FindBy(xpath = "//*//a[@title='Women']")
    WebElement title;
    @FindBy(xpath = "//*[@id='block_top_menu']//a[@title='Tops']")
    WebElement tops;


    public Woman(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void topssearch(WebDriver driver, String design) {
        title.click();
        tops.isDisplayed();
        mouseOver(driver.findElement(By.xpath("//*//a[@title='"+design+"']")),driver);

    }

    private void mouseOver(WebElement element,WebDriver driver) {

        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

}
}