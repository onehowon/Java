package Car;

//아래의 요구사항을 만족시키는 Car 클래스를 구현하시오
//
//요구사항
//Car 클래스는 다음과 같은 정보를 갖는다.
//이름
//배기량
//크기
//Car 클래스는 다음과 같은 기능을 할 수 있다.
//가속하기
//기어변경
//경적울리기

public class CarStructure {
    String carname;
    int speed;
    int gasAmount;
    String Size;
    String gear;
    String honk;

    public void speedUp(int speed){
        this.speed += speed;
    }

    public void speedDown(int speed){
        this.speed -= speed;
    }

    public void gearDrive(String gear){
        this.gear = "D";
    }

    public void gearReturn(String gear){
        this.gear = "R";
    }

    public void usingHonk(String honk){
        System.out.println("baaaaaaaaang");
    }

    public static void main(String[] args) {
        CarStructure c1 = new CarStructure();
        c1.carname = "소나타";
        c1.gasAmount = 500;
        c1.Size = "중형";
        c1.speedUp(30);
        c1.speedDown(20);
        c1.gearDrive("D");

        System.out.println(c1.carname + c1.gasAmount);
    }
}
