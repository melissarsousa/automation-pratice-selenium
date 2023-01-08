package dev.melissa;

class LoginTest {
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		WebElement emailAddressElement = driver.findElement(By.id("email"));
		emailAddressElement.sendKeys("mel.rios99.com");


		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("senhatest");
    
		
		WebElement submitButtonElement = driver.findElement(By.xpath("//*[@id="form"]/div/div/div[1]/div/form/button"));
		submitButtonElement.click();
		
		WebElement testCaseButton = driver.findElement(By.xpath("//*[@id="header"]/div/div/div/div[2]/div/ul/li[6]/a/i"));
		String textTestCase = testCaseButton.getText();
		
		Assertions.assertTrue(textTestCase.equals("Test Cases"));
	}

}