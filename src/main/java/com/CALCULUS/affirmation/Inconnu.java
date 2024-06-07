package com.CALCULUS.affirmation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inconnu extends Affirmation {
    protected String description_de_inconnu;

    public Inconnu(String description, String description_de_inconnu) {
        super(description);
        this.description_de_inconnu = description_de_inconnu;
    }

    @Override
    public String evaluer() {
        return "je ne sais pas";
    }
}
