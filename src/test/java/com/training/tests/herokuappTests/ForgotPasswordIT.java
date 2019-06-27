package com.training.tests.herokuappTests;

import com.training.TestBase;
import com.training.pages.ForgotPasswordPage;
import com.training.pages.PageBase;
import org.testng.annotations.Test;

public class ForgotPasswordIT extends TestBase {

    @Test
    public void ForgotPasswrod() throws Exception {
        PageBase page = pageFactory(PageBase.class);
        page.navigateToSite(APP_URL)
        .entertextinBox()
        .clickOnRetrievePasswordButton();
    }

}
