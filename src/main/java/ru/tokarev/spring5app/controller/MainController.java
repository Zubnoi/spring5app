package ru.tokarev.spring5app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andrey Tokarev on 17.01.2021
 * @project spring5app
 */

@RestController
public class MainController {

    @GetMapping("/")
    public void index() {
        System.out.println("hi");
    }
}
