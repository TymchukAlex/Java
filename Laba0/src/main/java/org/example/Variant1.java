package org.example;

public class Variant1 {

    public int integerNumbersTask(int k) {
        return k / 100;
    }

    public boolean booleanTask(int number1) {
        return number1 > 0;
    }

    public int ifTask(int parameter) {
        if (parameter > 0) {
            return parameter + 1;
        } else {
            return parameter;
        }
    }

    public String switchTask(int number1) {
        switch (number1) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Not the right number";
        }
    }

    public void forTask(int k, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(k);
        }
    }

    public int whileTask(int a, int b) {
        int remainder = a;
        while (remainder >= b) {
            remainder -= b;
        }
        return remainder;
    }

    public int[] arrayTask(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = 1 + 2 * i;
        }
        return result;
    }

    public int[][] twoDimensionArrayTask(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 10 * (i + 1);
            }
        }
        return matrix;
    }
}