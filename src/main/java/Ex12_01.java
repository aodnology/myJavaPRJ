class car1 {
    String color;
    int speed;

    // 엄마 class
    void upSpeed(int value) {
        System.out.println("속도를 올립니다.");
        speed += value;
    }

    void downSpeed(int value) {
        speed -= value;
    }
}

//자식         //부모
class sedan extends car1 {

    int seatNum;

    public int getSeatNum() {
        return seatNum;
    }
}

class truck extends car1 {

    int capacity;

    public int getCapacity() {
        return capacity;
    }
}


public class Ex12_01 {
    public static void main(String[] args) {

        sedan sedan1 = new sedan();
        truck truck1 = new truck();

        sedan1.upSpeed(300);
        truck1.upSpeed(100);

        sedan1.seatNum = 5;
        truck1.capacity = 50;

        System.out.println("승용차의 속도는" + sedan1.speed + "km, 좌석수는" + sedan1.seatNum);
        System.out.println("승용차의 속도는" + truck1.speed + "km, 좌석수는" + truck1.capacity);
    }
}

//447 수상 클래스 override