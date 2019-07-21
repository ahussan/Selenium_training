package com.training.tests.gpstests;

import com.training.TestBase;
import com.training.pages.PageBase;
import org.testng.annotations.Test;

public class PhoneBuyingIT extends TestBase {

    @Test(enabled = false)
    public void addPhoneToCart() {
        PageBase page = pageFactory(PageBase.class);
        page.navigateToGpsLandingPage(GOOGLE_URL)
                .clickPhonesTopMenu()
                .clickOnPixelThreePhone();
    }
}
