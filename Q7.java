public class Q7 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid

        for (int i = 1; i <= rows; i++) { // Loop for rows
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }
}
