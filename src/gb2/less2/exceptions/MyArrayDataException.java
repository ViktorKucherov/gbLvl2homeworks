package gb2.less2.exceptions;

public class MyArrayDataException extends NumberFormatException{
    private int index;

    public MyArrayDataException(String value, int rowIndex, int colIndex) {
        super(String.format("Невозможно привести значение %s к числу, располагающемуся в массиве по адресу [%d][%d].%n",
                value,
                rowIndex,
                colIndex)
        );

    }
}
