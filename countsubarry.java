public class countsubarry {

    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 1, 2, 3, -6, 5, 12};

        int S = 1;

        int count = arr.length - S + 1;

        System.out.println("Number of subarrays = " + count);
    }
}

