public class ex03_03 {
    public static void main(String[] args) {
        System.out.printf("%d\n", 123); // %d 정수
        System.out.printf("%5d\n", 123);
        System.out.printf("%05d\n", 123);

        System.out.printf("%f\n", 123.45); // %f 는 실수
        System.out.printf("%7.1f\n", 123.45); // 앞에 7칸확보 소수점자리는 한칸 확보 123.45 반올림해서 123.5
        System.out.printf("%7.3f\n", 123.45); // 앞에 7칸 확보 소수점자리 3칸 확보 빈칸은 0으로 채워짐

        System.out.printf("%s\n", "Hi~Java"); // %s = 문자 
        System.out.printf("%10s\n", "hi~java"); // %10s = 10칸확보후 후 문자 입력 뒤에서부터 채워진다
    }
}
