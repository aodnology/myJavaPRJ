public class A_2_4 {
    public static void main(String[] args) {

        /*문자열에서 원하는 데이터를 추출*/

        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";
                                 //0 1 2                     3

        int ip = log.indexOf(" ");
        System.out.println(log.substring(0, ip));

        String time2 = log.substring(log.indexOf("[")+1, log.indexOf(" +"));
        System.out.println("시간 : "+time2);




        // 위 예제 응용
        int ip2 = log.indexOf("44"); /* 문자열을 파악한후 indexOf()메서드를 사용하여 해당 문자열이 끝나는 기준점을 지정한다 */
        System.out.println(log.substring((1-1), (ip2+2))); // 특정 문자열을 추출하는 substring()메서드를 활용하여 원하는 문자열의 을 잡고 추출한다.
                                      //(시작, 끝)
        String[] item = log.split(" ");
        String time = item[3];
        System.out.println(time.length());
        System.out.println("시간 : "+ time.substring(1, time.length()));
    }
}
