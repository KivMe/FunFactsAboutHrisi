package com.example.kalo.funfacts;

import java.util.Random;

class FactBook {
    private String[] facts = {
            "Hrisi is athletic?",
            "Hrisi is in love with Biology?",
            "Hrisi is going to kill you with a knife in your sleep?",
            "Hrisi likes cakes made from you?",
            "Hrisi doesn't like olives?",
            "Hrisi doesn't like roses?",
            "Hrisi loves eating sushi?",
            "Hrisi says strange things like: 1 AEG ON THREE SEAS!",
            "Hrisi listens to Enrique Miguel Iglesias Preysler?",
            "Hrisi is obsessed with Grey's Anatomy?",
            "Hrisi has plans for New Year's Eve?",
            "Hrisi doesn't want you to drive her home from the gym?"


    };

    String getFact(){


        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
