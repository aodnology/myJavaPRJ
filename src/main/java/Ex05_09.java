import java.util.Scanner;

public class Ex05_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1~4중에 선택하세요");
        int a = s.nextInt();

        switch(a){
            case 1:
                System.out.printf("1을 선택했다\n");
                break;
            case 2:
                System.out.printf("1을 선택했다\n");
                break;
            case 3:
                System.out.printf("1을 선택했다\n");
                break;
            case 4:
                System.out.printf("1을 선택했다\n");
                break;
            default:
                System.out.printf("이상한걸 선택했다.\n");
        }
    }
}