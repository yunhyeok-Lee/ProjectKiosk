package kiosk.lv1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("[ SHAKESHACK MENU ] ");
            System.out.println("1. ShackBuger   | W 6.9 |  토마토, 양상추, 쉑소스가 토핑된 치즈버거" );
            System.out.println("2. SmokeShack   | W 8.9 |  베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheesebuger  | W 6.9 |  포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger    | W 5.4 |  비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료    | 종료");

            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number){
                case 1:
                    System.out.println("1. ShackBuger   | W 6.9 |  토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    break;
                case 2:
                    System.out.println("2. SmokeShack   | W 8.9 |  베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    break;
                case 3:
                    System.out.println("3. Cheesebuger  | W 6.9 |  포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    break;
                case 4:
                    System.out.println("4. Hamburger    | W 5.4 |  비프패티를 기반으로 야채가 들어간 기본버거 ");
                    break;

            }

            if (number == 0){
                System.out.println("주문을 종료합니다.");
                break;
            }

        }

    }
}
