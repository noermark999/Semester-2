package Opgave2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DictionarTest {
    Dictionary<Integer, String> dictionaryInt;
    Dictionary<Bil,Integer> dictionaryBil;
   

    @BeforeEach
    public void setUp() throws Exception {
        // dictionary = new DictionaryHashMap<>();
        dictionaryInt = new DictionaryLinked<>();
        dictionaryBil = new DictionaryLinked<>();
        
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
    public void testBilKey() {
        Bil bil1 = new Bil("BT 78 821", "Audi", "A3", "Sort");
        Bil bil2 = new Bil("AB 13 567", "Opel", "O3", "Blå");
        Bil bil3 = new Bil("YD 83 201", "Peugeot", "203", "Grå");
        Bil bil4 = new Bil("OL 12 912", "Tesla", "Speedster", "Hvid");

        assertTrue(dictionaryBil.isEmpty());
        assertEquals(0, dictionaryBil.size());

        dictionaryBil.put(bil1, 5);
        dictionaryBil.put(bil2, 2);

        assertFalse(dictionaryBil.isEmpty());
        assertEquals(2, dictionaryBil.size());

        assertEquals(5, dictionaryBil.get(bil1));

        dictionaryBil.put(bil3, 1);
        dictionaryBil.put(bil4, 7);

        assertFalse(dictionaryBil.isEmpty());
        assertEquals(4, dictionaryBil.size());

        assertEquals(2, dictionaryBil.remove(bil2));

        assertEquals(3, dictionaryBil.size());

        assertEquals(5, dictionaryBil.put(bil1, 6));
        assertEquals(6, dictionaryBil.get(bil1));
    }

    
    
}
