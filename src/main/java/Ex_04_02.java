public class Ex_04_02 {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        int result1, mok, namugi;
        float result2;

        result1 = a + b - c;
        System.out.println(a + " + " + b + " - " + c + " = " + result1);

        result1 = a + b * c;
        System.out.println(a + " + " + b + " * " + c + " = " + result1);

        result2 = a * b / (float) c; // 정수 c를 강제 형 변환
        System.out.println(a + " * " + b + " / " + c + " = " + result2);

        mok = c / b;
        System.out.println(c + " / " + b + " 의 몫은 " + mok);

        namugi = c % b;
        System.out.println(c + " % " + b + " 의 나머지는 " + namugi);
    }
}