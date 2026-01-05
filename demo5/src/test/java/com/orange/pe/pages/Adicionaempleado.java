package com.orange.pe.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;


import java.time.Duration;

public class Adicionaempleado extends PageObject {

    @FindBy(name="firstName")
    protected WebElementFacade txtprimernombre;

    @FindBy(name="middleName")
    protected WebElementFacade txtpsegundonombre;

    @FindBy(name="lastName")
    protected WebElementFacade txtapellido;

    @FindBy(xpath="//button[contains (@class, 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space')]")
    protected WebElementFacade btngrabar;

    @FindBy(xpath = "//input[@name='firstName']/parent::div/following-sibling::span")
    protected WebElementFacade lblValidaprimernombre;

    @FindBy(xpath = "//input[@name='firstName']/parent::div/following-sibling::span")
protected WebElementFacade lblValidaapellido;


    @Step("registra empleado")
    public void registraEmpleado(){

        txtprimernombre.sendKeys("percy");
        txtpsegundonombre.sendKeys("david");
        txtapellido.sendKeys("garcia");
        btngrabar.click();
    }

    @Step("valida campos vacios")
    public Boolean validaCamposvacios()
    {
        btngrabar.click();
        lblValidaapellido.waitUntilVisible();
        return lblValidaprimernombre.isDisplayed() && lblValidaapellido.isDisplayed();

    }



}
