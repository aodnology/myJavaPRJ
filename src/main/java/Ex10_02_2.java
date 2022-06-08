public class Ex10_02_2 {

    public static void main(String[] args) {
        int aa[] = new int[3];

        try { // 에러가 발생할것 같은 구문에 사용
            aa[2] = 100 / 0; // 에러 발생시 catch 구문으로 바로 이동
            aa[3] = 100;     // 위 구문에서 error 가 발생하여 실행되지 않음

        } catch (Exception oops) { // catch의 조상님

            // catch의 끝판왕 , 자바에서 발생하는 모든 에러를 잡을 수 있는 구문
            // catch 사용시 마지막에 무조건 사용
            // 사용시 무조건 마지막에 작성 해야함.
            // catch 는 순서대로 실행 되기 때문에 에러를 찾아내는 범위가 큰 Exception 을 가장 밑에 사용 해야한다.

            System.out.println("배열 첨자가 배열 크기보다 큽니다");
            System.out.println("에러 메세지 : " + oops);

        } finally {
            // 에러 여부와 상관 없이 무조건 실행 , !반!드!시!실!행!되야 할 구문에 적용
            // ex) 메모리 비우는 코드
            System.out.println("이 부분은 무조건 나옵니다");
        }
    }
}

