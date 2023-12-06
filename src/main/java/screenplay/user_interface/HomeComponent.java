package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeComponent {
    public static Target CATEGORY = Target.the("TV_Category").locatedBy("//button[@id='desktop-gnb_1depth_1']");
    public static Target SUB_CATEGORY = Target.the("SubCategoryOLED").locatedBy("//a[@class='cmp-navigation__item-link c-gnb__item-link c-gnb__item-link--detail' and text()='OLED']");


}
