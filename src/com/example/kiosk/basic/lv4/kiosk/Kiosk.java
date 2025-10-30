package com.example.kiosk.basic.lv4.kiosk;

import com.example.kiosk.basic.lv4.menu.Menu;
import com.example.kiosk.basic.lv4.menu.MenuItem;

import java.util.*;

public class Kiosk {
    private List<Menu> menus;
    Scanner sc = new Scanner(System.in);

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    private void printMainMenu() {
        int i = 0;
        for (Menu menu : menus) {
            i++;
            System.out.print(i + ":");
            System.out.println(menu.getCategory());
        }
        System.out.println("0. 종료           | 종료");
    }

    public void start() {
        while (true) {
            printMainMenu();

            int mainChoice = sc.nextInt();

            if  (mainChoice == 0) {
                System.out.println("종료합니다.");
                break;
            }

            if (mainChoice<0 || mainChoice > menus.size()) {
                System.out.println("올바른 번호를 입력해주세요.\n");
                continue;
            }

            Menu selectedMenu = menus.get(mainChoice-1);
            handleCategory(selectedMenu);
        }
    }

    // 카테고리 선택 후 제어
    private void handleCategory(Menu menu) {
        while (true) {
            printCategoryMenu(menu);

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println();
                break;
            }

            List<MenuItem> items = menu.getItems();
            if (choice < 0 || choice > items.size()) {
                System.out.println("올바른 번호를 입력해주세요.\n");
                continue;
            }

            MenuItem selectedItem = items.get(choice - 1);
            printSelectedItem(selectedItem);
            System.out.println();

        }
    }


    //출력 예시에 맞추어 출력
    private void printCategoryMenu(Menu menu) {
        System.out.println("[ " + menu.getCategory().toUpperCase() + " MENU ]");
        List<MenuItem> items = menu.getItems();

        for( int i  = 0; i < items.size(); i++ ) {
            MenuItem item = items.get(i);

            System.out.println(String.format("%d. %-15s | W %.1f | %s", i+1,
                    item.getName(), item.getPrice(), item.getDescription()));
        }
        System.out.println("0. 뒤로가기");
    }

    //선택한 메뉴 출력
    private void printSelectedItem(MenuItem item) {
        System.out.println(String.format("선택한 메뉴 : %-15s | W %.1f | %s",
                item.getName(), item.getPrice(), item.getDescription()));
    }

    // Getter
    public List<Menu> getMenus() {
        return menus;
    }


    //Setter
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
