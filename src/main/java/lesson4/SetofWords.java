package lesson4;


import java.util.HashMap;

public class SetofWords {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] Words = {"книга", "журнал", "газета",
                "блокнот", "книга", "тетрадь", "книга",
                "учебник", "лист", "книга", "книга",
                "книга", "журнал"};

 for (int i = 0; i < Words.length; i++) {
     if (!map.containsKey(Words[i])) {
         map.put(Words[i], 1);
     } else {
         map.put(Words[i], map.get(Words[i]) + 1);
     }
 }
        System.out.println(map);
}










}
