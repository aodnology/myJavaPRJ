import java.util.Scanner;

public class Codeup_if {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int year = s.nextInt();
        int month = s.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            System.out.println(31);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        } else if ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
            System.out.println(28);
        } else {
            System.out.println(29);
        }
    }
}

