package com.example.shop;

import com.example.shop.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationSmokeTest {

    @Autowired
    private TestRestTemplate rest;

    @Test
    public void createAndGetProduct() {
        Product p = new Product(null, "smoke-test", "desc", 1.23, 10);
        ResponseEntity<Product> post = rest.postForEntity("/api/products", p, Product.class);
        assertEquals(HttpStatus.CREATED, post.getStatusCode());
        assertNotNull(post.getBody());
        Long id = post.getBody().getId();

        ResponseEntity<Product> get = rest.getForEntity("/api/products/" + id, Product.class);
        assertEquals(HttpStatus.OK, get.getStatusCode());
        assertEquals("smoke-test", get.getBody().getName());
    }
}
