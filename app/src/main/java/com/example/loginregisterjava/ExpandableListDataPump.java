package com.example.loginregisterjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();



        List<String> Baked = new ArrayList<String>();
        Baked.add("Bread");
        Baked.add("Cake");
        Baked.add("Stuffed Base");

        List<String> Snacks = new ArrayList<String>();
        Snacks.add("Popcorn");
        Snacks.add("Cakes");
        Snacks.add("Cookies");
        Snacks.add("Biscuits");
        Snacks.add("Crackers");
        Snacks.add("Bhujiya Sev");
        Snacks.add("Namkeen Mixture");
        Snacks.add("Chips");
        Snacks.add("Makhana");

        List<String> Beverages = new ArrayList<String>();
        Beverages.add("Tea Leaves");
        Beverages.add("Green Tea");
        Beverages.add("Tea Bags");
        Beverages.add("Coffee");
        Beverages.add("Soup packets");
        Beverages.add("Juice");
        Beverages.add("Soft drinks");
        Beverages.add("Health Mix");
        Beverages.add("Protein Shake");


        expandableListDetail.put("Baked Goods", Baked);
        expandableListDetail.put("Snack Essentials", Snacks);
        expandableListDetail.put("Beverages", Beverages);


        return expandableListDetail;
    }
}
