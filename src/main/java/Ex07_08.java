import java.util.Scanner;
public class Ex07_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.printf("더할 첫 번째 수 입력 : ");
            int a = s.nextInt();
            System.out.printf("더할 두 번째 수 입력 : ");
            int b = s.nextInt();

            if (a == 0){
                System.out.println("0값은 무의미 계산을 종료합니다");
                break;
            }
            System.out.printf("%d + %d = %d \n",a,b,a+b);
        }
    }
}
