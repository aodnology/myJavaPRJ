import java.util.Scanner;
public class Test06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("첫번째 수를 입력하세요 : ");
        int a = s.nextInt();
        System.out.println("계산할 연산자를 입력하세요 : ");
        char ch = s.next().charAt(0);
        System.out.println("두번째 수를 입력하세요 : ");
        int b = s.nextInt();

        if (ch == '+') {
            System.out.printf("%d + %d = %d \n", a, b, a + b);
        }else if (ch == '-'){
            System.out.printf("%d - %d = %d \n",a, b, a-b);
        }else if (ch == '*'){
            System.out.printf("%d * %d = %d \n", a, b, a*b);
        }else if (ch == '/'){
            System.out.printf("%d / %d = %d \n", a, b, a/b);
        }else if (ch == '%'){
            System.out.printf("%d %% %d = %d \n", a, b, a%b);
        }
    }
}
