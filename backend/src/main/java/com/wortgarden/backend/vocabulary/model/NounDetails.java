package com.wortgarden.backend.vocabulary.model;

import com.wortgarden.backend.vocabulary.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

@Getter
@Setter
@TypeAlias("noun")
public class NounDetails extends WordDetails {

    private Gender gender;
    private String plural;
    private String genitiveSingular;

}
