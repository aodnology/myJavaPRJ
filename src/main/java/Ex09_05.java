import java.util.Scanner;

public class Ex09_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = s.nextLine();

        strRep = str.replace(" ", "$"); // 공백을 $로 바꿔중
        strSub = str.substring(3, 8); // 원하는 값만 추출하고 싶은 경우 (인덱스 번호가 3번부터 8번까지)
        strAry = str.split(" "); // 공백을 기준으로 하여 분리

        System.out.println("입력 문자열 ==> " + str);
        System.out.println("바꾼 문자열 ==> " + strRep);
        System.out.println("일부 문자열 ==> " + strSub);

        for (int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열" + i + "==> " + strAry[i]);
        }
    }
}
