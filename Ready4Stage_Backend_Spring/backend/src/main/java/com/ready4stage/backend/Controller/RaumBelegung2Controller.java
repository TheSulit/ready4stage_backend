package com.ready4stage.backend.Controller;

import java.util.List;
import java.util.Optional;

import com.ready4stage.backend.Entity.RaumBelegung2Model;
import com.ready4stage.backend.Repository.RaumBelegung2Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RaumBelegung2Controller {
    
    @Autowired
    RaumBelegung2Repository raumBelegung2Repository;

    @GetMapping("/raumBelegung2")
    public List<RaumBelegung2Model> getAllRaumBelegung2 () {
        return raumBelegung2Repository.findAll();
    }

    @GetMapping(path = "/raumBelegung2/{id}")
    public Optional<RaumBelegung2Model> getRaumBelegung2ById (@PathVariable Integer id) {
        return raumBelegung2Repository.findById(id);
    }
}