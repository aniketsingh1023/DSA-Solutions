public class Q5 {
    public static void main(String[] args) {
        int number = 121; // Hardcoded number to check
        
        int originalNumber = number; // Store the original number
        int reverse = 0;             // To store the reversed number
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;       // Extract the last digit
            reverse = reverse * 10 + digit; // Append digit to reversed number
            number = number / 10;          // Remove the last digit
        }
        
        // Check if the original number is equal to the reversed number
        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
