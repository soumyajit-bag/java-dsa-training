import java.util.*;

public class target {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = { 1, 2, 3, 2, 4, 2, 5 };

        int target = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }

            System.out.println("Frequency = " + count);

        }

    }
}
