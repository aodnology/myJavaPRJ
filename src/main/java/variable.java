public class variable {
    public static void main(String[] args) {
        /*
        int a;
        int b; == int a,b; == int a = 100 , b = 200

        int a;
        float b;
        int c;
        float d; == int a,b;
                    float b,d;
        같은 타입의 데이터는 묶어서 선언 가능하다.
         */
        int a; // 정수
        float b; // 실수

        a = (int) 123.45f;
        b = 200;

        System.out.printf("a의 값 ==> %d \n", a);
        System.out.printf("b의 값 ==> %f \n", b);
    }
}
