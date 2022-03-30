package lessen2;


 public class MyArraySizeException extends RuntimeException {
     public static void main(String[] args) {

     }
         MyArraySizeException(String a) {
             super("Ошибка размерности массива.\n" + " " + a);
         }

}
