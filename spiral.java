public class spiral {
    public static void main(String[] args) {
    int n = 5;
    int[][] mat = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
            { 21, 22, 23, 24, 25 } };
    int i = 0;
    int j = 0;
    while(n >= 0)
    {

        for (int k = 0; k < n - 1; k++) {
            System.out.println(mat[i][j] + " ");
            j++;
        }
        for (int k = 0; k < n - 1; k++) {
            System.out.println(mat[i][j] + " ");
            i++;
        }

        for (int k = 0; k < n - 1; k++) {
            System.out.println(mat[i][j] + " ");
            j--;
        }
        for (int k = 0; k < n - 1; k++) {
            System.out.println(mat[i][j] + " ");
            i--;
        }
    }
     n = n-2;
    i++;
    j++;
}

}


