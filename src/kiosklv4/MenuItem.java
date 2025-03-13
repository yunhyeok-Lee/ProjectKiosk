package kiosklv4;

public class MenuItem {
    // 속성
    public String name;
    public double price;
    public String description;

    // 생성자
    MenuItem(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 메서드
    String getName(){
        return this.name;   // 이전에 getName으로 구현하고 오류가남! main 클래스에서 무한 반복이 발생 >> getName , name 부분을 반복
    }
    double getPrice(){
        return this.price;
    }
    String getDescription(){
        return this.description;
    }
}
