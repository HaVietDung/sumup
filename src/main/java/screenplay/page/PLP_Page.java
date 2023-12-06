package screenplay.page;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import screenplay.actions.ActionCommon;
import screenplay.user_interface.PLPComponent;

import java.util.List;

public class PLP_Page {
    @Steps
    ActionCommon actionCommon;

    public static void getListLinkProduct() {
        List<WebElement> allPage = ThucydidesWebDriverSupport.getDriver().findElements(By.xpath("//li[@class='c-page__item']"));
        int sizeAllPage = allPage.size();
        System.out.println("size page: " + sizeAllPage);
        if (sizeAllPage > 0) {

            for (int i = 1; i <= sizeAllPage; i++) {
                WebElement btn2 = ThucydidesWebDriverSupport.getDriver().findElement(By.xpath("(//li[@class='c-page__item'])[" + i + "]"));
                btn2.click();
                System.out.println("-------------List Product In Page " + i + " : ");
                WebElement numPage = ThucydidesWebDriverSupport.getDriver().findElement(By.xpath("(//li[@class='c-page__item'])[" + i + "]"));
                numPage.click();

                List<WebElement> countProduct = ThucydidesWebDriverSupport.getDriver().findElements(By.xpath("//li[@class='c-product-list__item productcollection__item']"));
                int sizeProduct = countProduct.size();
                if (sizeProduct > 0) {
                    for (int j = 1; j <= sizeProduct; j++) {
                        WebElement elementLinkProduct = ThucydidesWebDriverSupport.getDriver().findElement(By.xpath("(//div[@class='c-product-item__ufn']//a)[" + j + "]"));
                        String linkProduct = elementLinkProduct.getAttribute("href");
                        System.out.println("Link Product " + j + ": " + linkProduct);
                    }
                    System.out.println("done");
                }
            }
        }
    }
}
