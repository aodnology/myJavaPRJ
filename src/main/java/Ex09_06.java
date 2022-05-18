public class Ex09_06 {
    public static void main(String[] args) {
        String str = " 한글 ABCD efgh ";

        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("대문자로 ==> [" + str.toUpperCase() + "]");
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");
        System.out.println("공백제거 ==> [" + str.trim() + "]"); // 데이터 추출시 앞,뒤 공백이 있는 경우가 많음 trim은 문자열의 앞과 뒤의 공백을 제거해준다
        System.out.println("전체 공백제거 ==> [" + str.replaceAll(" ", "") + "]"); //책의 예제 9-7과 같은 동작을 하며 더 자주 쓰이는 코드
    }
}