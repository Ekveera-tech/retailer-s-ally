package com.example.loginregisterjava;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPumpBack {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Dairy = new ArrayList<String>();
        Dairy.add("Milk");
        Dairy.add("Yogurt");
        Dairy.add("Paneer");
        Dairy.add("Cheese Block");
        Dairy.add("Butter");
        Dairy.add(" Cheese Slices");
        Dairy.add("Cream");
        Dairy.add("Ice Cream");

        List<String> Freezer = new ArrayList<String>();
        Freezer.add("Peas");
        Freezer.add("Corn");
        Freezer.add("Mix Veg");
        Freezer.add("Dips");
        Freezer.add("Avocado Oil Coconut Milk");
        Freezer.add("Groundnut Oil Frozen Snacks (V/NV)");

        List<String> Meats = new ArrayList<String>();
        Meats.add("Chicken");
        Meats.add("Mutton");
        Meats.add("Fish");
        Meats.add("Prawns");
        Meats.add("Clams");
        Meats.add("Lobster");
        Meats.add("Turkey");
        Meats.add("Sliced Meat");
        Meats.add("Pork");
        Meats.add("Eggs");

        List<String> F_W = new ArrayList<String>();
        F_W.add("Oranges");
        F_W.add("Papaya");
        F_W.add("Mango");
        F_W.add("Apricots");
        F_W.add("Pumpkin");
        F_W.add("Pineapples");
        F_W.add("Butter");
        F_W.add("Pineapples");
        F_W.add("Grapefruit");
        F_W.add("Yellow Pears");
        F_W.add("Apples");
        F_W.add("Brinjal");
        F_W.add("Buttergourd");
        F_W.add("Potato");
        F_W.add("Tomato");
        F_W.add("LadyFinger");
        F_W.add("Ginger");
        F_W.add("Onion");
        F_W.add("Cucumber");

        expandableListDetail.put("Dairy", Dairy);
        expandableListDetail.put("Freezer", Freezer);
        expandableListDetail.put("Meats and Sea Food",Meats);
        expandableListDetail.put("Fruits/ Vegetables",F_W);
        return expandableListDetail;
    }
}
