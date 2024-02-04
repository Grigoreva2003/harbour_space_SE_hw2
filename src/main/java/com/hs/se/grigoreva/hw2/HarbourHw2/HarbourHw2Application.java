package com.hs.se.grigoreva.hw2.HarbourHw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class HarbourHw2Application {
    String FIRST_NAME = "Vasilisa";
    String FULL_NAME = "Grigoreva " + FIRST_NAME;

    @RequestMapping(value = "/v1/student/name")
    @ResponseBody
    public String studentName(@RequestParam(value = "formal", defaultValue = "true") Boolean formal) {
        if (formal)
            return FULL_NAME;
        return FIRST_NAME;
    }

    public static void main(String[] args) {
        SpringApplication.run(HarbourHw2Application.class, args);
    }
}
