package com.ready4stage.backend.Controller;

import java.util.List;
import java.util.Optional;

import com.ready4stage.backend.Entity.TeilnehmerModel;
import com.ready4stage.backend.Repository.TeilnehmerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TeilnehmerController {
    
    @Autowired
    TeilnehmerRepository teilnehmerRepository;

    @GetMapping("/teilnehmer")
    public List<TeilnehmerModel> getAllTeilnehmer () {
        return teilnehmerRepository.findAll();
    }

    @GetMapping(path = "/teilnehmer/{id}")
    public Optional<TeilnehmerModel> getTeilnehmerById (@PathVariable Integer id) {
        return teilnehmerRepository.findById(id);
    }
}
