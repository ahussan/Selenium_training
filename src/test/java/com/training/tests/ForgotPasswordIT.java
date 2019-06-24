package com.training.tests;

import com.training.TestBase;
import com.training.pages.PageBase;
import org.testng.annotations.Test;

public class ForgotPasswordIT extends TestBase {

    @Test
    public void ForgotPasswrod() throws Exception {
        PageBase page = pageFactory(PageBase.class);
        page.navigateToSite("http://the-internet.herokuapp.com/forgot_password")
        .entertextinBox()
        .clickOnRetrievePasswordButton()
        ;

    }
}