public class a_ {
    public static void main(String[] args) {
        int a = 2;
        int b = 1; // while 문 안에 대입 연산을 하지
                   // 않을 경우 반드시 선언을 먼저해주자
        while (b < 10) {

            // while 문 안에 대입 연산이 이루어지지 않을 경우 오류 발생

            System.out.println(a+"x"+b+"="+a*b);
            b++;
        }
    }
}