import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasicPage{

    By SearchBoxLocator = By.className("desktopOldAutosuggestTheme-input");
    By ClickSearchBoxButton =  By.className("SearchBoxOld-buttonContainer");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(SearchBoxLocator, text);
        click(ClickSearchBoxButton);


    }
}
