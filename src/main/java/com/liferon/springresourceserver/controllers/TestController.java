package com.liferon.springresourceserver.controllers;

import com.liferon.springresourceserver.model.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/api/test")
    public ResponseEntity<?> testEndpoint() {
        Test test = new Test(5L, "Unit", "Unit testing");

        return new ResponseEntity<>(test, HttpStatus.OK);
    }
}
