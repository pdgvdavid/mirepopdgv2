package com.orange.pe.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Logueo extends PageObject {

@FindBy(name = "username")
    protected WebElementFacade txtUsuario;

@FindBy(name = "password")
protected  WebElementFacade txtClave;

@FindBy(xpath = "//button[contains(@class, 'oxd-button')]")
protected WebElementFacade btnLogin;

@FindBy(xpath = "//p[text()='Invalid credentials']")
protected WebElementFacade lblMensajeerror;

@Step("conecta con datos correctos")
public void conecta(String usuario, String clave)
{
    txtUsuario.sendKeys(usuario);
    txtClave.sendKeys(clave);
    btnLogin.click();

}

@Step("mensaje de conexion no permitida")
public Boolean conexioninvalida()
{
    return lblMensajeerror.isDisplayed();///false;
}


}
