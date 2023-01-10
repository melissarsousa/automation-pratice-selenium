package dev.melissa.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.melissa.pages.LoginPage;

public class LoginPageTest {
        private LoginPage loginPage;
        private final String URL = "https://automationexercise.com/login";
    
        @BeforeEach
        void setUp() throws Exception {
            this.loginPage = new LoginPage();
            this.loginPage.visit(this.URL);
        }
    
        @AfterEach
        void tearDown() throws Exception {
            this.loginPage.quitWebDriver();
        }
    
        @Test
        void test() {
            this.loginPage.signIn();
            
            Assertions.assertTrue(this.loginPage.getAccount().equals(" Logged in as "));
            Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
        }
    
    }

