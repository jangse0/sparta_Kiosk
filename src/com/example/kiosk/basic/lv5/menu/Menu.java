package com.example.kiosk.basic.lv5.menu;

import java.util.*;

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

    public List<MenuItem> getItems() {
        return items;
    }

}
