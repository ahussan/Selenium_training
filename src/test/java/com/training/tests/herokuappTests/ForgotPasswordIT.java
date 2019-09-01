package com.training.tests.herokuappTests;

import com.training.tests.TestBase;
import com.training.pages.PageBase;
import org.testng.annotations.Test;

public class ForgotPasswordIT extends TestBase {

    @Test(groups="qa")
    public void ForgotPasswrod() throws Exception {
        PageBase page = pageFactory(PageBase.class);
        page.navigateToSite(APP_URL)
        .entertextinBox()
        .clickOnRetrievePasswordButton()
        .verifymessageUsingXpath();
    }

}
