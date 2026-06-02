/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PACKAGEUTIL;

/**
 *
 * @author Asus
 */
import javax.swing.JOptionPane;

public class ValidationUtils {
    
    // Checks that text forms are not left blank by the user
    public static boolean isNotEmpty(String input, String fieldName) {
        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, fieldName + " cannot be left empty.", "Input Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    // Ensures numeric stats (Vigor, Damage, Level) are valid integers
    public static boolean isValidInteger(String input, String fieldName) {
        try {
            int val = Integer.parseInt(input.trim());
            if (val < 1) {
                JOptionPane.showMessageDialog(null, fieldName + " must be a positive number greater than 0.", "Input Validation Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, fieldName + " must be a valid whole number.", "Parsing Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
    

