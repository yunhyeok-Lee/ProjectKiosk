package kiosklv5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        List<MenuItem> menuItems = new ArrayList<>();
        Kiosk kiosk = new Kiosk();
        kiosk.start();
   }
}
