package com.example.coopprojectbackend.repositories;

import com.example.coopprojectbackend.models.CardModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<CardModel, String> {
}
