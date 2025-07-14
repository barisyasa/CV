package apiTests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class RestAssuredAPITest {

    @Test
    public void GetBooksDetailss() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = given();
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
        RequestSpecification httpRequest = given();
        Response response = httpRequest.request(Method.GET,"");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());

    }

    @Test
    public void GetBooks(){
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.request(Method.GET,"");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }

    @Test
    public void GetBook(){
        RestAssured.baseURI = "https://demoqa.com";
        given()
                .queryParam("ISBN","9781449325862")
                .when()
                .get("/BookStore/v1/Book")
                .then()
                .statusCode(200)
                .body("isbn",equalTo("9781449325862"))
                .body("title",notNullValue())
                .log().all();
    }

    @Test
    public void GetSingleObject(){
        RestAssured.baseURI = "https://api.restful-api.dev";
        given()

                .when()
                .get("/objects/7")
                .then()
                .statusCode(200)
                .body("id",equalTo("7"))
                .body("name",notNullValue())
                .log().all();
    }



    @Test
    public void PostObject(){
        RestAssured.baseURI = "https://api.restful-api.dev";

        String requestBody = "{\n" +
                "   \"name\": \"Apple MacBook Pro 16\",\n" +
                "   \"data\": {\n" +
                "      \"year\": 2019,\n" +
                "      \"price\": 1849.99,\n" +
                "      \"CPU model\": \"Intel Core i9\",\n" +
                "      \"Hard disk size\": \"1 TB\"\n" +
                "   }\n" +
                "}";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/objects")
                .then()
                .statusCode(200) // HTTP 200 olduğunu doğrular
                .statusCode(200) // HTTP 200 doğrulaması
                .body("name", equalTo("Apple MacBook Pro 16"))
                .body("data.year", equalTo(2019))
                .body("data.price", equalTo(1849.99f)) // Float değerler için 'f' ekleyin
                .body("data['CPU model']", equalTo("Intel Core i9"))
                .body("data['Hard disk size']", equalTo("1 TB"))
                .extract()
                .response();
    }

    @Test
    public void PostUserr(){
        RestAssured.baseURI = "https://demoqa.com";

        // Request Body (String ile tanımlanıyor)
        String requestBody = "{\n" +
                "  \"userName\": \"testuser\",\n" +
                "  \"password\": \"Test@1234\"\n" +
                "}";

        // POST Request ve Response Validation
        Response response = given()
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
        Response response = (Response) given()
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
    public void PutUser(){
        // Base URL
        RestAssured.baseURI = "https://reqres.in/api";

        // Güncellenmiş kullanıcı bilgilerini içeren JSON verisi
        String updatedUserData = "{\n" +
                "    \"name\": \"baris\",\n" +
                "    \"job\": \"tester\"\n" +
                "}";

        // PUT isteği gönderme
        given()
                .contentType(ContentType.JSON)  // JSON formatında veri gönderiyoruz
                .body(updatedUserData)          // Gönderilecek JSON verisi
                .when()
                .put("/users/2")               // Kullanıcıyı güncelleme (ID 2)
                .then()
                .statusCode(200)               // Başarılı yanıt bekliyoruz (HTTP 200 OK)
                .body("name", equalTo("baris"))  // Yanıtın içeriğinde 'name' alanının "John" olduğunu kontrol et
                .body("job", equalTo("tester"));
    }

    @Test
    public void DeleteUser(){
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .contentType(ContentType.JSON)  // JSON formatında veri göndereceğiz
                .when()
                .delete("/users/2")            // ID 2 olan kullanıcıyı sil
                .then()
                .statusCode(204);

    }

    @Test
    public void PatchUser(){
        RestAssured.baseURI = "https://reqres.in/api";
        String updatedUserData = "{\n" +
                "    \"name\": \"baris\",\n" +
                "    \"job\": \"tester\"\n" +
                "}";

        given()
                .contentType(ContentType.JSON)
                .body(updatedUserData)
                .when()
                .patch("/users/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void GetObjects(){
        RestAssured.baseURI ="https://api.restful-api.dev/objects";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.request(Method.GET,"");
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());
    }




}