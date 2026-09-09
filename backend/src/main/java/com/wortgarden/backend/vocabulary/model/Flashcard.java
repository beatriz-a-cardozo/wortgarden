package com.wortgarden.backend.vocabulary.model;

import com.wortgarden.backend.vocabulary.enums.Level;
import com.wortgarden.backend.vocabulary.enums.Source;
import com.wortgarden.backend.vocabulary.enums.WordType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Document("flashcards")
public class Flashcard {

    @Id
    private String id;

    private String userId;
    private WordType wordType;
    private String wordBase;
    private String translation;
    private WordDetails details;
    private List<Example> examples;
    private List<String> tags;
    private Level level;
    private Source source;

    private int repetitions;
    private int status;
    private LocalDateTime lastReview;
    private LocalDateTime nextReview;
}
