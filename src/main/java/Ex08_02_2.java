import java.util.Scanner;
public class Ex08_02_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int [4];
        int hap;

        for ( int i = 0; i <4; i++){
            System.out.printf("%d번째 숫자를 입력하세요", i+1);
            a[i] = s.nextInt();
        }
        hap = a[0] + a[1] + a[2]+ a[3];
        System.out.println("합계 : " + hap);

        for ( int i = 0; i <4; i++){
            System.out.println("a["+i+"] ="+a[i]);
        }
    }
}
