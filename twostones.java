import java.util.Scanner;

public class twostones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 1) System.out.println("Alice");
        else System.out.println("Bob");
    }
}
