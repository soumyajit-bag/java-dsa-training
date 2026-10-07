inport java.util.*
public interface old {
public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the number n");
    int n = sc.nextInt();
    System.out.println("enter the number i");
    int i = sc.nextInt();
    ((n >> i) & 1) == 1;
    
}
