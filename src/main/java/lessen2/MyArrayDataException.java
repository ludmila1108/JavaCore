package lessen2;

public class MyArrayDataException extends RuntimeException {
     public static void main(String[] args) {

     }
    MyArrayDataException(String a) {
        super("Ошибка преобразования элемента массива в целое число.\n" + " " + a);
    }

}

