public class subarray {
    public static void main(String[] args) {

        int[] subarray = {1,2,3};
        int count = 0;
        for (int e = 0; e < subarray.length; e++) {
            for (int s = e; s < subarray.length; s++) {
                for (int i = e; i <= s; i++) {
                    System.out.print(subarray[i] + " ");
                    count++;
                }
                System.out.println();
            }
        }
        System.out.println("Total subarrays: " + count);
    }
}
