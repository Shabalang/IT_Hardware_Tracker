package com.company.Item;

public enum ItemCondition {

    NEW("New"), USED("Used"), UNUSABLE("Un-Usable");

    private String name;

    ItemCondition(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
