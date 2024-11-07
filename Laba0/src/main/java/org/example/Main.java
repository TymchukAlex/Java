package org.example;

public class Main {
    public static void main(String[] args) {
        Variant1 variant = new Variant1();

        //integerNumbersTask
        System.out.println("integerNumbersTask(250) = " + variant.integerNumbersTask(250));
        System.out.println("integerNumbersTask(99) = " + variant.integerNumbersTask(999));
        System.out.println("integerNumbersTask(100) = " + variant.integerNumbersTask(100));

        //booleanTask
        System.out.println("booleanTask(5) = " + variant.booleanTask(5));
        System.out.println("booleanTask(-3) = " + variant.booleanTask(-3));
        System.out.println("booleanTask(0) = " + variant.booleanTask(0));

        //ifTask
        System.out.println("ifTask(5) = " + variant.ifTask(5));
        System.out.println("ifTask(-1) = " + variant.ifTask(-1));
        System.out.println("ifTask(0) = " + variant.ifTask(0));

        //switchTask
        System.out.println("switchTask(1) = " + variant.switchTask(1));
        System.out.println("switchTask(4) = " + variant.switchTask(4));
        System.out.println("switchTask(7) = " + variant.switchTask(7));
        System.out.println("switchTask(8) = " + variant.switchTask(8));

        //forTask
        System.out.println("forTask:");
        variant.forTask(7, 4);

        //whileTask
        System.out.println("whileTask(10, 3) = " + variant.whileTask(10, 3));
        System.out.println("whileTask(12, 5) = " + variant.whileTask(12, 5));
        System.out.println("whileTask(25, 7) = " + variant.whileTask(25, 7));

        //arrayTask
        int[] arrayResult = variant.arrayTask(5);
        System.out.print("arrayTask(5) = ");
        for (int num : arrayResult) {
            System.out.print(num + " ");
        }
        System.out.println();

        //twoDimensionArrayTask
        int[][] matrixResult = variant.twoDimensionArrayTask(3, 5);
        System.out.println("twoDimensionArrayTask(3, 5):");
        for (int[] row : matrixResult) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}