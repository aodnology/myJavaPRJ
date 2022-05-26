public class Ex09_09 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java Programming";
        // 메모리 효율을 높여주기 위해 컴파일시 (한곳에서 가져다 쓰는 방식) Java programming 값을 같은 메모리에서 가져옴
        // 서로 다른 변수에 선언 되었으나 결과적으로 하나의 Java programming 이 각각 str1 str2 에 담겨있는 상태
        String str3 = new String("Java Programming"); // 메모리에

        System.out.println("원 문자열 ==> [" + str1 + "]");
        System.out.println("원 문자열 ==> [" + str2 + "]");
        System.out.println("원 문자열 ==> [" + str3 + "]\n");

        System.out.println("문자열1==문자열2 결과 : \t " +(str1 == str2)); // 같은 메모리의 값을 참조 하냐 안하냐
        System.out.println("문자열1.equals(문자열2) 결과 : \t " +str1.equals(str2)); // 순수하게 값만 비교하는 메소드
        System.out.println("문자열1==문자열3 결과 : \t " +(str1 == str3)); // 글씨는 같지만 메모리 공간이 다름
        System.out.println("문자열1.equals(문자열3) 결과 : \t " +str1.equals(str3));
        // String 에서 값을 비교할때는 == 사용 불가 , 값을 비교하고 싶을때는 equals() 사용
        System.out.println("문자열1과 문자열2가 다른지 비교 compareTo 안쓰고, 이렇게 함 : " + !str1.equals(str2));

    }
}
