import java.util.Scanner;
public class Ex08_03_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[4];
        int hap = 0, i;

        for (i = 0; i <4; i++){
            System.out.printf("%d번째 숫자를 입력하세요 : ", i+1);
            a[i] = s.nextInt();
        }
        hap = a[0] + a[1] + a[2] + a[3];
        System.out.printf("합계 ==> %d \n", hap);
    }
}
