package kiosklv5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuItem> menuItems;
    private List<String> menuCategory;
    private List<MenuItem> drinkMenu = new ArrayList<>();
    private List<MenuItem> dessertsMenu = new ArrayList<>();

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

        drinkMenu = new ArrayList<>();
        drinkMenu.add(new MenuItem("Coke", 1.5,"콜라"));
        drinkMenu.add(new MenuItem("Sprite", 1.5, "스프라이트"));
        drinkMenu.add(new MenuItem("Fanta",1.5,"환타"));
        drinkMenu.add(new MenuItem("MountainDew",1.5,"마운틴듀"));

        dessertsMenu = new ArrayList<>();
        dessertsMenu.add(new MenuItem("IceCream",2.0,"소프트콘"));
        dessertsMenu.add(new MenuItem("OnionRing",3.0,"달달한 어니언링(5개입)"));
        dessertsMenu.add(new MenuItem("Cookie",3.0,"촉촉한 쿠키(5개입)"));
        dessertsMenu.add(new MenuItem("ChickenNugget",4.0,"바삭한 치킨너겟(6개입)"));




    }

    List<MenuItem> getMenuItems(){
        return this.menuItems;
    }
    List<String> getMenuCategory(){
        return this.menuCategory;
    }
    List<MenuItem> getDessertsMenu(){
        return this.dessertsMenu;
    }
    List<MenuItem> getDrinkMenu(){
        return this.drinkMenu;
    }





}















    


