package TestRunner;

import Pages.ProductPurchase;
import Setup.Setup;
import org.testng.annotations.Test;

public class ProductPurchaseTestRunner extends Setup {

    @Test(priority = 4,  description = "Select a product")
    public void selectMyProduct() throws InterruptedException {
        ProductPurchase purchase=new ProductPurchase(driver);

        driver.get("https://envothemes.com/envo-ecommerce");

        //purchase.selectProduct();
        purchase.Click_Product_Image();
        purchase.Select_from_DropdownList();
        purchase.Click_Search_Icon();
        purchase.Click_add_Card();
        purchase.Click_View_Card();
        purchase.Click_Check();
        purchase.selectProduct();
        purchase.addCart();

    }
//
//    @Test(priority = 5,  description = "Add product in cart")
//    public void addCart() throws InterruptedException {
//        ProductPurchase purchase=new ProductPurchase(driver);
//        purchase.addCart();
//
////        try{
////            purchase.addCart();
////        }
////        catch (Exception e){
////
////        }
//
//    }

}
