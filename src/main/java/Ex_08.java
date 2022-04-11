public class Ex_08 {
    public static void main(String[] args) {
        int a = 10, b;

        // a+1 하기전에 b에 먼저 a값을 저장하고, a+1실행
        b = a++;
        // b = 10 , a = 11
        System.out.printf(" %d \n", b);
        // a = 11
        b = ++a;
        // a+1 먼저하고, b에 값을 저장
        System.out.printf(" %d \n", b);
    }
}
