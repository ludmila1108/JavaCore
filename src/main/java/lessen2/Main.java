package lessen2;

import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {

 String[][]stringsArray1=new String[][]{
         {"5", "text", "3"},
         {"1", "2", "3", "4"},
         {"1", "2", "5", "6"},
         {"1", "2", "4", "8"}
         };
         String[][]stringsArray2=new String[][]{
         {"5", "№", "3","8"},
         {"1", "2", "3", "4"},
         {"1", "2", "5", "6"},
         {"1", "2", "4", "8"}
         };
         String[][] stringArray3 = new String[][] {
         {"text", "5", "3", "4"},
         {"1", "2", "3", "4"},
         {"1", "2", "5", "6"},
         {"1", "2", "4", "8"}
         };
         String[][] stringArray4 = new String[][] {
         {"1", "2", "3", "4"},
         {"1", "2", "5", "6"},
         {"1", "2", "4", "8"}
         };

        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringsArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringsArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray4));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    public static  int transformAndSum (String[][] b) throws MyArraySizeException, MyArrayDataException {
        int arrDim = 4;
        int summa = 0;

        if (b.length != 4) {
            throw new MyArraySizeException(String.format("Размерность массива должна быть 4х4.", arrDim, arrDim));
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i].length != 4) {
                throw new MyArraySizeException(String.format("Размерность массива должна быть 4х4.", arrDim, arrDim));
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                try {
                summa += valueOf(b[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В позиции [%d][%d] исходного массива находится не целое число %s.", i, j, b[i][j]));
                }
            }
        }

        return summa;
    }

}
