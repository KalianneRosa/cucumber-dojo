package br.com.kalianne;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import static org.junit.Assert.assertEquals;

import static io.restassured.RestAssured.given;

/**
 * aaa
 */
public class StepDefs {

    @When("^users upload data on a project$")
    public void usersUploadDataOnAProject() throws Throwable {
        Response response = given().when().get("https://dog.ceo/api/breeds/list/all");
        response.getBody().prettyPrint();
    }

    @Then("^the server should handle it and return a success status$")
    public void theServerShouldHandleItAndReturnASuccessStatus() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^users want to get information on the Cucumber project$")
    public void usersWantToGetInformationOnTheCucumberProject() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^the requested data is returned$")
    public void theRequestedDataIsReturned() throws Throwable {
        assertEquals("a", "b");
    }

}
