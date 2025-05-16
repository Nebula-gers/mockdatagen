package com.mockdatagen.mockdatagen.generator;

import javax.print.DocFlavor;
import javax.print.attribute.standard.MediaSize;
import java.util.Random;
import com.mockdatagen.generator.EmailGenerator;


public class EmailGenerator {

    private  static final  String [] NAMES = {
            "juan", "maria", "carlos", "ana", "luis", "lucia", "pedro", "laura", "miguel", "elena"
    };

    private static final String [] DOMAINS = {
            "gmail.com", "yahoo.com", "outlook.com", "protonmail.com", "testmail.org"
    };

    private static final Random RANDOM = new Random();

    public static String generateEmail(){
        String name = NAMES[RANDOM.nextInt(NAMES.length)];
        int number = RANDOM.nextInt(900) + 100;
        String domain = DOMAINS[RANDOM.nextInt(DOMAINS.length)];

        return name + number = "@" + domain;
    };


}
