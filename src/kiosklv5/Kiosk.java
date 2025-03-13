package kiosklv5;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //    List<MenuItem> menuItems = new ArrayList<>();
//    List<String> menuCategory = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();


    void start() {
        while (true) {
            List<MenuItem> burgers = menu.getMenuItems();
            List<MenuItem> drinks = menu.getDrinkMenu();
            List<MenuItem> desserts = menu.getDessertsMenu();

            System.out.println(" ");
            System.out.println("[ MAIN MENU ]");
            List<String> category = menu.getMenuCategory();
            for (int i = 0; i < category.size(); i++) {
                System.out.println((i + 1) + ". " + category.get(i));
            }
            System.out.println("0. 종료    | 종료");
            int number = scanner.nextInt();
            scanner.nextLine();

            if (number == 1) {
                System.out.println(" ");
                System.out.println("[ BURGERS MENU ]");
                for (int i = 0; i < burgers.size(); i++) {
                    System.out.println((i + 1) + ". " + burgers.get(i).getName() + "   | W " + burgers.get(i).getPrice() + " |   " + burgers.get(i).getDescription());
                }
                System.out.println("0. 뒤로가기");

                int menuNumber = scanner.nextInt();
                scanner.nextLine();

                if (menuNumber >= 1 && menuNumber <= burgers.size()) {
//                    MenuItem selectBurger = burgers.get(menuNumber - 1);
                    System.out.println("선택한 메뉴 : " + burgers.get(menuNumber - 1).getName() + "   | W " + burgers.get(menuNumber - 1).getPrice() + " |   " + burgers.get(menuNumber - 1).getDescription());
                }


            } else if (number == 2) {
                System.out.println(" ");
                System.out.println("[ DRINK MENU ]");
                for (int i = 0; i < drinks.size(); i++) {
                    System.out.println((i + 1) + ". " + drinks.get(i).getName() + "   | W " + drinks.get(i).getPrice() + " |   " + drinks.get(i).getDescription());
                }
                System.out.println("0. 뒤로가기");

                int menuNumber = scanner.nextInt();
                scanner.nextLine();

                if (menuNumber >= 1 && menuNumber <= drinks.size()) {
//                    MenuItem selectDrink = drinks.get(menuNumber - 1);
                    System.out.println("선택한 메뉴 : " + drinks.get(menuNumber - 1).getName() + "   | W " + drinks.get(menuNumber - 1).getPrice() + " |   " + drinks.get(menuNumber - 1).getDescription());
                }

            } else if (number == 3) {
                System.out.println(" ");
                System.out.println("[ DESSERT MENU ]");
                for (int i = 0; i < desserts.size(); i++) {
                    System.out.println((i + 1) + ". " + desserts.get(i).getName() + "   | W " + desserts.get(i).getPrice() + " |   " + desserts.get(i).getDescription());
                }
                System.out.println("0. 뒤로가기");

                int menuNumber = scanner.nextInt();
                scanner.nextLine();

                if (menuNumber >= 1 && menuNumber <= desserts.size()) {
//                    MenuItem selectDessert = desserts.get(menuNumber - 1);
                    System.out.println("선택한 메뉴 : " + desserts.get(menuNumber -1).getName() + "   | W " + desserts.get(menuNumber -1).getPrice() + " |   " + desserts.get(menuNumber -1).getDescription());
                }
            }
            if (number == 0) {
                System.out.println("주문을 종료합니다.");
                break;
            }

//            int menuNumber = scanner.nextInt();
//            scanner.nextLine();
//            if (menuNumber >=1 && menuNumber <= burgers.size()){
//                MenuItem selectBurger = burgers.get(menuNumber -1);
//                System.out.println("선택한 메뉴 : " + burgers.get(menuNumber -1).getName() + "   | W " + burgers.get(menuNumber -1).getName() + " |   " + burgers.get(menuNumber -1).getName());
            }

//            if (menuNumber >=1 && menuNumber <= drinks.size()){
//                MenuItem selectDrink = drinks.get(menuNumber -1);
//                System.out.println("선택한 메뉴 : " + drinks.get(menuNumber -1).getName() + "   | W " + drinks.get(menuNumber -1).getName() + " |   " + drinks.get(menuNumber -1).getName());
//            }
//
//            if (menuNumber >=1 && menuNumber <= desserts.size()){
//                MenuItem selectDessert = desserts.get(menuNumber -1);
//                System.out.println("선택한 메뉴 : " + selectDessert.getName() + "   | W " + selectDessert.getPrice() + " |   " + selectDessert.getDescription());
//            }

//             if (menuNumber == 0){
//                System.out.println("주문을 종료합니다.");
//                break;
            }

        }




//
//                if (){
//                    List<MenuItem> burgers = menu.getMenuItems()
//                }
//
//
//                if(number1 == 2){
//                    System.out.println(" ");
//                    System.out.println("[ DRINKS MENU ]" );
//                    List<MenuItem> drinks =menu.getDrinkMenu();
//                    for()
//                }
//                int number2 =scanner.nextInt();
//                scanner.nextLine();
//
//                switch (number2) {
//                    case 1:
//                        System.out.println("선택한 메뉴 : " + burgers.get(0).getName() + "   | W " + burgers.get(0).getPrice() + " |   " + burgers.get(0).getDescription());
//                        // menuItem.get(0); 으로만 해서 soutv 했을땐, kiosk_lv2.lv2.MenuItem@52cc8049 와 같이 나왔음. >>  @~~~ 주소를 나타낸다.
//                        break;
//                    case 2:
//                        System.out.println("선택한 메뉴 : " + burgers.get(1).getName() + "   | W " + burgers.get(1).getPrice() + " |   " + burgers.get(1).getDescription());
//                        break;
//                    case 3:
//                        System.out.println("선택한 메뉴 : " + burgers.get(2).getName() + "   | W " + burgers.get(2).getPrice() + " |   " + burgers.get(2).getDescription());
//                        break;
//                    case 4:
//                        System.out.println("선택한 메뉴 : " + burgers.get(3).getName() + "   | W " + burgers.get(3).getPrice() + " |   " + burgers.get(3).getDescription());
//                        break;
//
//                }
//                if (number2 == 0) {
//                    System.out.println("주문을 종료합니다.");
//                    break;
//                }
//            }
//
//        }



