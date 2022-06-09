import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listexam_1 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();

        a.add("박수호");
        a.add("이협건");
        a.add("김영운");

        int size = a.size();

        //기존 반복문
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + " : 이름 " + a.get(i));
        }

        //Iterator는 자바의 컬렉션 프레임웍에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법
        Iterator<String> it = a.iterator();

        while (it.hasNext()){
            String na = it.next();
            System.out.println("이름 : "+na );
        }

        //foreach문
        for (String na : a) {
            System.out.println("이름 : "+na);
        }

        //람다식
        a.forEach(name -> System.out.println("이름 : " + name));
    }
}
