package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.DriverFactory;

import static utils.DriverFactory.getChromeDriver;

public class MainMenuBar {
    private WebDriver driver = DriverFactory.getChromeDriver();

    private final String DRESSES_MENU_OPTION = "//*[@id='block_top_menu']/ul/li[2]/a";

    private final String EVENING_DRESSES_SUB_MENU = "//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a";

    public MainMenuBar goToEveningDressesSubMenu() {
        Actions actions = new Actions(getChromeDriver());
        WebElement dressesMenuOption = driver.findElement(By.xpath(DRESSES_MENU_OPTION));
        actions.moveToElement(dressesMenuOption).perform();
        return this;
    }

    public void clickOnEveningDressesSubMenu() {
        WebElement eveningDressesSubMenu = driver.findElement(By.xpath(EVENING_DRESSES_SUB_MENU));
        eveningDressesSubMenu.click();
    }
}
