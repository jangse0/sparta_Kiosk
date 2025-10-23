package com.example.kiosk.basic.lv1;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 메뉴 목록 저장
        List<List<Object>> menuItems = new ArrayList<>();

        menuItems.add(List.of("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(List.of("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(List.of("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(List.of("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);

        int answer = 0;

        while(true){
            System.out.println("[ SHAKESHACK MENU ]");
            for(int i = 0; i < menuItems.size(); i++){
                System.out.print(i+1 + ". ");
                System.out.println(String.format("%-15s | W %.1f | %s", menuItems.get(i).get(0), menuItems.get(i).get(1), menuItems.get(i).get(2)));
            }
            System.out.println("0. 종료      | 종료");
            answer = sc.nextInt();

            if (answer == 0){
                System.out.println("프로그램을 종료합니다."); break;
            }
            else if (answer >= 1 && answer <= menuItems.size()){
                System.out.println(menuItems.get(answer-1).get(0) + "을 선택하셨습니다.\n\n");
            }

        }
    }
}
