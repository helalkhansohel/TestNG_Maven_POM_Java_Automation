package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPurchase {
    WebDriver driver;

    @FindBy(css = "img")
    List<WebElement> imgProducts;
    @FindBy(name = "add-to-cart") //
    WebElement btnAddCart;
    @FindBy(xpath = "//a[contains(text(),\"View cart\")]")
    List<WebElement> viewCart;
    @FindBy(xpath = "//a[contains(text(),\"Proceed to checkout\")]")
    WebElement btnCheckout;
    @FindBy(name = "product_cat")
    WebElement dropdown;
    @FindBy(className = "fa-search")
    WebElement searchIcon;

    public ProductPurchase(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void Click_Product_Image()  {

        imgProducts.get(1).click();

    }

    public void Select_from_DropdownList()  throws InterruptedException {

        Thread.sleep(2000);
        Select select=new Select(dropdown);
        select.selectByIndex(3);
    }

    public void Click_Search_Icon()  throws InterruptedException {

        Thread.sleep(2000);
        searchIcon.click();
    }

    public void Click_add_Card()  throws InterruptedException {

        Thread.sleep(2000);
        btnAddCart.click();
    }

    public void Click_View_Card()  throws InterruptedException {

        Thread.sleep(2000);
        viewCart.get(2).click();
    }

    public void Click_Check()  throws InterruptedException {

        Thread.sleep(2000);
        viewCart.get(2).click();
    }


    public void selectProduct() throws InterruptedException {
        imgProducts.get(1).click();
        Thread.sleep(2000);
        Select select=new Select(dropdown);
        select.selectByIndex(3);
        searchIcon.click();
        Thread.sleep(2000);
       // imgProducts.get(1).click();
    }
    public void addCart() throws InterruptedException {
       // imgProducts.get(1).click();
        Thread.sleep(2000);
        btnAddCart.click();
        Thread.sleep(2000);
        viewCart.get(2).click();
        btnCheckout.click();

    }
}
