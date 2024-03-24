import java.util.*;

public class Program {
    public static void main(String[] args) {
        
        // ------------------- Array Setup -------------------

        double randomNumber;
        int TOTAL_ELEMENTS = 10;

        // Defines an array to hold digits with a length determined by the total elements
        int[] digits = new int[TOTAL_ELEMENTS];

        // Populate the array with random digits
        for (int i = 0; i < digits.length; i++) {
            // Generate a random number between 1 and 9 (inclusive)
            randomNumber = Math.random() * 9 + 1;
            // Convert the random number to an integer and assign it to the array
            digits[i] = (int) randomNumber;
        }

        // Print the original digits array
        System.out.println("Input:  " + Arrays.toString(digits));

        // Call the twoSum method to add one to the array
        digits = twoSum(digits);

        // Print the updated digits array
        System.out.println("Output: " + Arrays.toString(digits));
    }
    
    // ---------------- Add One Algorithm ----------------
    
    public static int[] twoSum(int[] digits) {
        // Loop through the digits in reverse order
        for (int i = digits.length - 1; i >= 0; i--) {
            // If digit is less than 9, simply increment it by 1
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Exit method after incrementing
            }

            // If digit is 9 and it's not the first digit, set it to 0
            else if (digits[i] == 9 && i != 0) {
                digits[i] = 0;
            }

            // If the first digit is 9, add one more digit
            else {
                if (i == 0) {
                    // Create a new array with one additional digit
                    int[] newDigits = new int[digits.length + 1];
                    // Set the leftmost digit to 1
                    newDigits[0] = 1;
                    // Copy the remaining digits to the new array
                    digits = newDigits;
                    return newDigits;
                }
            }
        }
        return digits;
    }
}
