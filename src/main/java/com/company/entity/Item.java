package com.company.entity;

public class Item {

    private final Long itemId;
    private final String name;
    private final Integer prise;

    public Item(Long itemId, String name, Integer prise) {
        this.itemId = itemId;
        this.name = name;
        this.prise = prise;
    }

    public Long getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public Integer getPrise() {
        return prise;
    }
}
