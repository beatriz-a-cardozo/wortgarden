package com.wortgarden.backend.vocabulary.repository;

import com.wortgarden.backend.vocabulary.model.Flashcard;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FlashcardRepository extends MongoRepository<Flashcard, String> {

    List<Flashcard> findByUserId(String userId);

}
