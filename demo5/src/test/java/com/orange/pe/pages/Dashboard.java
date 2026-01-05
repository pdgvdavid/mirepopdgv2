package com.orange.pe.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Dashboard  extends PageObject {

    @FindBy(xpath = "//div[contains(@class, 'oxd-sidepanel-body')]")
    protected WebElementFacade menulateral;


    @FindBy(xpath = "//a[contains(@href,'PimModule')]")
    protected WebElementFacade menuITEM;

    @Step("Valida que existe el menu izquierdo")
    public Boolean apareceMenu()
    {
        menulateral.waitUntilVisible();
        return menulateral.isDisplayed();

    }

    @Step("accede menu PIM")
    public void accedePIM()
    {
        menuITEM.click();
    }



}
