package com.example.kiosk.challenge.lv1.kiosk;

import com.example.kiosk.challenge.lv1.cart.Cart;
import com.example.kiosk.challenge.lv1.menu.Menu;
import com.example.kiosk.challenge.lv1.menu.MenuItem;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;
    private final Cart cart = new Cart();
    Scanner sc = new Scanner(System.in);

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    private void printMainMenu() {
        System.out.println("[ MAIN MENU ]");
        int i = 0;
        for (Menu menu : menus) {
            i++;
            System.out.print(i + ":");
            System.out.println(menu.getCategory());
        }
        System.out.println("0. 종료          | 종료");

        //카트에 메뉴가 들어 있으면 출력
        if(!cart.getCartItems().isEmpty()) {
            System.out.println("\n[ ORDER MENU ]");
            System.out.println(String.format("%d. Orders     | 장바구니를 확인 후 주문합니다.", menus.size()+1));
            System.out.println(String.format("%d. Cancel     | 진행중인 주문을 취소합니다.", menus.size()+2));
        }


    }

    public void start() {
        while (true) {
            printMainMenu();

            int mainChoice;
            try{
                mainChoice = sc.nextInt();
            } catch(InputMismatchException e){
                System.out.println("유효한 메뉴 번호를 입력해주세요.\n");
                continue;
            }

            try {
                if  (mainChoice == 0) {
                    System.out.println("종료합니다.");
                    break;
                }

                if (mainChoice == (menus.size()+1) || mainChoice == (menus.size()+2)) {
                    if(cart.getCartItems().isEmpty()) {
                        throw new IllegalStateException("장바구니가 비어 있습니다.");
                    }

                    if (mainChoice == (menus.size()+1)) {
                        handleOrder();
                    }
                    else {
                        handleCancel();
                    }

                    continue;


                }

                if (mainChoice<0 || mainChoice > menus.size()) {
                    System.out.println("올바른 번호를 입력해주세요.\n");
                    continue;
                }

                Menu selectedMenu = menus.get(mainChoice-1);
                handleCategory(selectedMenu);
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    private void handleOrder() {

    }

    private void handleCancel(){

    }

    private void handleCategory(Menu menu) {
        while (true) {
            printCategoryMenu(menu);

            int choice;

            try {
                choice = sc.nextInt();
            } catch(InputMismatchException e){
                System.out.println("유효한 번호를 입력해주세요.");
                continue;
            }

            try {
                if (choice == 0) {
                    System.out.println();
                    break;
                }

                List<MenuItem> items = menu.getItems();
                if (choice < 0 || choice > items.size()) {
                    throw new IllegalArgumentException("올바른 번호를 입력해주세요.\n");
                }

                MenuItem selectedItem = items.get(choice - 1);
                printSelectedItem(selectedItem);
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인     2. 취소");

                int answer;
                try {
                    answer = sc.nextInt();
                }
                catch(InputMismatchException e){
                    System.out.println("정수를 입력해주세요.\n");
                    continue;
                }

                if (answer == 1) {
                    cart.addItem(selectedItem);
                    System.out.println();
                    System.out.println(selectedItem.getName() + " 이 장바구니에 추가되었습니다.");
                }
                else if (answer == 2) {
                    System.out.println("취소");

                }
                else {
                    throw new IllegalStateException("올바른 번호를 입력하세요.");
                }
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
    }

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

    private void printSelectedItem(MenuItem item) {
        System.out.println(String.format("선택한 메뉴 : %-15s | W %.1f | %s",
                item.getName(), item.getPrice(), item.getDescription()));
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
