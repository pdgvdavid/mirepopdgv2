package com.orange.pe.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.annotations.Step;


public class Detalleempleado extends PageObject {

@FindBy(xpath = "//h6[text() = 'Personal Details']")
protected WebElementFacade menuDetalle;

@Step("verifica grabo")
public Boolean verificaGrabo()
{

   menuDetalle.waitUntilVisible();


    return menuDetalle.isDisplayed();
}



}
