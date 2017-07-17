package com.szaboz.libraryServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by szaboz on 2017.07.06..
 */
@RestController
public class ServerController {
    @RequestMapping("/")
    String home() {
        return "{'response':'home'}";
    }

    @RequestMapping("/hello")
    String hello() {
        return "{'response':'Hello'}";
    }
}
