import java.util.Scanner;
public class Ex06_12 {
    public static void main(String[] args) {
        System.out.println("몇단?");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i = 1; i <10; i++){
            System.out.println(a+" X "+i+" = "+(a*i));
        }
    }
}