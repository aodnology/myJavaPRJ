import java.util.Scanner;

public class Ex09_11 {
    static int coffee_machine(int button) {
        System.out.println("1. 뜨거운 물을 준비");
        System.out.println("2. 종이컵을 준비");

        switch (button) {
            case 1:
                System.out.println("보통 커피를 탄다");
                break;
            case 2:
                System.out.println("설탕 커피를 탄다");
                break;
            case 3:
                System.out.println("블랙 커피를 탄다");
                break;
            case 4:
                System.out.println("아무거나 탄다");
                break;
        }
        System.out.println("물을 붓는다");
        System.out.println("보통커피를 탄다");

        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ret;

        System.out.printf("어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙) ");
        int coffee = s.nextInt();

        ret = coffee_machine(coffee);

        System.out.printf("손님~ 커피 여기 있습니다.");
    }
}

