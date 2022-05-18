public class Ex09_01 {
    public static void main(String[] args) {
        String str = "IT CookBook, java";
        int len;

        len = str.length();

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 : %d \n", len );

        if(str.length() > 0) {
            System.out.println("str 변수에 값이 존재한다.");
        } else {
            System.out.println("str 변수에 값이 존재하지 않는다.");
        }
        //값을 가지고 왔을때 값이 있는지 없는지 확인 할 때 많이 쓰임
    }
}
