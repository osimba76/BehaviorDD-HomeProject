package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement CUSTOMERS_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADD_CUSTOMER_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULLNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_DROPDOWN_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement STATE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"group\"]")
	WebElement GROUP_DROPDOWN_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SAVE_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"summary\"]")
	WebElement SUMMARY_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement LIST_CUSTOMERS_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[1]")
	WebElement ADD_CUSTOMER_BUTTON_LIST_CUSTOMERS_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"foo_filter\"]")
	WebElement SEARCH_BAR_LIST_CUSTOMERS_LOCATOR;

	// Methods to interact with the elements
	public void clickCustomersButton() {
		CUSTOMERS_BUTTON_LOCATOR.click();
	}

	public void clickAddCustomerButton() {
		ADD_CUSTOMER_BUTTON_LOCATOR.click();
	}

	String enteredName;

	public void insertFullName(String fullName) {
		enteredName = fullName + randomNumGenerator();
		FULLNAME_FIELD_LOCATOR.sendKeys(enteredName);
	}

	public void insertCompanyName(String company) {
		dropDown(COMPANY_DROPDOWN_LOCATOR, company);
	}

	public void insertEmail(String email) {
		String enteredEmail = randomNumGenerator() + email;
		EMAIL_FIELD_LOCATOR.sendKeys(enteredEmail);
	}

	public void insertPhoneNumber(String phoneNum) {
		PHONE_FIELD_LOCATOR.sendKeys(phoneNum);
	}

	public void insertAddress(String address) {
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
	}

	public void insertCity(String city) {
		CITY_FIELD_LOCATOR.sendKeys(city);
	}

	public void insertState(String state) {
		STATE_FIELD_LOCATOR.sendKeys(state);
	}

	public void insertZip(String zip) {
		ZIP_FIELD_LOCATOR.sendKeys(zip);
	}

	public void insertGroup(String group) {
		BasePage.dropDown(GROUP_DROPDOWN_LOCATOR, group);
	}

	public void clickOnSaveButton() {
		SAVE_BUTTON_LOCATOR.click();
		BasePage.waitForElement(driver, 3, By.xpath("//*[@id=\"summary\"]"));

	}

	public void clickOnListCustomersButton() {
		LIST_CUSTOMERS_BUTTON_LOCATOR.click();
	}

	// tbody/tr[1]/td[3]
	// tbody/tr[2]/td[3]
	// tbody/tr[i]/td[3]
	// tbody/tr[1]/td[3]/following-sibling::td[4]/a[2] - Delete Button

	String before_xpath = "//tbody/tr[";
	String after_xpath = "]/td[3]";

	public void verifyEnteredCustomerAndDelete() {

		for (int i = 1; i <= 5; i++) { // tbody/tr[i]/td[3]
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			// System.out.println(name);
			// Assert.assertEquals(name, enteredName, "Name does not match!!!");

			if (name.contains(enteredName)) {
				System.out.println("Entered name exists");
				driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]/following-sibling::td[4]/a[2]")).click();
				BasePage.waitForElement(driver, 2, By.xpath("/html/body/div[1]/div/div/div[2]/button[2]"));
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")).click();
			}

		}

	}

	public void clickAddCustomerOnListCustomer() {
		ADD_CUSTOMER_BUTTON_LIST_CUSTOMERS_LOCATOR.click();
	}

	public void testListContactSearchBar() {
		SEARCH_BAR_LIST_CUSTOMERS_LOCATOR.sendKeys(enteredName);
	}

	public void verifyEnteredCustomerOnSearchBarAndTestView() {

		for (int i = 1; i <= 5; i++) { // tbody/tr[i]/td[3]
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
			// Assert.assertEquals(name, enteredName, "Name does not match!!!");

			if (name.contains(enteredName)) {
				System.out.println("Entered name exists");
				driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]/following-sibling::td[4]/a[1]")).click();
				
			}

		}

	}

}
