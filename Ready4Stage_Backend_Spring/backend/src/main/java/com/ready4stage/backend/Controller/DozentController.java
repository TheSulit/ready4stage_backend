package com.ready4stage.backend.Controller;

import java.util.List;
import java.util.Optional;

import com.ready4stage.backend.Entity.*;
import com.ready4stage.backend.Repository.DozentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DozentController {
    
    @Autowired
    DozentRepository dozentRepository;

    @GetMapping("/dozenten")
    public List<DozentModel> getAllDozent () {
        return dozentRepository.findAll();
    }

    @GetMapping(path = "/dozenten/{id}")
    public Optional<DozentModel> getDozentById (@PathVariable Integer id) {
        return dozentRepository.findById(id);
    }

}