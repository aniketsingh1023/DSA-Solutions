public class Q6 {
    public static void main(String[] args) {
        int num = 121; // Original number to check
        int originalNum = num; // Store the original number
        int reverse = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            reverse = reverse * 10 + digit; // Add it to the reversed number
            num = num / 10; // Remove the last digit
        }

        // Check if the original number and reversed number are equal
        if (originalNum == reverse) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
