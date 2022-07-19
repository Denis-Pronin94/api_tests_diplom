package tests;

import models.User;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static specs.Specs.request;
import static specs.Specs.responseSpec200;

public class ReqresinTests {

    @Test
    void successfulRegister() {

        User user = new User();
        user.setEmail("eve.holt@reqres.inю");
        user.setPassword("pistol");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .post("/register")
                .then()
                .spec(responseSpec200)
                .log().body()
                .extract().as(User.class);

        assertEquals("4", response.getId());
        assertEquals("QpwL5tke4Pnpja7X4", response.getToken());
    }

    @Test
    void listUser() {

        User response = given()
                .spec(request)
                .when()
                .get("/users?page=2ю")
                .then()
                .spec(responseSpec200)
                .log().body()
                .extract().as(User.class);

        assertEquals("2", response.getPage());
        assertEquals("6", response.getPer_page());
        assertEquals("12", response.getTotal());
        assertEquals("2", response.getTotal_pages());
    }

    @Test
    void missingRegisterUserTest() {

        User user = new User();
        user.setEmail("sydney@fifeю");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .post("/register")
                .then()
                .statusCode(400)
                .log().body()
                .extract().as(User.class);

        assertEquals(response.getError(), "Missing password");
    }

    @Test
    void createUserTest() {

        User user = new User();
        user.setName("morpheus");
        user.setJob("leader");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().body()
                .extract().as(User.class);

        assertEquals(response.getName(), user.getName());
        assertEquals(response.getJob(), user.getJob());
    }

    @Test
    void updateUser() {

        User user = new User();
        user.setName("morpheus");
        user.setJob("zion resident");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .put("/users/2")
                .then()
                .spec(responseSpec200)
                .log().body()
                .extract().as(User.class);

        assertEquals(response.getName(), user.getName());
        assertEquals(response.getJob(), user.getJob());
    }
}
