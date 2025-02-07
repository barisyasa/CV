package apiTests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;




import static org.hamcrest.Matchers.equalTo;

public class RestAssuredAPITest {

    @Test
    public void GetBooksDetails() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = RestAssured.given();
        // specify the method type (GET) and the parameters if any.
        //In this case the request does not take any parameters
        Response response = httpRequest.request(Method.GET, "");
        // Print the status and message body of the response received from the server
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());

    }

    @Test
    public void GetBrands(){
        RestAssured.baseURI = "https://api.practicesoftwaretesting.com/brands";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET,"");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());

    }

    @Test
    public void GetBooks(){
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET,"");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }

    @Test
    public void PostUser(){
        RestAssured.baseURI = "https://demoqa.com";

        // Request Body (String ile tanımlanıyor)
        String requestBody = "{\n" +
                "  \"userName\": \"testuser\",\n" +
                "  \"password\": \"Test@1234\"\n" +
                "}";

        // POST Request ve Response Validation
        Response response = RestAssured.given()
                .contentType(ContentType.JSON) // Header: Content-Type
                .body(requestBody)            // Request Body
                .when()
                .post("/Account/v1/Authorized") // API Endpoint
                .then()
                .statusCode(200)              // Yanıtın HTTP Status Code'u 200 olmalı
                .body(equalTo("true"))        // Yanıt gövdesi "true" bekleniyor
                .extract()
                .response();

        // Yanıtı Konsola Yazdır
        System.out.println("Response: " + response.asString());

    }

    @Test
    public void PostUser404(){
        RestAssured.baseURI = "https://demoqa.com";

        // Request Body (String ile tanımlanıyor)
        String requestBody = "{\n" +
                "  \"userName\": \"baris\",\n" +
                "  \"password\": \"yasa\"\n" +
                "}";

        // POST Request ve Response Validation
        Response response = (Response) RestAssured.given()
                .contentType(ContentType.JSON) // Header: Content-Type
                .body(requestBody)            // Request Body
                .when()
                .post("/Account/v1/Authorized") // API Endpoint
                .then()
                .statusCode(404)              // Yanıtın HTTP Status Code'u 200 olmalı
                .body("message",equalTo("User not found!"))        // Yanıt gövdesi "true" bekleniyor
                .extract()
                .response();

        // Yanıtı Konsola Yazdır
        System.out.println("Response: " + response.asString());

    }

    @Test
    public void GetObjects(){
        RestAssured.baseURI ="https://api.restful-api.dev/objects";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET,"");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }
}