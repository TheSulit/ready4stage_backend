package com.ready4stage.backend.Controller;

import java.util.List;

import com.ready4stage.backend.Entity.TeilnehmerModel;
import com.ready4stage.backend.Repository.TeilnehmerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TeilnehmerController {
    
    @Autowired
    TeilnehmerRepository teilnehmerRepository;

    @GetMapping("/test")
    public String test() {
        return "hier werden die Teilnehmer im JSON Format sein!";
    }

    @GetMapping("/teilnehmer")
    public List<TeilnehmerModel> getTeilnehmer () {
        return teilnehmerRepository.findAll();
    }

}