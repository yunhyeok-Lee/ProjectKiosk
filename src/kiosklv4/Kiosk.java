package kiosklv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> menuItems = new ArrayList<>();
    List<String> menuCategory = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();


    void start() {
        while (true) {
            System.out.println(" ");
            System.out.println("[ MAIN MENU ]");
            List<String> category = menu.getMenuCategory();
            for (int i = 0; i < category.size(); i++) {
                System.out.println((i + 1) + ". " + category.get(i));
            }
            int number1 = scanner.nextInt();
            scanner.nextLine();

            if (number1 == 1) {
                System.out.println(" ");
                System.out.println("[ BURGERS MENU ]");
                List<MenuItem> burgers = menu.getMenuItems();
                for (int i = 0; i < burgers.size(); i++) {
                    System.out.println((i + 1) + ". " + burgers.get(i).getName() + "   | W " + burgers.get(i).getPrice() + " |   " + burgers.get(i).getDescription());
                }
                System.out.println("0. 종료    | 종료");


                int number2 =scanner.nextInt();
                scanner.nextLine();

                switch (number2) {
                    case 1:
                        System.out.println("선택한 메뉴 : " + burgers.get(0).getName() + "   | W " + burgers.get(0).getPrice() + " |   " + burgers.get(0).getDescription());
                        // menuItem.get(0); 으로만 해서 soutv 했을땐, kiosk_lv2.lv2.MenuItem@52cc8049 와 같이 나왔음. >>  @~~~ 주소를 나타낸다.
                        break;
                    case 2:
                        System.out.println("선택한 메뉴 : " + burgers.get(1).getName() + "   | W " + burgers.get(1).getPrice() + " |   " + burgers.get(1).getDescription());
                        break;
                    case 3:
                        System.out.println("선택한 메뉴 : " + burgers.get(2).getName() + "   | W " + burgers.get(2).getPrice() + " |   " + burgers.get(2).getDescription());
                        break;
                    case 4:
                        System.out.println("선택한 메뉴 : " + burgers.get(3).getName() + "   | W " + burgers.get(3).getPrice() + " |   " + burgers.get(3).getDescription());
                        break;

                }
                if (number2 == 0) {
                    System.out.println("주문을 종료합니다.");
                    break;
                }
            }

        }
    }
}



