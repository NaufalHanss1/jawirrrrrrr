/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testingwir1;

import java.util.Date;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author oyest
 */
public class Testingwir1Test {
    
   @Test
    public void testRandomIntInRange() {
        int min = 10;
        int max = 20;

        int randomNumber = Testingwir1.getRandomInt(min, min);

        assertTrue(randomNumber >= min && randomNumber <= max, "Random integer should be within the specified range");
    }

    @Test
    public void testRandomStringNotNull() {
        int length = 5;

        String randomString = Testingwir1.getRandomString(length);

        assertNotNull(randomString, "Random string should not be null");
        assertEquals(length, randomString.length(), "Random string length should match the specified length");
    }

    @Test
    public void testRandomDateInRange() {
        String startDateStr = "2021-01-01";
        String endDateStr = "2022-12-31";

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate;
        Date endDate;

        try {
            startDate = formatter.parse(startDateStr);
            endDate = formatter.parse(endDateStr);
        } catch (Exception e) {
            throw new RuntimeException("Error parsing dates for test");
        }

        Date randomDate = Testingwir1.getRandomDate(startDateStr, endDateStr);

        assertNotNull(randomDate, "Random date should not be null");
        assertTrue(randomDate.getTime() >= startDate.getTime() && randomDate.getTime() <= endDate.getTime(),
                "Random date should be within the specified date range");
    }

}
