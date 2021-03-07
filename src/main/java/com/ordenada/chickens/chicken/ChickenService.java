package com.ordenada.chickens.chicken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChickenService {

    private final ChickenRepository chickenRepository;

    @Autowired
    public ChickenService(ChickenRepository chickenRepository) {
        this.chickenRepository = chickenRepository;
    }

    public List<Chicken> getChickens(){
        return chickenRepository.findAll();
    }
}
