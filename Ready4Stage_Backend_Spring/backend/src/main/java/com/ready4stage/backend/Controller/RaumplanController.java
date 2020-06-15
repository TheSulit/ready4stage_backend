package com.ready4stage.backend.Controller;

import java.util.List;
import java.util.Optional;

import com.ready4stage.backend.Entity.*;
import com.ready4stage.backend.Repository.RaumplanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RaumplanController {
    
    @Autowired
    RaumplanRepository raumplanRepository;

    @GetMapping("/raumplan")
    public List<RaumplanModel> getAllRaumplan () {
        return raumplanRepository.findAll();
    }

    @GetMapping(path = "/raumplan/{id}")
    public Optional<RaumplanModel> getRaumplanById (@PathVariable Integer id) {
        return raumplanRepository.findById(id);
    }
}