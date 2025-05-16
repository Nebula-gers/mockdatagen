package com.mockdatagen.mockdatagen.generator;

import java.util.Random;

public class ProductGenerator {
    private static final String [] ADJECTIVES = {
            "Ultra", "Mega", "Smart", "Eco", "Power", "Max", "Mini", "Pro", "Lite", "Hyper"

    };
    private static final String[] NOUNS = {
            "Chair", "Lamp", "Bottle", "Speaker", "Backpack", "Fan", "Phone", "Desk", "Blender", "Router"
    };
    private static final String[] SUFFIXES = {
            "1000", "3000", "X", "Plus", "Z", "One", "Prime", "Go", "Max", ""
    };

    private static final Random RANDOM = new Random();


    public static String generateProductName() {
        String adjective = ADJECTIVES[RANDOM.nextInt(ADJECTIVES.length)];
        String noun = NOUNS[RANDOM.nextInt(NOUNS.length)];
        String suffix = SUFFIXES[RANDOM.nextInt(SUFFIXES.length)];

        return adjective + " " + noun + (suffix.isEmpty() ? "" : " " + suffix);
    }
}
