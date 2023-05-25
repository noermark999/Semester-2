package Opgave2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DictionarTest {
    Dictionary<Integer, String> dictionaryInt;
    Dictionary<Bil,Integer> dictionaryBil;
    Bil bil1;
    Bil bil2;
    Bil bil3;
    Bil bil4;
   

    @BeforeEach
    public void setUp() throws Exception {
        // dictionary = new DictionaryHashMap<>();
        dictionaryInt = new DictionaryLinked<>();
        dictionaryBil = new DictionaryLinked<>();
        bil1 = new Bil("BT 78 821", "Audi", "A3", "Sort");
        bil2 = new Bil("AB 13 567", "Opel", "O3", "Blå");
        bil3 = new Bil("YD 83 201", "Peugeot", "203", "Grå");
        bil4 = new Bil("OL 12 912", "Tesla", "Speedster", "Hvid");
        
    }
    
    @Test
    public void testIntegerKey() {
        assertTrue(dictionaryInt.isEmpty());
        assertEquals(0, dictionaryInt.size());

        dictionaryInt.put(8, "hans");
        dictionaryInt.put(3, "viggo");
        
        assertFalse(dictionaryInt.isEmpty());
        assertEquals(2, dictionaryInt.size());

        assertEquals("hans", dictionaryInt.get(8));

        dictionaryInt.put(7, "bent");
        dictionaryInt.put(2, "lene");
        
        assertFalse(dictionaryInt.isEmpty());
        assertEquals(4, dictionaryInt.size());
        
        assertEquals("viggo", dictionaryInt.remove(3));

        assertEquals(3, dictionaryInt.size());
        
        assertEquals("hans", dictionaryInt.put(8, "Ida"));
        assertEquals("Ida", dictionaryInt.get(8));

    }

    @Test
    public void testPut() {
        //Act
        dictionaryBil.put(bil1, 3);
        int expected = 3;

        //Assert
        int actual = dictionaryBil.get(bil1);
        assertEquals(expected, actual);

    }

    @Test
    public void testPutFindesAllerede1() {
        //Arrange
        dictionaryBil.put(bil1,3);

        //Act
        dictionaryBil.put(bil1,4);
        int expected = 4;

        //Assert
        int actual = dictionaryBil.get(bil1);
        assertEquals(expected,actual);
    }

    @Test
    public void testPutFindesAllerede2() {
        //Arrange
        dictionaryBil.put(bil1,3);

        //Act & Assert
        int expected = 3;
        assertEquals(expected,dictionaryBil.put(bil1,4));
    }

    @Test
    public void testPutFejl1() {
        //Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dictionaryBil.put(null,3);
        });
        assertEquals(exception.getMessage(),"Key eller value må ikke være null");
    }

    @Test
    public void testPutFejl2() {
        //Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dictionaryBil.put(bil1,null);
        });
        assertEquals(exception.getMessage(),"Key eller value må ikke være null");
    }

    @Test
    public void testEmpty1() {
        assertTrue(dictionaryBil.isEmpty());
    }
    @Test
    public void testEmpty2() {
        dictionaryBil.put(bil1,1);
        assertFalse(dictionaryBil.isEmpty());
    }

    @Test
    public void testSize() {
        //arrange
        dictionaryBil.put(bil1,1);
        dictionaryBil.put(bil2,3);

        //act
        int expected = 2;

        //assert
        int actual = dictionaryBil.size();
        assertEquals(expected,actual);
    }

    @Test
    public void testGet() {
        //Arrange
        dictionaryBil.put(bil1,5);

        //Act
        int expected = 5;

        //assert
        int actual = dictionaryBil.get(bil1);
        assertEquals(expected,actual);
    }

    @Test
    public void testRemove() {
        //arrange
        dictionaryBil.put(bil1,4);
        dictionaryBil.put(bil2,5);

        //act
        int expectedvalue = 5;
        int expectedsize = 1;

        //assert
        assertEquals(expectedvalue,dictionaryBil.remove(bil2));
        assertEquals(expectedsize,dictionaryBil.size());
    }

    @Test
    public void testRemove2() {
        //arrange
        dictionaryBil.put(bil2,5);
        dictionaryBil.put(bil4,23);

        //act & assert
        assertNull(dictionaryBil.remove(bil1));
    }
    
}
