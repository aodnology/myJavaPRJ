import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExam2 {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>(); // 리스트의 데이터 타입과 동일해야함
                                                   // 메모리에 올라간 상태
        map.put("name", "박수호");
        map.put("email", "aodnology@gmail.com");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        list.add(map); // 앞서 등록한 정보를 list에 저장

        map = null; // 메모리에 데이터를 지우는 방식으로 정보를 삭제
                    // 쓰지 않는 데이터는 삭제 해주는 습관을 가지자

        map = new HashMap<>();  // 기존 map 객체의 값을 새롭게 생성하기

        // 홍길동 정보 저장하기
        map.put("name", "홍길동");
        map.put("email", "g.d.hong@kopo.ac.kr");
        map.put("addr", "경기");
        map.put("dept", "시각디자인과");

        list.add(map); // 앞서 등록한 정보를 list에 저장

        map = null; // 메모리에 데이터를 지우는 방식으로 정보를 삭제
                    // 널 값을 대입하면 데이터가 전부 지워짐
                    // ( new HashMap<>(); 까지 풀림 )

        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {

            Map<String, String> rmap = list.get(i);
            System.out.println("name : " + rmap.get("name"));
            System.out.println("email : " + rmap.get("email"));
            System.out.println("addr : " + rmap.get("addr"));
            System.out.println("dept : " + rmap.get("dept"));
            System.out.println("--------------------------");
        }
    }
}