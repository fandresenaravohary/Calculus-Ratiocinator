package com.CALCULUS.conjonction;

import com.CALCULUS.affirmation.Affirmation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Donc extends Affirmation {
    private Affirmation affirmation_1, affirmation_2;

    public Donc(Affirmation affirmation_1, Affirmation affirmation_2) {
        super(affirmation_1.getDescription() + "Donc" + affirmation_2.getDescription());
        this.affirmation_1 = affirmation_1;
        this.affirmation_2 = affirmation_2;
    }

    @Override
    public String evaluer() {
        String premiere_affirmation = affirmation_1.evaluer();
        String deuxieme_affirmation = affirmation_2.evaluer();
        if(premiere_affirmation.equals("vrai") && deuxieme_affirmation.equals("faux")){
            return "faux";
        } else if (premiere_affirmation.equals("faux") || deuxieme_affirmation.equals("vrai")) {
            return "vrai";
        }else {
            return "je ne sais pas";
        }
    }
}
