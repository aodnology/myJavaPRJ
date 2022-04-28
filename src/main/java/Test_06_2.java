import java.util.Scanner;

public class Test_06_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("첫번째수");
        int a = s.nextInt();
        System.out.printf("연산자");
        char ch = s.next().charAt(0);
        System.out.printf("두번째수");
        int b = s.nextInt();

        if (ch == '+') {
            System.out.printf("%d + %d = %d \n", a, b, a + b);
        }
        if (ch == '-') {
            System.out.printf("%d - %d = %d \n", a, b, a - b);
        }
        if (ch == '*') {
            System.out.printf("%d * %d = %d \n", a, b, a * b);
        }
        if (ch == '/') {
            System.out.printf("%d / %d = %d \n", a, b, a / b);
        }
        if (ch == '%') {
            System.out.printf("%d %% %d = %d \n", a, b, a % b);
        }
    }
}
