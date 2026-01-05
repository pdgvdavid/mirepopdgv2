package com.orange.pe;


import com.orange.pe.pages.Logueo;
import com.orange.pe.utilities.Website;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/data/usuarios.csv")
public class LoginCSVTest {

    private String usuario;
    private String clave;

    //LoginPage loginPage;

    @Steps
    Website url;

    @Steps
    Logueo paginaLogin;

    @Test
    public void loginInvalido() {

        url.cargaUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        paginaLogin.conecta(usuario,clave);
       Assert.assertTrue(paginaLogin.conexioninvalida());

    }

}
