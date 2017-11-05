/* This class is the container for all items the IT department holds HD, Wires, .. so on
* Atterbiutes:
*
*
*
* Methods:
*
*
*
* Enums:
*
*
*
* */


package com.company.Item;

import java.util.Date;

public class Item {

    //static variables
    private static int Total_Items;

    //instance atterbites
    private ItemCondition condition;
    private LocationName location;
    private Date date_given;
    private Date date_retrived;
    private String holder;
    private String type;
    private int available_Quantity;

//##############METHODS####################

    //zero_Param_Constructor
    public Item(){

        condition = ItemCondition.NEW;
        location = LocationName.ITLAB;
        holder = "IT";
        available_Quantity = 0;


    }

    //Constructor
    public Item(String type, ItemCondition condition, LocationName location, String holder ){
        // Add to toal available equipment
        this.available_Quantity +=1;

        //Set Instance variables
        this.type = type;
        this.condition = condition;
        this.location = location;
        this.holder = holder;


    }

    // Set & get
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ItemCondition getCondition() {
        return condition;
    }

    public void setCondition(ItemCondition condition) {
        this.condition = condition;
    }

    public LocationName getLocation() {
        return location;
    }

    public void setLocation(LocationName location) {
        this.location = location;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String name_of_holder) {
        this.holder = name_of_holder;
    }

    public Date getDate_given() {
        return date_given;
    }

    public void setDate_given(Date date_given) {
        this.date_given = date_given;
    }

    public Date getDate_retrived() {
        return date_retrived;
    }

    public void setDate_retrived(Date date_retrived) {
        this.date_retrived = date_retrived;
    }

    public int getAvailable_Quantity() {
        return available_Quantity;
    }

    public void setAvailable_Quantity(int available_Quantity) {
        this.available_Quantity = available_Quantity;
    }
}
