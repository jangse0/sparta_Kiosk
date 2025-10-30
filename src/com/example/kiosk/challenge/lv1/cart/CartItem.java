package com.example.kiosk.challenge.lv1.cart;

import com.example.kiosk.challenge.lv1.menu.MenuItem;

public class CartItem {
    private final MenuItem item;
    private int quantity;

    public CartItem(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public MenuItem getItem() {
        return item;
    }
    public int getQuantity() {
        return quantity;
    }

    // 수량 더하기
    public void addQuantity() {
        this.quantity++;
    }

    // 수량 빼기
    public void subQuantity() {
        if (this.quantity > 0) {
            this.quantity--;
        }

    }

    // 각 항목 당 최종 가격(가격*수량)
    public double getItemSumPrice() {
        return item.getPrice() * this.quantity;
    }

}
