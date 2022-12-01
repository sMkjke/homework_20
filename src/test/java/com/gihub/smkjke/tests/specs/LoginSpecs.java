package com.gihub.smkjke.tests.specs;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static com.gihub.smkjke.tests.helpers.CustomApiListener.withCustomTemplates;

public class LoginSpecs {
    private static final String URL = "https://reqres.in/api";

    public static final RequestSpecification REQUEST_SPECIFICATION = RestAssured
            .given()
            .filter(withCustomTemplates())
            .log().all()
            .baseUri(URL)
            .contentType(ContentType.JSON);
}
