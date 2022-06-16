public class A_2_5 {
    public static void main(String[] args) {
        String str = " 박수호 P A R K soo ho ";

        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replaceAll(" ", ""));

        String strAry[] = str.split(" ");
        for (int i = 0; i < strAry.length; i++) {
            System.out.println(i + " : " + strAry[i]);
        }
    }
}
