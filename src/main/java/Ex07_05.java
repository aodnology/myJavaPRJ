public class Ex07_05 {
    public static void main(String[] args) {
        int a = 100;

        while (a == 200) {
            System.out.printf("while 문 내부에 들어 왔습니다.\n");
        }
        do {

            System.out.printf("do ~ while 문 내부에 들어 왔습니다.\n");
        } while (a == 200);


        // do while은 조건과 관계 없이 반드시 한번은 시행 된다.
        // do while은 한번은 실행하고 조건이 맞으면 do while 문 계속 시행함
    }
}
