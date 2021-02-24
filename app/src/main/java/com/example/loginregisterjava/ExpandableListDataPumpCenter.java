package com.example.loginregisterjava;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPumpCenter {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();
        List<String> Grains = new ArrayList<String>();
        Grains.add("White rice");
        Grains.add("Brown rice");
        Grains.add("Basmati rice ");
        Grains.add("Idli/dosa rice ");
        Grains.add("Dalia");
        Grains.add("Atta");
        Grains.add("Maida");
        Grains.add("Besan");
        Grains.add("Rice flour");
        Grains.add("Ragi flour");
        Grains.add("Multi Millet flour");

        List<String> Dal = new ArrayList<String>();
        Dal.add("Arhar/ Tur Dal ");
        Dal.add("Moong Dal");
        Dal.add("Whole Moong Dal");
        Dal.add("Masoor Dal");
        Dal.add("Urad Dal Whole");
        Dal.add("Urad Dal Split");
        Dal.add("Bengal Gram");
        Dal.add("Chole");
        Dal.add("Rajma");

        List<String> CookingOil = new ArrayList<String>();
        CookingOil.add("Refined Oil");
        CookingOil.add("Mustard Oil");
        CookingOil.add("Olive Oil");
        CookingOil.add("White Butter");
        CookingOil.add("Sesame oil");
        CookingOil.add("Groundnut oil");
        CookingOil.add("Avocado oil");


        List<String> Breakfast = new ArrayList<String>();
        Breakfast.add("Sooji");
        Breakfast.add("Rawa");
        Breakfast.add("Poha");
        Breakfast.add("Bread");
        Breakfast.add("Cornflakes");
        Breakfast.add("Muesli");
        Breakfast.add("Oats");
        Breakfast.add("Vermicelli");
        Breakfast.add("Sabudana");

        List<String> Nuts = new ArrayList<String>();
        Nuts.add("Badam");
        Nuts.add("Peanuts");
        Nuts.add("Raisins");
        Nuts.add("Dates");
        Nuts.add("Cashew");
        Nuts.add("Walnuts");
        Nuts.add("Pistachios");
        Nuts.add("Dried Berries");
        Nuts.add("Coconut");

        List<String> WholeSpices = new ArrayList<String>();
        WholeSpices.add("Bay Leaf");
        WholeSpices.add("Black Pepper");
        WholeSpices.add("Cinnamon");
        WholeSpices.add("Elaichi/Cardamom");
        WholeSpices.add("Laung/Clove");
        WholeSpices.add("Nutmeg");
        WholeSpices.add("Mace");

        List<String> Powdered = new ArrayList<String>();
        Powdered.add("Garam masala");
        Powdered.add("Salt");
        Powdered.add("Hing");
        Powdered.add("Turmeric");
        Powdered.add("Red Chilli");
        Powdered.add("Kashmiri Red Chilli");
        Powdered.add("Jeera Powder");
        Powdered.add("Dry jinjar");

        List<String> Condiments = new ArrayList<String>();
        Condiments.add("Tomato Ketchup");
        Condiments.add("Chilli Sauce");
        Condiments.add("Soy Sauce");
        Condiments.add("Pasta Sauce");
        Condiments.add("Sriracha");
        Condiments.add("Mustard Sauce");
        Condiments.add("Jam");
        Condiments.add("Condense Milk");

        List<String> Accompaniments = new ArrayList<String>();
        Accompaniments.add("Pickle");
        Accompaniments.add("Papad");
        Accompaniments.add("Chutney");
        Accompaniments.add("Fryums");
        Accompaniments.add("Picked Chilly");

        List<String> Stationery = new ArrayList<String>();
        Stationery.add("Files");
        Stationery.add("Glue");
        Stationery.add("Marker");
        Stationery.add("Printer paper");
        Stationery.add("Photo paper");
        Stationery.add("Cartridge");
        Stationery.add("Packing tape");
        Stationery.add("Cello tape");
        Stationery.add("Pens");
        Stationery.add("Pencils");

        expandableListDetail.put("Grains", Grains);
        expandableListDetail.put("Dals/Beans", Dal);
        expandableListDetail.put("Cooking Oils", CookingOil);
        expandableListDetail.put( "Breakfast Essentials", Breakfast);
        expandableListDetail.put("Nuts and Seeds", Nuts);
        expandableListDetail.put("Whole Spices", WholeSpices);
        expandableListDetail.put("Powered Masala", Powdered);
        expandableListDetail.put("Condiments", Condiments);
        expandableListDetail.put("Accompaniments",Accompaniments);
        expandableListDetail.put("Stationery", Stationery);
        return expandableListDetail;
    }
}
