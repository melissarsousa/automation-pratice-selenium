package dev.melissa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.melissa.pages.CategoryWomenPage;

public class DressPageTest {
        private CategoryWomenPage dressPage;
        private final String URL = "https://automationexercise.com/";

    @BeforeEach
	void setUp() throws Exception {
		this.dressPage = new CategoryWomenPage();
		this.dressPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.dressPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		this.dressPage.viewCategoryWomenPage();
		
		//then
		Assertions.assertEquals("Women - Dress Products", this.dressPage.getTitlePage());
		Assertions.assertFalse(this.URL.equals(dressPage.getCurrentUrl()));
	}
}
