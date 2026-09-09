package com.wortgarden.backend.vocabulary.model;

import com.wortgarden.backend.vocabulary.enums.Auxiliary;
import com.wortgarden.backend.vocabulary.enums.Case;
import com.wortgarden.backend.vocabulary.enums.Pronoun;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@TypeAlias("verb")
public class VerbDetails extends WordDetails{

    private boolean separable;
    private boolean reflexive;
    private Auxiliary perfektAuxiliary;
    private String perfekt;
    private Map<Pronoun, String> praesens;
    private Map<Pronoun, String> prateritum;
    private String partizipII;
    private Set<Case> cases;
    private List<String> prepositions;

}
