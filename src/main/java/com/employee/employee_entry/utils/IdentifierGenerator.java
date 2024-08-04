package com.employee.employee_entry.utils;

import java.util.Random;

public class IdentifierGenerator {
    public static String generateIdentifier(){
        Random random = new Random();
        int number = 1000000 + random.nextInt(9000000);
        return String.valueOf(number);
    }
}
