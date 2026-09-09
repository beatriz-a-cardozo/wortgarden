package com.wortgarden.backend.vocabulary.model;

import com.wortgarden.backend.vocabulary.enums.Source;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Example {

    private String original;
    private String translation;
    private Source source;

}
