import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SearchProduct extends MainTest {

    HomePage homepage;
    ProductsPage productsPage;
    ProductsDetailPage productsDetailPage;



    @Test
    @Order(1)
    public void search_a_device(){
        homepage = new HomePage(driver);
        homepage.searchBox.search("Iphone 13");
        productsPage = new ProductsPage(driver);
        Assertions.assertEquals(productsPage.isOnProductPage(), "You are not on Products Page!");


    }
    @Test
    @Order(2)
    public void click_device(){
        productsPage.selectProduct(1);
        productsDetailPage = new ProductsDetailPage(driver);
        Assertions.assertTrue(productsDetailPage.isOnProductDetailPage(), "You are not on Product Detail Page!");

    }

    @Test
    @Order(3)
    public void click_comments(){
        productsDetailPage.clickComments();

//        Assertions.assertTrue(productsDetailPage.systemResponse("\"Değerlendirme yapabilmek için bu ürünü satın almış olmalısınız");


    }



}
