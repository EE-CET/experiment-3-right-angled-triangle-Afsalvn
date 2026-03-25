public class Triangle {
    public static void main(String[] args) {
        int height = 3;
        for (int i = 1; i <= height; i++) {
            int totalStars = (2 * i) - 1; 
            
            for (int j = 0; j < totalStars; j++) {
                System.out.print("*");   
                if (j < totalStars - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
