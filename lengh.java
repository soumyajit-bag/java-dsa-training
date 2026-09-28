public class lengh {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -1, 6, 9, 7, 12, 8};

        int SI = 1;
        int length = 5;

        System.out.println("Length = " + length);
        for (int i = SI - 1; i < SI - 1 + length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        SI = 2;
        length = 6;

        System.out.println("Length = " + length);
        for (int i = SI - 1; i < SI - 1 + length; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println();

        SI = 4;
        length = 2;

        System.out.println("Length = " + length);
        for (int i = SI - 1; i < SI - 1 + length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        SI = 7;
        length = 3;

        System.out.println("Length = " + length);
        for (int i = SI - 1; i < SI - 1 + length; i++)
            System.out.print(arr[i] + " ");
    }
}