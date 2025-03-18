/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.utilities;

import java.util.regex.Pattern;

/**
 *
 * @author arsit
 */
public class DataChecker {
    private static final String DATE_PATTERN = "\\d{4}-\\d{2}-\\d{2}";

    public static boolean isValidDate(String date) {
        return Pattern.matches(DATE_PATTERN, date);
    }
}
