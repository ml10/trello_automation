package step_definitions;

import cucumber.api.java.en.And;
import objects.pages.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class LoginSteps extends AbstractStepDef {
  private final static Logger log = Logger.getLogger(LoginSteps.class.getName());
	
	protected WebDriver driver;

	public LoginSteps() {
		driver = Hooks.driver;
	}

    @And("^the user logs into the Trello login page$")
    public void theUserLogsIntoTheTrelloLoginPage() throws Throwable {
        LoginPage loginPage= new LoginPage(driver);
        String username = System.getProperty("trello.login.username");
        String password = System.getProperty("trello.login.password");
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

}