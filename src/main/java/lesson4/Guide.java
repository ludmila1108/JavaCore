package lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Guide {
  public static Map<String, List<String>> guide_map = new HashMap<>();
  public static List<String> phone_number_list;




    public static void main(String[] args) {

        Guide guide = new Guide();

        Guide.add("antonyan", "8999123321");
        Guide.add("antonyan", "8912155326");
        Guide.add("bobov", "8917155552");
        Guide.add("bobov", "8913455672");
        Guide.add("antonyan", "899999999");
        Guide.add("igoryan", "899111111");
        Guide.add("bobov", "89923231999");
        Guide.add("smetanov", "8888123113");
        Guide.add("igoryan", "8324325234");

        System.out.println(guide.get("antonyan"));
        System.out.println(guide.get("igoryan"));
        System.out.println(guide.get("bobov"));
        System.out.println(guide.get("smetanov"));

    }

    public  List<String> get(String surname){

        return guide_map.get(surname);
    }

   private static void add(String surname, String phone_number) {

       if (guide_map.containsKey(surname)) {
            phone_number_list = guide_map.get(surname);
            phone_number_list.add(phone_number);
           guide_map.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            guide_map.put(surname, phone_number_list);
        }
    }

}





