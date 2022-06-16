import java.util.*;

public class A_2_3 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("이름", "박수호");
        map.put("주소", "마포구");

        list.add(map); //
        map = null;
        map = new HashMap<>(); //

        map.put("이름", "홍길동");
        map.put("주소", "서울");

        list.add(map); //
        map = null;

        // 반복문에 공통적으로 Map에 List를 대입하는 코드가 존재
        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            Map rMap = list.get(i); //
            System.out.println("이름 : " + rMap.get("이름"));
            System.out.println("주소 : " + rMap.get("주소"));
            System.out.println("");
        }

        for (Map<String, String> rMap : list) { //
            System.out.println("이름 : " + rMap.get("이름"));
            System.out.println("주소 : " + rMap.get("주소"));
            System.out.println("");
        }
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            Map<String, String> rMap = it.next();
            System.out.println("이름 : " + rMap.get("이름"));
            System.out.println("주소 : " + rMap.get("주소"));
            System.out.println("");
        }
        list.forEach(rMap ->{
            System.out.println("이름 : " + rMap.get("이름"));
            System.out.println("주소 : " + rMap.get("주소"));
            System.out.println("");
        });
    }
}
