package br.com.alura.api.model.enums;

import lombok.Getter;

@Getter
public enum Specialty {
    ORTHOPEDICS("Ortopedia"),
    CARDIOLOGY("Cardiologia"),
    GYNECOLOGY("Ginecologia"),
    DERMATOLOGY("Dermatologia");

    private final String displayName;

    Specialty(String displayName) {
        this.displayName = displayName;
    }
}
