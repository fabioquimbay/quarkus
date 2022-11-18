package com.okta.rest.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HelloKCTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/helloKC")
          .then()
             .statusCode(200)
             .body(is("Hello from K+C"));
    }

}