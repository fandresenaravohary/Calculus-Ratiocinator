package com.CALCULUS.affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Verite extends Affirmation {
    private String description_de_verite;

    public Verite(String description, String description_de_verite) {
        super(description);
        this.description_de_verite = description_de_verite;
    }

    @Override
    public String evaluer() {
        return "vrai";
    }
}
