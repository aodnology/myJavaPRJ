public class Methodexam {
    public static void main(String[] args) {

        Methodexam x = new Methodexam(); // 클래스 생성

        x.Strexam("this ","is ","void method");                           //Strexam
        System.out.println(x.Strsooho("this ","is ","return method"));    //Strsooho
    }
    public void Strexam(String a, String b, String c){
  //public : 접근 제한자 , void : 실행형 메소드

        String result = a + b + c;
        System.out.println(result);
    }

    public String Strsooho (String a, String b, String c){ // return 메소드
        String result = a + b + c;
        return result;
    }
}
