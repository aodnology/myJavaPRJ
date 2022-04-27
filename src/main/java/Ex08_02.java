import java.util.Scanner;

public class Ex08_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4]; // 인티저 형태로 4칸을 메모리로 올려라
        //int aa[] = {100, 200, 300, 400}
        // []의 위치가 바뀌어도 되고 {}대괄호 안에 변수 선언 가능
        //int aa[];
        //aa = new int[] {100,200,300,400}
        int hap;

        for (int i = 0; i < 4; i++){
            System.out.printf("%d번째 숫자를 입력하세요.", i+1);
            aa[i] = s.nextInt();
        }

        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.println("합계 : " + hap);

        for ( int i = 0; i <4; i++){
            System.out.println("aa["+ i + "] =" + aa[i]);
        }
    }
}
