import java.util.*;

public class Hashmap_ {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();
        // <> 어떤데이터가 들어갈건지 선언하는 표시 , Generic
        // new ArrayList<>(); ArrayList형태로 메모리에 올려라 <> : list의 데이터타입
        // 정상적으로 코드 작성시 new ArrayList<Map<String, String>>();
        // 앞에 선언된 데이터 타입을 그대로 따라가겠다는 의미

        Map<String, String> map = new HashMap<>(); // map이란 이름으로 메모리에 올림

        map.put("name", "박수호"); // map name 추가
        map.put("dept", "데이터분석"); //map dept 추가
        map.put("학번", "2220110015");

        list.add(map); // list 박수호, 데이터분석 추가

        map = null;

        map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("dept", "정보보안");
        map.put("학번", "19910523");

        list.add(map);

        map = null;

        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {

            Map rMap = list.get(i);
            System.out.println("name : " + rMap.get("name"));
            System.out.println("dept : " + rMap.get("dept"));
            System.out.println("학번 : " + rMap.get("학번"));
        }
        System.out.println("");

        for (Map<String, String> rMap : list) {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("dept : " + rMap.get("dept"));
            System.out.println("학번 : " + rMap.get("학번"));
        }
        System.out.println("");

        list.forEach(rMap -> {
                    System.out.println("name : " + rMap.get("name"));
                    System.out.println("dept : " + rMap.get("dept"));
                    System.out.println("학번 : " + rMap.get("학번"));
                }
        );
        System.out.println("");

        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            Map<String, String> rMap = it.next();
            System.out.println("name : " + rMap.get("name"));
            System.out.println("dept : " + rMap.get("dept"));
            System.out.println("학번 : " + rMap.get("학번"));
        }
    }
}
