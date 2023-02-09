package Opgave2;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Bibliotek {
    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * ovenfor
     * krav: beregnetDato og faktiskDato indeholder lovlige datoer og
     *       beregnetDato < faktiskDato
     *      (beregnetDato er forventet afleveringsdato og
     *       faktiskDato er den dag bogen blev afleveret; voksen er
     *       sand, hvis det er en voksen og falsk ellers)
     */
    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        long dage = DAYS.between(beregnetDato, faktiskDato);
        if (dage > 0) {
            if (voksen) {
                if (dage <= 7) {
                    return 20;
                } else if (dage <= 14) {
                    return 60;
                } else {
                    return 90;
                }
            } else {
                if (dage <= 7) {
                    return 10;
                } else if (dage <= 14) {
                    return 30;
                } else {
                    return 45;
                }
            }
        } else {
            return 0;
        }
    }
}
