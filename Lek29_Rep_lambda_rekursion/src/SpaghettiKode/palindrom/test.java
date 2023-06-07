package SpaghettiKode.palindrom;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> palindromer = new ArrayList<String>();

        String url = "Lek29_Rep_lambda_rekursion/src/SpaghettiKode/test/test-palindrom.txt";
        File palindromTxt = new File(url);
        Scanner palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromer.add(data);
        }
        palindromScanner.close();
        PalindromValidator palindromValidator = new PalindromValidator();
        for (String s : palindromer) {
            System.out.println(palindromValidator.erGyldigtPalindrom(s));
        }
    }
}
