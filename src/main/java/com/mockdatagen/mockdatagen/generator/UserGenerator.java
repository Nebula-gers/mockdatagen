package com.mockdatagen.mockdatagen.generator;

import com.mockdatagen.mockdatagen.models.User;


import java.util.Random;

public class UserGenerator {

    private static final String[] NAMES = {
            "Juan Pérez", "María López", "Carlos Gómez", "Ana Torres", "Luis Ramírez",
            "Lucía Mendoza", "Pedro Díaz", "Laura Castro", "Miguel Navarro", "Elena Vega"
    };

    private static final  String[] USERNAMES = {
            "juan123", "mariaDev", "carlosG", "anaT", "luis_rmz",
            "luciaCode", "pedroXD", "lauraC", "miguelN", "elena_v"
    };

    private static final String[] DOMAINS = {
            "example.com", "mail.com", "test.org", "devmail.net"
    };

    private static final Random RANDOM = new Random();

    public static User generateUser(){
        String name = NAMES[RANDOM.nextInt(NAMES.length)];
        String username = USERNAMES[RANDOM.nextInt(USERNAMES.length)];
        String email = username + "@" + DOMAINS[RANDOM.nextInt(DOMAINS.length)];

        return new User(name,email,username);
    };
}
