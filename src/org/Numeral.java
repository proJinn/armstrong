package org;

public class Numeral {
    private int digit_count; // Разрядов в числе
    private int[] digits;    // Массив с числами по разрядам

    public Numeral(int numeral) {
        splitToDigitsByDivision(numeral);
    }

    public int[] getDigits() {
        return this.digits;
    }

    private void splitToDigits(int numeral) {
        // Вычислить разрядность числа методом строк
        // TODO: delete this method, his unused

        String raw = String.valueOf(numeral);
        final int l = raw.length();
        this.digits = new int[l];

        for (int i = 0; i < l; ++i) {
            this.digits[i] = Integer.parseInt(String.valueOf(raw.charAt(i)));
        }
    }

    private void calcDigitCount(int numeral) {
        // Узнаем разрядность числа
        this.digit_count = 0;
        while (numeral > 0) {
            numeral /= 10;
            this.digit_count += 1;
        }
    }

    private void splitToDigitsByDivision(int numeral) {
        // Вычислить разрядность числа методом деления
        this.calcDigitCount(numeral);
        this.digits = new int[this.digit_count];
        int i = 0;
        while (numeral > 0) {
            this.digits[i] = numeral % 10;
            numeral /= 10;
            i ++;
        }

    }
}