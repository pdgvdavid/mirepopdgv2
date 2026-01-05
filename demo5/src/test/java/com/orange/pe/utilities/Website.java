package com.orange.pe.utilities;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class Website extends PageObject{


    @Steps(shared = true)
    PageObject url;


    public void cargaUrl(String url1)
    {
        url.setDefaultBaseUrl(url1);
        url.open();

    }



}
