package com.cydeo.tests;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class PetStoreOrderTest {

    String baseUrl = "https://petstore.swagger.io/v2/store";

  @Test
    public void inventoryTest (){
      Response response = RestAssured.get(baseUrl+"/inventory");
      System.out.println("status code = "+ response.statusCode());
      System.out.println("json body = "+response.asPrettyString());

      //response.prettyPrint();


  }

    }

