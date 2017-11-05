package com.company.Item;

public enum LocationName {

    WAREHOUSE("Warehouse"), ITLAB("IT Lab");

    private String name;

    LocationName(String Name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
