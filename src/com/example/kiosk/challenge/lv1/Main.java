package com.example.kiosk.challenge.lv1;

import com.example.kiosk.challenge.lv1.kiosk.Kiosk;
import com.example.kiosk.challenge.lv1.menu.Menu;
import com.example.kiosk.challenge.lv1.menu.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<MenuItem> burgerItems = Arrays.asList(
                new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        );

        Menu burgerMenu = new Menu("Burgers", burgerItems);

        List<MenuItem> drinkItems = Arrays.asList(); // 음료 카테고리에 메뉴가 없는 경우
        Menu drinkMenu = new Menu("Drinks", drinkItems);

        List<MenuItem> dessertItems = Arrays.asList(); // 디저트 카테고리에 메뉴가 없는 경우
        Menu dessertMenu = new Menu("Desserts", dessertItems);

        List<Menu> menus= new ArrayList<>();

        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(dessertMenu);

        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();


    }

}
