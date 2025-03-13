package kiosklv3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
        List<MenuItem> menuItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Kiosk (){
            menuItems.add(new MenuItem("ShackBuger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
            menuItems.add(new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
            menuItems.add(new MenuItem("Cheesebuger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
            menuItems.add(new MenuItem("Hamburger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));
    }
       void start(){
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
                       System.out.println("선택한 메뉴 : " + menuItems.get(0).getName() + "   | W " + menuItems.get(0).getPrice() + " |   " + menuItems.get(0).getDescription());
                       // menuItem.get(0); 으로만 해서 soutv 했을땐, kiosk_lv2.lv2.MenuItem@52cc8049 와 같이 나왔음. >>  @~~~ 주소를 나타낸다.
                       break;
                   case 2:
                       System.out.println("선택한 메뉴 : " + menuItems.get(1).getName() + "   | W " + menuItems.get(1).getPrice() + " |   " + menuItems.get(1).getDescription());
                       break;
                   case 3:
                       System.out.println("선택한 메뉴 : " + menuItems.get(2).getName() + "   | W " + menuItems.get(2).getPrice() + " |   " + menuItems.get(2).getDescription());
                       break;
                   case 4:
                       System.out.println("선택한 메뉴 : " + menuItems.get(3).getName() + "   | W " + menuItems.get(3).getPrice() + " |   " + menuItems.get(3).getDescription());
                       break;

               }

               if (number == 0){
                   System.out.println("주문을 종료합니다.");
                   break;
               }

           }

       }




    }

