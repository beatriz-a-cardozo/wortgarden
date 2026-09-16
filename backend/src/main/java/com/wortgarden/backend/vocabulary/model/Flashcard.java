package com.wortgarden.backend.vocabulary.model;

import com.wortgarden.backend.vocabulary.enums.Level;
import com.wortgarden.backend.vocabulary.enums.Source;
import com.wortgarden.backend.vocabulary.enums.WordType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import java.util.List;

@Getter
@Setter
public class Flashcard {

    private WordType wordType;
    private String wordBase;
    private String translation;
    private WordDetails details;
    private List<Example> examples;
    private List<String> tags;
    private CefrLevel cefrLevel;
    private Source source;

}
