package com.company.lesson9;

import com.company.lesson9.exception.MyArrayDataException;
import com.company.lesson9.exception.MyArraySizeException;

public class main {

    public static void main(String[] args)  {
        final int requiredMatrixSize = 4;
        String[][] arr = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};

        try {
            int sumValues = castArrayValuesToInt(arr, requiredMatrixSize);
            System.out.println(sumValues);

        } catch (MyArrayDataException dataException) {
            System.err.println("Ошибка преобразования данных");
        } catch (MyArraySizeException arraySizeException) {
            System.err.println("Некоррктный размер массива");
        }
    }

    private static int castArrayValuesToInt(String[][] numStrings, int requiredMatrixSize) {
        if (matrixNotIsSquare(numStrings, requiredMatrixSize)) {
            throw new MyArraySizeException();
        }

        int result = 0;
        for (int i = 0; i < numStrings.length; i++) {
            for (int j = 0; j < numStrings[i].length; j++) {
                result += tryParseAndGetValue(numStrings, i, j);
            }
        }
        return result;
    }

    private static int tryParseAndGetValue(String[][] numStrings, int rowIndex, int columnIndex) {
        try {
            return Integer.parseInt(numStrings[rowIndex][columnIndex]);
        } catch (Exception ex) {
            throw new MyArrayDataException("Ошибка в " + rowIndex + " " + columnIndex);
        }
    }

    private static boolean matrixNotIsSquare(String[][] array, int size) {
        if (array.length != size) {
            return true;
        }

        for (String[] values : array) {
            if (values.length != size) {
                return true;
            }
        }

        return false;
    }

}