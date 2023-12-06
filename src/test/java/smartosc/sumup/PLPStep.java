package smartosc.sumup;

import io.cucumber.java.en.And;
import screenplay.page.PLP_Page;

public class PLPStep {
    @And("Get Link Product")
    public void getLinkProcutInPLP(){
        PLP_Page.getListLinkProduct();
    }
}
