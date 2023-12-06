package smartosc.sumup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Steps;
import screenplay.actions.ActionCommon;
import screenplay.tasks.Start;
import screenplay.user_interface.HomeComponent;

public class HomePageStep {

    @Steps
    ActionCommon actionCommon;

    @Given("{actor} open url {word}")
    public void openUrl(Actor actor, String url) {
        actor.wasAbleTo(Start.openBrowser(url));
    }

    @When("View PLP")
    public void viewPLP(){
        actionCommon.clickElement(HomeComponent.CATEGORY);
        actionCommon.clickElement(HomeComponent.SUB_CATEGORY);
    }
}
