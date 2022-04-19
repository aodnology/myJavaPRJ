public class Ex07_02 {
    public static void main(String[] args) {
        int hap = 0;
        int a = 1;
        while (a < 11) {
            hap += a;
            a++;
        }
        System.out.println("1에서 10까지의 합은 " + hap);
    }
}