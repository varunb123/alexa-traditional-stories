package com.varun.alexa.stories;
import org.junit.Test;
import static io.restassured.RestAssured.*;



public class SimpleFunctionalTest {

    @Test
    public void makeSureThatGoogleIsUp() {
        given().when().get("http://www.google.com").then().statusCode(200);
    }

}