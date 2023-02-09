package Opgave1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    @Test
    void beregnPraemie_alder18_mand_0skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 18;
        boolean isKvinde = false;
        int skadeFrieaer = 0;

        // Act
        double actualPraemie = bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);

        // Assert
        double expectedPraemie = 1250;
        assertEquals(expectedPraemie,actualPraemie);
    }

    @Test
    void beregnPraemie_alder30_mand_3skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = false;
        int skadeFrieaer = 3;

        // Act
        double actualPraemie = bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);

        // Assert
        double expectedPraemie = 850;
        assertEquals(expectedPraemie,actualPraemie);
    }

    @Test
    void beregnPraemie_alder20_kvinde_1skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 20;
        boolean isKvinde = true;
        int skadeFrieaer = 1;

        // Act
        double actualPraemie = bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);

        // Assert
        double expectedPraemie = 1187.5;
        assertEquals(expectedPraemie,actualPraemie);
    }

    @Test
    void beregnPraemie_alder32_kvinde_6skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 32;
        boolean isKvinde = true;
        int skadeFrieaer = 6;

        // Act
        double actualPraemie = bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);

        // Assert
        double expectedPraemie = 712.5;
        assertEquals(expectedPraemie,actualPraemie);
    }

    @Test
    void beregnPraemie_alder40_mand_8skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 40;
        boolean isKvinde = false;
        int skadeFrieaer = 8;

        // Act
        double actualPraemie = bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);

        // Assert
        double expectedPraemie = 750;
        assertEquals(expectedPraemie,actualPraemie);
    }

    @Test
    void beregnPraemie_alder55_mand_9skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 55;
        boolean isKvinde = false;
        int skadeFrieaer = 9;

        // Act
        double actualPraemie = bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);

        // Assert
        double expectedPraemie = 650;
        assertEquals(expectedPraemie,actualPraemie);
    }

    @Test
    void beregnPraemie_alder24_kvinde_4skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 24;
        boolean isKvinde = true;
        int skadeFrieaer = 4;

        // Act
        double actualPraemie = bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);

        // Assert
        double expectedPraemie = 1009.375;
        assertEquals(expectedPraemie,actualPraemie);
    }

    @Test
    void beregnPraemie_alder17_mand_0skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 17;
        boolean isKvinde = false;
        int skadeFrieaer = 0;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);
        });
        assertEquals(exception.getMessage(), "Du er for ung til at tegne en forsikring");
    }

    @Test
    void beregnPraemie_aldernegativ1_mand_0skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = -1;
        boolean isKvinde = false;
        int skadeFrieaer = 0;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);
        });
        assertEquals(exception.getMessage(), "Du er for ung til at tegne en forsikring");
    }

    @Test
    void beregnPraemie_alder18_mand_negativ1skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 18;
        boolean isKvinde = false;
        int skadeFrieaer = -1;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);
        });
        assertEquals(exception.getMessage(), "Antal skade frie aer skal vaere positiv");
    }

    @Test
    void beregnPraemie_alder18_kvinde_4skadefri() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        bilForsikring.setGrundpaemie(1000);
        int alder = 18;
        boolean isKvinde = false;
        int skadeFrieaer = 4;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder,isKvinde, skadeFrieaer);
        });
        assertEquals(exception.getMessage(), "Du kan ikke have kaert skadefri saelaenge");
    }

    @Test
    void beregnPraemie_negativGrundpraemie() {
        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        int alder = 18;
        boolean isKvinde = false;
        int skadeFrieaer = 0;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.setGrundpaemie(-1000);
        });
        assertEquals(exception.getMessage(), "grundPr skal vaere positiv");
    }

}