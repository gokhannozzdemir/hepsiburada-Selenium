import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsDetailPage extends BasicPage  {

    By detailPage = By.id("product-name");
    By clickProductAssesment = By.id("productReviewsTab");
    By clickCommentPlus = By.xpath("//span[.='Değerlendir']");
//    Alert alert = driver.switchTo().alert();

    public ProductsDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(detailPage);

    }

    public void clickComments() {
        click(clickProductAssesment);
        click(clickCommentPlus);

    }

//    public systemResponse(String text) {
//
//        driver.switchTo().alert().getText();
//
//    }
}
