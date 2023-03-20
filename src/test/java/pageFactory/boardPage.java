package pageFactory;

import browserFactory.browserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumElements.seleniumElements;

public class boardPage {
	browserFactory browser;
	WebDriver driver;
	public seleniumElements board_title;

	public boardPage(WebDriver driver){
		this.driver = driver;
		WiniumElements();
	}
	public void WiniumElements(){
//		profile_btn = new seleniumElements(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/nav/div[3]/div[5]/button"),driver);
//		create_board_btn = new seleniumElements(By.cssSelector("div.board-tile"),driver);

		board_title = new seleniumElements(By.xpath("//h1[@class='js-board-editing-target board-header-btn-text' and text()='Test']"),driver);

	}





}
