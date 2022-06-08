public class Ex10_02 {
    public static void main(String[] args) {
        int aa[] = new int[3];
        try { // 에러가 발생할것 같은 구문에 사용
            aa[2] = 100 / 0; // 에러 발생시 catch 구문으로 바로 이동
            aa[3] = 100;     // 위 구문에서 error 가 발생하여 실행되지 않음

        } catch (ArrayIndexOutOfBoundsException oops) {
            System.out.println("배열 첨자가 배열 크기보다 큽니다");
            System.out.println("에러 메세지 : "+oops);

        } catch (ArithmeticException oops) {
            System.out.println("0으로 왜 나누세요");
            System.out.println("에러 메세지 : "+oops);

        } finally { // 에러 여부와 상관 없이 무조건 실행 , !반!드!시!실!행!되야 할 구문에 적용
                    // ex) 메모리 비우는 코드
            System.out.println("이 부분은 무조건 나옵니다");
        }
    }
}
