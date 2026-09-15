import java.util.*;

public class swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = { 10, 20, 30, 40, 50 };

        int i = 1;
        int j = 3;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for (int x = 0; x < arr.length; x++) {

            System.out.print(arr[x] + " ");
        }

    }
}
