package com.example.loginregisterjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPumpPerimeter {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Sweetners = new ArrayList<String>();
        Sweetners.add("Sugar");
        Sweetners.add("Cane Sugar");
        Sweetners.add("Brown Sugar");
        Sweetners.add("Jaggery");
        Sweetners.add("Honey");
        Sweetners.add("Stevia");
        Sweetners.add("Sugar Free");

        List<String> Mandir = new ArrayList<String>();
        Mandir.add("Camphor");
        Mandir.add("Candles");
        Mandir.add("Cotton Baati");
        Mandir.add("Match Sticks");
        Mandir.add("Incense Sticks");
        Mandir.add("Oil");
        Mandir.add("Ghee");

        List<String> Toiletries = new ArrayList<String>();
        Toiletries.add("Shampoo");
        Toiletries.add("Conditioner");
        Toiletries.add("Toothpaste");
        Toiletries.add("Tooth Brush");
        Toiletries.add("Dental Floss");
        Toiletries.add("Mouthwash");
        Toiletries.add("Hand Wash");
        Toiletries.add("Hand Sanitizer");

        List<String> Cleaners = new ArrayList<String>();
        Cleaners.add("Dettol");
        Cleaners.add("Cloth Washing Bar");
        Cleaners.add("Bleach");
        Cleaners.add("Detergent Powder");
        Cleaners.add("Fabric Softener");
        Cleaners.add("Drier Sheets");
        Cleaners.add("Dishwashing Liquid");
        Cleaners.add("Face Wash");
        Cleaners.add("Dish Soap");

        List<String> Household = new ArrayList<String>();
        Household.add("Mosquito Repellent");
        Household.add("Room Freshner");
        Household.add("Toilet Roll");
        Household.add("Kitchen Roll");
        Household.add("Batteries");
        Household.add("Band Aids");
        Household.add("Dettol");
        Household.add("Garbage Bags");
        Household.add("Foil");
        Household.add("Cling Wrap");

        expandableListDetail.put("Sweetners", Sweetners);
        expandableListDetail.put("Mandir Essentials", Mandir);
        expandableListDetail.put("Toiletries", Toiletries);
        expandableListDetail.put( "Cleaners", Cleaners);
        expandableListDetail.put("Household essentials", Household);

        return expandableListDetail;
    }
}

