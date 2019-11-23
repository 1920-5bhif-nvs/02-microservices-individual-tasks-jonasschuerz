package at.htl.firedepartment;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class VehicleResourceTest {

    @Test
    public void testVehicleCount() {
        given()
                .when()
                .get("/api/vehicles/count")
                .then()
                .statusCode(200)
                .body(is("3"));
    }

    @Test
    public void testAverageVehicle() {
        given()
                .when()
                .get("/api/vehicles/avg/mileage")
                .then()
                .statusCode(200)
                .body(is("37434.666666666664"));
    }


}