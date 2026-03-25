public class Triangle {
    public static void main(String[] args) {
        int height = 3;
        
        // Outer loop handles the rows (1 to 3)
        for (int i = 1; i <= height; i++) {
            
            // The mathematical relationship for the stars is an odd number progression: 1, 3, 5
            int totalStars = (2 * i) - 1; 
            
            // Inner loop prints the stars for the current row
            for (int j = 0; j < totalStars; j++) {
                System.out.print("*");
                
                // Add a space between stars, but skip it after the very last star in the row
                if (j < totalStars - 1) {
                    System.out.print(" ");
                }
            }
            
            // Drop down to the next line for the next row
            System.out.println();
        }
    }
    //Add your programs here
}
