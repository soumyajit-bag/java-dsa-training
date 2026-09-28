public class permitsubarry {
    
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 3};

        for (int S = 0; S < arr.length; S++) {

            for (int E = S; E < arr.length; E++) {

                for (int i = S; i <= E; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
            }
        }
    }
}

