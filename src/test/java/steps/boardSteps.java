package steps;


import browserFactory.browserFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.boardPage;
import pageFactory.homePage;
import pageFactory.loginPage;

public class boardSteps {
	browserFactory browsers;
	private loginPage login = new loginPage(browserFactory.getdriver());
	private homePage home = new homePage(browserFactory.getdriver());
	private boardPage board = new boardPage(browserFactory.getdriver());

	private static String storeTitle;
	@When("user clicks on create board")
	public void userClicksOnCreateBoard() {
		home.create_board_btn.click();
	}
	@Then("user enters board title {string}")
	public void userEntersBoardTitle(String title){
		home.board_title_input.type(title);
		storeTitle = title;
	}

	@And("user clicks on the create button")
	public void userClicksOnTheCreateButton(){
		home.board_create_btn.click();
	}

	@And("user can see the title matches with the title they created in step three")
	public void userCanSeeTheTitleMatchesWithTheTitleTheyCreatedInStepThree() {
		board.board_title.wordCompare(storeTitle);
	}

	@When("user is on any board")
	public void userIsOnAnyBoard() {
		
	}

	@And("user clicks on add list")
	public void userClicksOnAddList() {
		
	}

	@And("enters the name of the list")
	public void entersTheNameOfTheList() {
		
	}

	@Then("clicks the button add list")
	public void clicksTheButtonAddList() {
	}
}
