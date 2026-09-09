package com.wortgarden.backend.vocabulary.model;

import com.wortgarden.backend.vocabulary.enums.Case;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

import java.util.Set;

@Getter
@Setter
@TypeAlias("preposition")
public class PrepositionDetails extends WordDetails{

    private Set<Case> cases;

}
