import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class A_2_2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("이름", "박수호");
        map.put("주소", "마포구");
        map.put("이메일", "aodnology@gmail.com");

        System.out.println("이름 : " + map.get("이름"));
        System.out.println("주소 : " + map.get("주소"));
        System.out.println("이메일 : " + map.get("이메일"));

        for (String key : map.keySet()) {
            System.out.println(String.format(key + " : " + map.get(key)));
        }

        for (Map.Entry<String, String> elem : map.entrySet()) {
            System.out.println(String.format(elem.getKey() + " : " + elem.getValue()));
        }

        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format(key + " : " + map.get(key)));
        }

        map.forEach((key, value) -> {
            System.out.println(String.format(key + " : " + value));
        });

    }
}
