package Opgave2;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BibliotekTest {
    Bibliotek bibliotek;
    LocalDate beregnetDato = LocalDate.of(2023,1,1);

    @BeforeEach
    void setUp() {
        this.bibliotek = new Bibliotek();
    }

    @Test
    @Order(1)
    void beregnBøde_0dage() {
        // Arrange
        LocalDate faktiskDato = LocalDate.of(2023,1,1);
        boolean voksen = false;

        // Act
        int actualBøde = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        int expectedBøde = 0;
        assertEquals(expectedBøde,actualBøde);
    }

    @Test
    @Order(2)
    void beregnBøde_1dag_barn() {
        // Arrange
        LocalDate faktiskDato = LocalDate.of(2023,1,2);
        boolean voksen = false;

        // Act
        int actualBøde = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        int expectedBøde = 10;
        assertEquals(expectedBøde,actualBøde);

    }

    @Test
    @Order(3)
    void beregnBøde_1dag_Voksen() {
        // Arrange
        LocalDate faktiskDato = LocalDate.of(2023,1,2);
        boolean voksen = true;

        // Act
        int actualBøde = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        int expectedBøde = 20;
        assertEquals(expectedBøde,actualBøde);
    }

    @Test
    @Order(4)
    void beregnBøde_8dage_barn() {
        // Arrange
        LocalDate faktiskDato = LocalDate.of(2023,1,9);
        boolean voksen = false;

        // Act
        int actualBøde = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        int expectedBøde = 30;
        assertEquals(expectedBøde,actualBøde);

    }

    @Test
    @Order(5)
    void beregnBøde_8dage_voksen() {
        // Arrange
        LocalDate faktiskDato = LocalDate.of(2023,1,9);
        boolean voksen = true;

        // Act
        int actualBøde = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        int expectedBøde = 60;
        assertEquals(expectedBøde,actualBøde);

    }

    @Test
    @Order(6)
    void beregnBøde_15dage_barn() {
        // Arrange
        LocalDate faktiskDato = LocalDate.of(2023,1,16);
        boolean voksen = false;

        // Act
        int actualBøde = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        int expectedBøde = 45;
        assertEquals(expectedBøde,actualBøde);

    }

    @Test
    @Order(7)
    void beregnBøde_15dage_Voksen() {
        // Arrange
        LocalDate faktiskDato = LocalDate.of(2023,1,16);
        boolean voksen = true;

        // Act
        int actualBøde = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        int expectedBøde = 90;
        assertEquals(expectedBøde,actualBøde);
    }
}