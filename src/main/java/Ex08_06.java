public class Ex08_06 {
    public static void main(String[] args) {
        int aa[] = {10, 20, 30, 40, 50};   // 배열을 선언
        int count, size;               // 배열 요소의 개수와 배열의 실제 크기를 저장할 변수를 선언한다.

        count = aa.length;             // 배열 요소의 개수를 계산
        size = count * Integer.BYTES;  // 배열의 전체 크기(바이트)를 계산한다.

        System.out.printf("배열 aa[]의 요소의 개수는 %d개 입니다.\n", count);
        System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트입니다.\n", size);

        for (int i = 0; i < aa.length; i++) {
            System.out.println("aa[" + i + "] : " + aa[i]);
        }
    }
}