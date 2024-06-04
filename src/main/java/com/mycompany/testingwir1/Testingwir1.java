/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testingwir1;

/**
 *
 * @author oyest
 */


import java.util.Random;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.text.SimpleDateFormat;


public class Testingwir1 {
  // Method untuk menghasilkan bilangan bulat acak
    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    // Method untuk menghasilkan string acak
    public static String getRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        while (length > 0) {
            result.append(characters.charAt(random.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }

    // Method untuk menghasilkan tanggal acak
    public static Date getRandomDate(String start, String end) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date startDate = formatter.parse(start);
            Date endDate = formatter.parse(end);
            long randomMillis = ThreadLocalRandom.current().nextLong(startDate.getTime(), endDate.getTime());
            return new Date(randomMillis);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
       int randomInt = getRandomInt(1, 100);
        System.out.println("Random Integer: " + randomInt);

        // Menghasilkan string acak dengan panjang 10 karakter
        String randomString = getRandomString(10);
        System.out.println("Random String: " + randomString);

        // Menghasilkan tanggal acak antara 2020-01-01 dan 2023-12-31
        Date randomDate = getRandomDate("2020-01-01", "2023-12-31");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Random Date: " + formatter.format(randomDate));
    }
}
