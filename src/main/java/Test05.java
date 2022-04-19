import java.util.Scanner;
public class Test05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        if (b % 2 == 0) {
            System.out.println("짝");
        }else{
            System.out.println("홀");
        }
    }
}
