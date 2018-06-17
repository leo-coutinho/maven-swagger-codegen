package controller;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwaggerLiveTest {
    private static final String URL_PREFIX = "http://localhost:8080/";

    @Test
    public void whenVerifySpringFoxIsWorking_thenOK() {
        final Response response = RestAssured.get(URL_PREFIX + "api-docs");
        assertEquals(200, response.statusCode());
        System.out.println(response.asString());

    }
}