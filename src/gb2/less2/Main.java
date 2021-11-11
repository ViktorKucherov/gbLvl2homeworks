package gb2.less2;

import gb2.less2.exceptions.MyArrayDataException;
import gb2.less2.exceptions.MyArraySizeException;

public class Main {

    private static final String[][] correctArray =  {
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
    };

    private static final String[][] incorrectSizeArray = {
            {"1", "2", "3", "4", "5", "6", "7"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
    };

    private static final String[][] incorrectValuesOfArray = {
            {"1", "2", "5", "4"},
            {"1", "23", "3", "4"},
            {"1", "2", "ОШИБКА", "4"},
            {"1", "2", "346", "4"},
    };

    public static void main(String[] args) {

        // 1
        try {
            int result = sumOfElements(correctArray);
            System.out.println("Сумма элементов равна: " + result);
        } catch (MyArraySizeException myArraySizeException) {
            System.err.println("Некорректный размер массива");
            myArraySizeException.printStackTrace();
        } catch (MyArrayDataException myArrayDataException) {
            System.err.println("Некорректные данные в массиве");
            myArrayDataException.printStackTrace();
        }

        // 2
        try {
            int result = sumOfElements(incorrectSizeArray);
            System.out.println("Сумма элементов равна: " + result);
        } catch (MyArraySizeException myArraySizeException) {
            System.err.println("Некорректный размер массива");
            myArraySizeException.printStackTrace();
        } catch (MyArrayDataException myArrayDataException) {
            System.err.println("Некорректные данные в массиве");
            myArrayDataException.printStackTrace();
        }

        // 3
        try {
            int result = sumOfElements(incorrectValuesOfArray);
            System.out.println("Сумма элементов равна: " + result);
        } catch (MyArraySizeException myArraySizeException) {
            System.err.println("Некорректный размер массива");
            myArraySizeException.printStackTrace();
        } catch (MyArrayDataException myArrayDataException) {
            System.err.println("Некорректные данные в массиве");
            myArrayDataException.printStackTrace();
        }
    }

    public static void checkSizeOfArray(String[][] array) {
        final int ARRAY_SIZE = 4;
        if (array.length != ARRAY_SIZE) {
            throw new MyArraySizeException();
        }
        for (String[] e: array) {
            if(e.length != ARRAY_SIZE) {
                throw new MyArraySizeException();
            }
        }
    }

    /**
     * @param array 4*4
     * @return sum of array elements
     * @throws MyArrayDataException if data is incorrect (consist of text for ex.)
     * @throws MyArraySizeException if size of rows of array is not 4
     */
    public static int sumOfElements(String[][] array) throws MyArrayDataException, MyArraySizeException {

        checkSizeOfArray(array);

        int sum = 0;
        int rowIndex = 0;
        int colIndex = 0;
        for (String[] row: array) {
            for (String e: row) {
                try {
                    sum += Integer.parseInt(e);
                    colIndex++;
                    if (colIndex == 4) {
                        colIndex = 0;
                    }
                } catch (Exception exception) {
                    throw new MyArrayDataException(e, rowIndex, colIndex);
                }

            }
            rowIndex++;
        }
        return sum;
    }
}

