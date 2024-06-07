package com.CALCULUS.affirmation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mensonge extends Affirmation{
    protected String description_de_mensonge;

    public Mensonge(String description, String description_de_mensonge) {
        super(description);
        this.description_de_mensonge = description_de_mensonge;
    }

    @Override
    public String evaluer() {
        return "faux";
    }
}
