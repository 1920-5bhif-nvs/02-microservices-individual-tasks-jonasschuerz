package at.htl.microservice;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class MemberResourceTest {

    @Test
    public void testMemberCount(){
        given()
                .when()
                .get("/api/member/count")
                .then()
                .statusCode(200)
                .body(is("2")); // 2 Personen sind in der Datenbank
    }
}
