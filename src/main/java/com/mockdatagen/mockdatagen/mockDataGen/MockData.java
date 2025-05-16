package com.mockdatagen.mockdatagen.mockDataGen;

import com.mockdatagen.mockdatagen.generator.EmailGenerator;
import com.mockdatagen.mockdatagen.generator.ProductGenerator;
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
    public static String productName() {
        return ProductGenerator.generateProductName();
    }

    public static String email() {
        return EmailGenerator.generateEmail();
    }
    // Luego puedes agregar más métodos como:
    // public static String email() { ... }
    // public static Product product() { ... }
}
