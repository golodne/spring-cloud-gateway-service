package ru.learning.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class FirstController {
    @GetMapping("/message")
    public String test() {
        return "hello in First Service";
    }
}
