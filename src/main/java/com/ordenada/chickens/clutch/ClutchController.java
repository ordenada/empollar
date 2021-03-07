package com.ordenada.chickens.clutch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "api/v1/clutch")
public class ClutchController {

    private final ClutchService clutchService;


    @Autowired
    public ClutchController(ClutchService clutchService) {
        this.clutchService = clutchService;
    }
}
