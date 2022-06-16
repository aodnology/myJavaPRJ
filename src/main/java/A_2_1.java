import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A_2_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("김영운");
        list.add("이협건");

        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }

        for (String name : list) {
            System.out.println("이름 : " + name);
        }

        Iterator<String> it = list.iterator(); //
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }

        list.forEach(name -> {
            System.out.println("이름 : " + name);
        });
    }
}
