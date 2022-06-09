import java.util.ArrayList;
import java.util.List;
// 상당히 중요하니 외워야된다
public class Listexam {
    public static void main(String[] args) {

        List<String>list = new ArrayList<>();
        // 리스트를 스트링 타입으로 만들고 = Array형태로 리스트를 만들겠다 는 뜻
        // 데이터 정렬시    = new LinkedList<>(); 가 더 빠름

        // 컬렉션 프레임 워크는 인터페이스와 구현 방식을 분리하여 코드 수정을 빠르게 하는 이점이 있다.

        // List 객체에 데이터 추가하기
        list.add("이협건");
        list.add("김영운");
        list.add("김주경");
        list.add("배수환");
        list.add("길용단");

        // List의 데이터 수 구하기
        int listSize = list.size(); //배열의 langth 같은 의미

        // List 객체에 저장된 값 출력하기
        // 여러 데이터가 저장되기 때문에 내용을 확인하기 위해서는 반복문을 사용함
        for (int i = 0; i <listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }

        System.out.println("");

        for (String name : list){
            System.out.println("이름 : "+name);
        }
    }
}
