import java.util.*;
public class remove {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = {10, 20, 30, 40, 50};

        int x = 2;

        for (int i = x; i < arr.length -1;i++){
            arr[i] = arr[i + 1];
            
        }

        int newSize = arr.length - 1;

        for (int i = 0; i < newSize; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
