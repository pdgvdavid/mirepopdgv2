package com.orange.pe.definitions;

import com.orange.pe.pages.*;
import com.orange.pe.utilities.Website;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;

public class OrangeDef {

    @Steps(shared = true)
    Website url;

    @Steps(shared = true)
    Logueo paginaLogueo;

    @Steps(shared = true)
    Dashboard paginaDashboard;

    @Steps(shared = true)
    Listaempleado listaempleado;

    @Steps(shared = true)
    Adicionaempleado adicionaempleado;

    @Steps(shared = true)
    Detalleempleado detalleempleado;
///mi programa22222233333
    @Given("usuario ingresa al link de orange")
    public void ingresaUrl()
    {
        url.cargaUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @When("ingresa las credenciales validas")
    public void conecta()
    {
        paginaLogueo.conecta("Admin","admin123");

    }

    @And("aparece la ventana principal")
    public void verificaAcceso()
    {
        Assert.assertTrue(paginaDashboard.apareceMenu());
    }

    @When("ingresa las credenciales invalidas")
    public void conectainvalida1()
    {
        paginaLogueo.conecta("Admin1","123");

    }

    @When("ingresa las credenciales invalidasMasiva {string} y {string}")
    public void conectainvalida2(String usuario, String clave)
    {
        paginaLogueo.conecta(usuario,clave);

    }

    @Then("aparece mensaje de validacion de logueo")
    public void emiteMensajeconexionnopermitida()
    {

 Assert.assertTrue(paginaLogueo.conexioninvalida());



    }

    @And("accede menu PIM")
   public void accedePIM()
   {
       paginaDashboard.accedePIM();
   }

   @And("presiona boton Add Employee")
   public void presionaAddemployee()
   {
       listaempleado.presionaBotonadd();
   }

   @And("registra datos del empleado")
   public void registraDatosempleado()
   {
       adicionaempleado.registraEmpleado();
   }

@Then("confirma que se grabo el registro")
public void confirmaRegistro()
{
    Assert.assertTrue(detalleempleado.verificaGrabo());
}


@Then("valida campo primer nombre y apellido no esten vacios")
    public void verificaSalteValidaciones()
{
    Assert.assertTrue(adicionaempleado.validaCamposvacios());

}




}
