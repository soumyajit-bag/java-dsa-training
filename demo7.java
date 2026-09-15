import java.util.*;
public class demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int [] arr;
        //  arr = new int[5];
        //  int[] arr2 = {1,2,3,4,5};
int n = scanner.nextInt();
int[] arr = new int[n];
// take input in array
// for(int i = 0; i < arr.length; i++){
//     System.out.println(arr[i] + " ");
//     }


int max = arr[0];
for(int i = 0; i < arr.length; i++){
    // if(arr[i] > max){
    //     max = arr[i];
    arr[i] = scanner.nextInt();
    }
     int[] arr = change(arr);
     for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i] + " ");
}

}
}