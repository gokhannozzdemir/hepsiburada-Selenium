import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasicPage {

    By secondPageDevices = By.className("searchResultSummaryBar-bold");
    By selectDevice = new By.ByXPath("div>div>div.moria-ProductCard-cvwzRI");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(secondPageDevices);
    }

    public void selectProduct(int i) {
        getAllProduct().get(i).click();
    }

    private List<WebElement> getAllProduct(){
        return findAll(selectDevice);
    }
}
