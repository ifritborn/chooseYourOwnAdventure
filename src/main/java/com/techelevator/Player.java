package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Player {


    private List<String> items = new ArrayList<>();

    public boolean hasItem(String item) {
        return items.contains(item);
    }

    public void addItem(String item) {
        items.add(item);
    }
}
