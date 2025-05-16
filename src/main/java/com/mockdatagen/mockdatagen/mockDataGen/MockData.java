package com.mockdatagen.mockdatagen.mockDataGen;

import com.mockdatagen.mockdatagen.generator.UserGenerator;
import com.mockdatagen.mockdatagen.models.User;

public class MockData {

    /**
     * Genera un usuario falso con nombre, email y username.
     * @return User generado aleatoriamente
     */
    public static User user() {
        return UserGenerator.generateUser();
    }

    // Luego puedes agregar más métodos como:
    // public static String email() { ... }
    // public static Product product() { ... }
}
