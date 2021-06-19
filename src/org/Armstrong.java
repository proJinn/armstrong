package org;

public class Armstrong extends Numeral {
    private boolean result;

    public Armstrong(int numeral) {
        super(numeral);
        result = algorythm(numeral);
    }

    public void setNumeral(int numeral) {
        algorythm(numeral);
    }
    
    public boolean getResult() {
        return this.result;    
    }
    
    private boolean algorythm(int numeral) {
        // TODO: Передать в конструктор базового класса Numeral

        int[] digits = getDigits();

        final int l = digits.length;
        int s = 0;
        for (int i = 0; i < l; ++i) {
            s += Math.pow(digits[i], l);
        }
        return s == numeral;
    }
}