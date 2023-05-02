package ordinationlight.controller;

import ordinationlight.ordination.Laegemiddel;
import ordinationlight.ordination.Ordination;
import ordinationlight.ordination.Patient;
import ordinationlight.storage.Storage;
import ordinationlight.storage.StorageInterface;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ControllerTest {
    private Storage mockedStorage ;

    @Test
    void antalOrdinationerPrVægtPrLægemiddel() {
        //Arrange
        mockedStorage = mock(Storage.class);
        Controller controller = Controller.getController(mockedStorage);
        double vægtStart = 25;
        double vægtSlut = 100;
        List<Patient> patients = new ArrayList<>();
        Patient patient1 = mock(Patient.class);
        Patient patient2 = mock(Patient.class);
        when(patient1.getVaegt()).thenReturn(50.0);
        when(patient2.getVaegt()).thenReturn(70.0);
        patients.add(patient1);
        patients.add(patient2);

        Ordination ordination = mock(Ordination.class);
        List<Ordination> ordinations = new ArrayList<>();
        ordinations.add(ordination);
        when(patient1.getOrdinationer()).thenReturn(ordinations);
        when(patient2.getOrdinationer()).thenReturn(ordinations);
        when(mockedStorage.getAllPatienter()).thenReturn(patients);
        Laegemiddel laegemiddel = mock(Laegemiddel.class);
        when(ordination.getLaegemiddel()).thenReturn(laegemiddel);

        //Act
        int expected = controller.antalOrdinationerPrVægtPrLægemiddel(vægtStart,vægtSlut,laegemiddel);

        //Assert
        int actual = 2;
        assertEquals(expected,actual);
    }
}