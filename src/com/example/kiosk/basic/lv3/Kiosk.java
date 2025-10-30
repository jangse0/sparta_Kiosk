package com.example.kiosk.basic.lv3;

import java.util.*;

public class Kiosk {
    private final List<MenuItem> menuItems;
    Scanner scanner = new Scanner(System.in);

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    private void printMenu() {
        System.out.println("[ SHAKESHACK MENU ]");
        for(int i = 0; i < menuItems.size(); i++){
            System.out.print(i+1 + ". ");
            System.out.println(String.format("%-15s | W %.1f | %s", menuItems.get(i).getName(), menuItems.get(i).getPrice(), menuItems.get(i).getDescription()));
        }
        System.out.println("0. 종료      | 종료");

    }

    private void printSelectedItem(MenuItem menuItem) {
        System.out.println(String.format("%-15s | W %.1f | %s", menuItem.getName(), menuItem.getPrice(), menuItem.getDescription()));
    }

    // 키오스크 시작
    public void start() {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("종료합니다.");
                break;
            }

            if  (choice < 0 || choice > menuItems.size()) {
                System.out.println("올바른 메뉴 번호를 입력해주세요");
                continue;
            }

            MenuItem choiceItem = menuItems.get(choice - 1);
            printSelectedItem(choiceItem);
        }
    }

}
