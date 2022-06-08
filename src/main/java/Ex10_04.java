public class Ex10_04 {
    public static void main(String[] args) {
        // 강제로 에러를 일으키는 경우

        int a = 100, b = 0;
        int result;

        try {
            if (b == 0)
                throw new Exception("0으로 나누려고요? 안됩니다."); // Exception 서로 같아야함
            // 메모리에 올리는 작업 필요 'new'
            // 조건이 만족 됐을 시 catch문으로 던짐

            result = a / b;
        } catch (Exception e) {                                  // Exception 서로 같아야함
            System.out.println("발생오류 ==> " + e.getMessage());
            System.out.println("에러 메세지 : " +e);

            // 에러메세지가 Exception 으로 나온 이유 : Exception으로 던졌기 때문
        }
    }
}
