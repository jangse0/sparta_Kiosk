package com.example.kiosk.basic.lv4.menu;

import java.util.List;

public class Menu {
    private String category;
    private List<MenuItem> items;

    public Menu(String category, List<MenuItem> items) {
        this.category = category;
        this.items = items;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // 해당하는 메뉴 가져오기
    public List<MenuItem> getItems() {
        return items;
    }


}
