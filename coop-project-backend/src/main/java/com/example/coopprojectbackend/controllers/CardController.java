package com.example.coopprojectbackend.controllers;

import com.example.coopprojectbackend.models.CardModel;
import com.example.coopprojectbackend.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/carte")
public class CardController {
    @Autowired
    private final CardService cardService;

    public CardController(CardService cardService){
        this.cardService = cardService;
    }

    @GetMapping(path = "/allcards", produces = "application/json")
    public List<CardModel> prendiTutteLeCarte() {
        return cardService.cercaTutteLeCarte();
    }
}
