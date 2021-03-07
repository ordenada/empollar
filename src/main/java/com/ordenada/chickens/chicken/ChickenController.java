package com.ordenada.chickens.chicken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/chicken")
public class ChickenController {

    private final ChickenService chickenService;

    @Autowired
    public ChickenController(ChickenService chickenService) {
        this.chickenService = chickenService;
    }

    @GetMapping
    public List<Chicken> getChickens(){
        return chickenService.getChickens();
    }

}
