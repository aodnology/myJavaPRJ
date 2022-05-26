public class Ex09_10 {
    public static void main(String[] args) {
        /*
        public static int sum ( int i1, int i2 )

        무조건 암기

        public(접근 지정자) : 모든 자바 클래스에서 함수를 만들어 사용할수 있게끔함
        static(자동으로 메모리에 올라감, 메모리에 데이터를 올리지 않아도 될때 안써도됨) : 자바는 메모리에 객체를 올려야 사용이 가능한데, 함수 단위로 메모리를 올려 사용할때 사용. 메모리에 올리고 싶을때에 무조건 써야됌
        int(반환타입) sum(매서드 이름(함수명의 sum)) : sum(맘대로써도됨)이라는 함수가 실행되고 데이터 타입이 int 라는 의미 void가 아니면 return이 존재
        ( int i1, int i2 ) : 함수를 사용 할 때 필요한 파라미터
         */
        int i = 1, j = 10;

        int k = sum(i, j);
        System.out.println("k : " + k);

        int m = sum(10, 11);
        System.out.println("m : " + m);
    }
    // 함수에 함수 안들어감
    public static int sum(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++)
            sum += i;

        return sum;
    }
}

