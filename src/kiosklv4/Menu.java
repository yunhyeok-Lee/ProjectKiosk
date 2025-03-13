package kiosklv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<MenuItem> menuItems;
    List<String> menuCategory;
    Scanner scanner = new Scanner(System.in);

    Menu() {
        menuItems = new ArrayList<>(); // menuItem 리스트를 초기화 시킨다.  (초기화 하지않고 실행 했더니 오류가 발생)
        menuItems.add(new MenuItem("ShackBuger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheesebuger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        menuCategory = new ArrayList<>(); // menuCategory 리스트를 초기화 시킨다.
        menuCategory.add("Burgers");
        menuCategory.add("Drinks");
        menuCategory.add("Desserts");
    }

    List<MenuItem> getMenuItems(){
        return this.menuItems;
    }
    List<String> getMenuCategory(){
        return this.menuCategory;
    }





}















    


