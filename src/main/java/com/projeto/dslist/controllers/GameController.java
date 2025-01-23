package com.projeto.dslist.controllers;

import com.projeto.dslist.dto.GameMinDTO;
import com.projeto.dslist.entities.Game;
import com.projeto.dslist.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameServices gameServices;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameServices.findAll();
        return result;
    }
}
