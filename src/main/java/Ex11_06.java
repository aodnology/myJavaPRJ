class car {
    private int price;

    car() {
        System.out.println("난 메모리에 올라갈때 생성된다.");
    }

    car(int num){ // 생성자를 수정하여 사용 할 수 있는 예
        this.price = num ;
        System.out.println("가격 : "+ this.price);
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
public class Ex11_06 {
    public static void main(String[] args) {
        car psh = new car(1000);
        // new 뒤에 클래스 명이 아닌 앞에 있는 클래스의 생성자 함수를 실행시켜 메모리에 올린다
    }   // 기본 생성자 함수는 자바에서는 자동으로 만들어진다.
}
