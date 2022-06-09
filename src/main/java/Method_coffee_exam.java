import java.util.Scanner;

public class Method_coffee_exam {
    public static void main(String[] args) {

        Method_coffee x = new Method_coffee();
        System.out.printf("1. 보통커피 , 2. 설탕커피 , 3. 블랙커피 , 4. 랜덤커피(환불 불가) , 5~99. ???(환불 불가) : ");
        Scanner s = new Scanner(System.in);
        int coffee = s.nextInt();
        int result = x.coffee_machine(coffee);
    }
}