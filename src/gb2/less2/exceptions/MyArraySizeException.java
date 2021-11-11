package gb2.less2.exceptions;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{

    public MyArraySizeException(){
        super("Неправильная размерность массива. Необходимая размерность массива: 4 x 4.");
    }
}
