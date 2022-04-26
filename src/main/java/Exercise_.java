import java.util.Scanner;
public class Exercise_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mun = 100;
        int hap = 0;
        for(int a = 1; a<mun+1; a++){
            if ((a % 3 == 0)||(a % 5 ==0)){
                hap += a;
            }
        }
        }
    }

