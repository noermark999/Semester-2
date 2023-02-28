package Opgave4;

public class Nedboer {
    private int[] nedboerPrUge = { 20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
        15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
        0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
        19, 21, 32, 24, 13 };
    
    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return
     */
    
    public int bedsteTreFerieUger() {
        int result = Integer.MAX_VALUE;
        int resultIndex = 0;
        for (int i = 0; i < nedboerPrUge.length-2; i++) {
            int sum = nedboerPrUge[i] + nedboerPrUge[i+1] + nedboerPrUge[i+2];
            if (sum<result){
                result = sum;
                resultIndex = i+1;
            }
        }
        return resultIndex;
    }
    
    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     *
     * @return
     */
    
    public int bedsteFerieUgerStart(int antal) {
        int result = Integer.MAX_VALUE;
        int resultIndex = 0;
        for (int i = 0; i < nedboerPrUge.length-antal; i++) {
            int sum = 0;
            for (int j = 0; j < antal; j++) {
                sum += nedboerPrUge[i+j];
            }
            if (sum<result){
                result = sum;
                resultIndex = i+1;
            }
        }
        return resultIndex;
    }
    
    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */
    public int ensNedboer() {
        int resultIndex = 0;
        int result = 0;
        for (int i = 0; i < nedboerPrUge.length; i++) {
            int maxLength = 0;
            for (int j = i+1; j < nedboerPrUge.length; j++) {
                if (nedboerPrUge[i] == nedboerPrUge[j]) {
                    maxLength++;
                } else {
                    if (maxLength>result){
                        result = maxLength;
                        resultIndex = i+1;
                    }
                    break;
                }
            }
        }
        return resultIndex;
    }
}
