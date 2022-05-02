public class Ex08_06_2 {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int count, size;

        count = a.length;
        size = count * Integer.BYTES;

        System.out.printf("배열 a[]의 요소의 개수는 %d 입니다. \n", count);
        System.out.printf("배열 a[]의 요소의 전체 크기는 %d 바이트입니다. \n", size);

        for (int i = 0; i < a.length; i++) {
            System.out.println("aa[" + i + "] : " + a[i]);
        }
    }
}
