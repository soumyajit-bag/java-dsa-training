public class binarysearch {

    public static void main(String[] args){

        int arr[] = {10, 20, 30, 40, 50};
        int target = 30;
        int left = 0;
        int right = arr.length - 1;
        int mid = (right + left) / 2;

        while(left <= right){
 
            if (arr[mid] == target){
                System.out.println("Target found at index: " + mid);
                break;
            } else{
                if (arr[mid] < target){
                    left =mid + 1;
                }else{
                    right = mid - 1;
                }

                mid = (right + left) / 2;
            }

            


        }

    }
}


