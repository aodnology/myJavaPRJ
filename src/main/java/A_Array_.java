import java.util.Scanner;

public class A_Array_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aa[] = new int[3];
        int hap = 0;
        int i;

        for (i = 0; i < 3; i++) {
            System.out.printf((i + 1) + "번째 배열에 입력될 숫자 : ");
            aa[i] = s.nextInt();
        }
        for (i = 0; i < 3; i++) {
            System.out.println("aa[" + i + "]" + "=" + aa[i]);
            hap += aa[i];
        }
        System.out.println("배열의 총합 : "+hap);
        System.out.println("배열의 길이 : " + aa.length);

        int count = aa.length;
        System.out.println("배열의 길이(2): " + count);
    }
}
