public class test06 {
    public static void main(String[] args) {

        int hap = 0;

        for (int a = 0; a <101; a++){
            if((a % 3 == 0)||(a % 5 == 0)){
                hap += a;
            }
        }
        System.out.println("0~100 3과5의 배수의 총합은? : "+hap);
    }
}