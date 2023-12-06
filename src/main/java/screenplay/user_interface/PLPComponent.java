package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PLPComponent {
        public static Target PAGINATION = Target.the("Pagination").locatedBy("//div[@aria-label='Pagination']");
        public static Target LINK_PRODUCT = Target.the("LinkProduct").locatedBy("//div[@class='c-product-item__ufn']//a");


}
