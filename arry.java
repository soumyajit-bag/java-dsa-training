import java.util.*;

public class arry {
    public static void main(String[] args) {
        // input of arry

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

// create a new arry
int[] arr1 = new int[n+1];
for (int i = 0; i< n+1; i++){


    if (x > i){
        arr1[i] = arr[i];
    }
    else if (i==x){
        arr1[i] = y;
    }
    else{
        arr1[i] = arr[i-1];
    }
        
}

for(int i = 0; i < arr1.length; i++){
    System.out.print(arr1[i]+" ");  

    }
}
}