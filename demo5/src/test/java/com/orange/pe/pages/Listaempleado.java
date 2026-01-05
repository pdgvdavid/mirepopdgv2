package com.orange.pe.pages;

import com.orange.pe.utilities.Website;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Listaempleado extends PageObject {

@FindBy(xpath = "//a[contains(text(),'Add Employee')]")
    protected WebElementFacade linkAdd;

@Step("presiona boton Add empleado")
public void presionaBotonadd()
{

    linkAdd.click();

}





}
