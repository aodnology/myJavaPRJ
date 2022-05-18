public class Ex09_04 {
    public static void main(String[] args) {
        String str = "Java를 공부하는 중, Java는 재밌어요.^^";

        System.out.println("문자열 ==> " + str);

        System.out.println("제일 처음 나오는 Java위치 ==> " + str.indexOf("Java"));
        //System.out.println(str.indexOf("java"));
        System.out.println("마지막에 나오는 java 위치 ==> " + str.lastIndexOf("Java"));
        //System.out.println(str.lastIndexOf("java"));
    }
}
