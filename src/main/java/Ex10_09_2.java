import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex10_09_2 {
    public static void main(String[] args) throws IOException {
        // 한국어 표현 방법
        // 개념만 알고 있자

        FileInputStream fis = new FileInputStream("/temp/data2.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        int ch; // 글자 한글자 한글자 값을 가져오기 위한 변수 ascii code

        while ((ch = isr.read()) != -1)
            // -1의 의미 : FileInputStream은 모든 값을 다 읽었을때 -1을 뱉어냄 (신호를 보냄)
            System.out.print((char) ch); // 한글자 한글자 뱉어냄

        fis.close(); // 파일을 열고 닫는 동작을 무조건 해야되는데 이 코드로 닫아줌
    }
}
