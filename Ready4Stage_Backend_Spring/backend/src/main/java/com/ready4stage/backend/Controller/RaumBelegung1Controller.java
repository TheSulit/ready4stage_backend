package com.ready4stage.backend.Controller;

import java.util.List;
import java.util.Optional;

import com.ready4stage.backend.Entity.RaumBelegung1Model;
import com.ready4stage.backend.Repository.RaumBelegung1Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RaumBelegung1Controller {
    
    @Autowired
    RaumBelegung1Repository raumBelegung1Repository;

    @GetMapping("/raumBelegung1")
    public List<RaumBelegung1Model> getAllRaumBelegung1 () {
        return raumBelegung1Repository.findAll();
    }

    @GetMapping(path = "/raumBelegung1/{id}")
    public Optional<RaumBelegung1Model> getRaumBelegung1ById (@PathVariable Integer id) {
        return raumBelegung1Repository.findById(id);
    }
}