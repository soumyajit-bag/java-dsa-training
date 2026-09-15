public class demo1 {
    public static void main(String[] args) {

        System.out.println("\nPattern :5");

        int n = 3;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}