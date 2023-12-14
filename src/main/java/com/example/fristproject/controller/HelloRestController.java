package com.example.fristproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring";
    }


    @GetMapping("/success")
    public ResponseEntity successMessage(){
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping(value="/serverError" , produces = "application/json")
    public ResponseEntity serverErrorMessage(){
        Message message = Message.builder()
                .message1("첫번째 메시지입니다")
                .message2("메시지 두개 전달해보고 싶어서")
                .build();
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/onlystatus")
    public ResponseEntity onlyStatus(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/header")
    public ResponseEntity header(){
        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
        header.add("AUTHCODE","xxxxxxx");
        header.add("TOKEN", "xxxxxx");
        return new ResponseEntity(header, HttpStatus.OK);
    }

}
