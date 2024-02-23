package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")

public class HelloWorld {

    @GetMapping
    public String printHelloWorld(@RequestParam String name) {
        return "Hello world " + name;
    }


    @PostMapping("/hello")
    public ResponseEntity<String> helloWorld2(@RequestBody Person person){
        return new
                ResponseEntity<>("Hello "+person.getName() + " su edad es "+person.getAge(), HttpStatus.OK);
    }


}
