package SpaghettiKode.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import SpaghettiKode.palindrom.PalindromValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromValidatorTest
{
    ArrayList<String> palindromer;
    ArrayList<Integer> palindromprimtal;
    ArrayList<String> palindromDato;

    @BeforeEach
    void setUp() throws Exception
    {
        palindromer = new ArrayList<String>();

        URL url = getClass().getResource("test-palindrom.txt");
        File palindromTxt = new File(url.getPath());
        Scanner palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromer.add(data);
        }
        palindromScanner.close();

        palindromDato = new ArrayList<>();

        url = getClass().getResource("test-palindrom-datoer.txt");
        palindromTxt = new File(url.getPath());
        palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromDato.add(data);
        }
        palindromScanner.close();

        palindromprimtal = new ArrayList<Integer>();

        url = getClass().getResource("test-palindrom-primtal.txt");
        palindromTxt = new File(url.getPath());
        palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromprimtal.add(Integer.parseInt(data));
        }
        palindromScanner.close();
    }

    @Test
    void test()
    {
        PalindromValidator palindromValidator = new PalindromValidator();
        for (String s : palindromer) {
            assertTrue(palindromValidator.erGyldigtPalindrom(s), s);
        }
        for (String s : palindromDato) {
            assertTrue(palindromValidator.erGyldigtPalindrom(s), s);
        }
    }

}
