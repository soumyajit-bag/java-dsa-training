import java.util.Scanner;

public class setbit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int i = sc.nextInt();

            if ((N & (1 << i)) != 0) {
                System.out.println("setbit");
            } else {
                System.out.println("unsetbit");
            }
        }
    }
}

