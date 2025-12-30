package com.example.coopprojectbackend.services;

import com.example.coopprojectbackend.models.CardModel;
import com.example.coopprojectbackend.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    @Autowired
    private final CardRepository cardRepository;
    public CardService(CardRepository cardRepository){
        this.cardRepository = cardRepository;
    }
    public List<CardModel> cercaTutteLeCarte(){
        return cardRepository.findAll();
    }
}
