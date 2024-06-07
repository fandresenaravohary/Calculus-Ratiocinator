package com.CALCULUS.affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Affirmation {
    protected String description;

    public abstract String evaluer();
}
