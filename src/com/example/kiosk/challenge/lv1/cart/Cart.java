package com.example.kiosk.challenge.lv1.cart;


import com.example.kiosk.challenge.lv1.menu.MenuItem;

import java.util.*;


public class Cart {
    private final List<CartItem> items = new ArrayList<>();

    public List<CartItem> getCartItems() {
        return items;
    }

    // 음식 담기
    public void addItem(MenuItem item) {
        for (CartItem cartItem : items) {
            if (cartItem.getItem().getName().equals(item.getName())) {
                cartItem.addQuantity();
                return;
            }
        }

        items.add(new CartItem(item,1));
    }

    // 담은 항목 삭제
    public void removeItem(MenuItem item) {
        CartItem target = null;
        for (CartItem cartItem : items) {
            if (cartItem.getItem().getName().equals(item.getName())) {
                target = cartItem;
                break;
            }
        }

        if (target != null) {
            target.subQuantity();
            if (target.getQuantity() == 0) {
                items.remove(target);
            }
        }
    }

    // 장바구니 전체 총 가격
    public double getTotalPrice() {
        double totalPrice = 0;
        for (CartItem cartItem : items) {
            totalPrice += cartItem.getItemSumPrice();
        }

        return totalPrice;
    }

    // 카트에 들어있는 메뉴, 총 금액 출력
    public void printCart() {
        if  (items.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        System.out.println("[ Orders ]");
        for (CartItem cartItem : items) {
            System.out.println(String.format("%-15s | 수량 : %d | 합계 : W %.1f",
                    cartItem.getItem().getName(), cartItem.getQuantity(),  cartItem.getItemSumPrice()));
        }
        System.out.println("[ Total ]");
        System.out.println(String.format("W %.1f", getTotalPrice()));
    }
}
