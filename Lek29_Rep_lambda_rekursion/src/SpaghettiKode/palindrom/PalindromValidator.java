package SpaghettiKode.palindrom;

public class PalindromValidator implements PalindromValidatorI {

    @Override
    public boolean erGyldigtPalindrom(String tekst) {
        tekst = tekst.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return palindromRec(0,tekst.length()-1, tekst);
    }

    private boolean palindromRec(int i1, int i2, String tekst) {
        if (i2 < i1) {
            return true;
        } else if (tekst.charAt(i1) == tekst.charAt(i2)) {
            return palindromRec(i1+1,i2-1,tekst);
        }
        return false;
    }

    @Override
    public boolean erGyldigtPalindromPrimtal(int tal) {
        return false;
    }
}
