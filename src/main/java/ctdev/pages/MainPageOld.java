package ctdev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageOld {

    private WebDriver driver;

    private By tshirtsTab = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    private By sizeLcheckbox = By.id("layered_id_attribute_group_3");

    public MainPageOld(WebDriver driver) {
        this.driver = driver;
    }

    public MainPageOld openTShirtTab() {
        this.driver.findElement(tshirtsTab).click();
        return this;
    }

    public MainPageOld selectSizeL() {
        this.driver.findElement(sizeLcheckbox).click();
        return this;
    }
}
