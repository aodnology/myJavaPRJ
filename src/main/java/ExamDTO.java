import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExamDTO {
    // 남이 사용 할 수 없는 변수를 사용할 수 있게 만드는 방법
    private String test;
    private int score;

/*
    // alt + insert
    // Getter and Setter

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
        // this ( class == ExamDTO ). test
        // this를 작성하지 않으면 test가 어떤 test인지 알수 없다
        // test가 어떤 위치의 test인지 명확히 하기 위한 코드
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
 */
}
