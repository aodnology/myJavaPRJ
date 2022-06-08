public class Ex10_01 {
    public static void main(String[] args) {
        int aa[]= new int[3]; // 배열 0,1,2
        try {
            aa[3] = 100;     // 강제로 3에 값을 대입하려고 함 (에러 발생)
        } catch (ArrayIndexOutOfBoundsException e){ //catch 여러개 사용 가능

            // e : 숫자빼고 아무거나 써도됨 변수 같은 것
            // 에러 메세지가 e에 담겨있는다

            System.out.println("배열 첨자가 배열 크기보다 커요");
            System.out.println("에러 메세지 : "+e);
        }
    }
}
