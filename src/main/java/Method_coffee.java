import java.util.Random;
import java.util.Scanner;

public class Method_coffee {
    static int coffee_machine(int button) {

        System.out.println("1. 뜨거운 물 준비한다");
        System.out.println("2. 종이컵 준비한다");

        if (button > 3) {
            Random randNum = new Random();
            button = randNum.nextInt(2) + 1;
            System.out.println("과연 ?? : "+button);
        }
        switch (button) {
            case 1:
                System.out.println("3. 보통커피");
                break;
            case 2:
                System.out.println("3. 설탕커피");
                break;
            case 3:
                System.out.println("3. 블랙커피");
                break;
        }

        System.out.println("4. 물 붓는다");
        System.out.println("5. 저어서 녹이는 중");

        return 0;
    }
    public static void main(String[] args) {

        System.out.printf("1. 보통커피 , 2. 설탕커피 , 3. 블랙커피 , 4. 랜덤커피(환불 불가) , 5~99. ???(환불 불가) : ");
        Scanner s = new Scanner(System.in);
        int coffee = s.nextInt();
        coffee_machine(coffee);
    }
}