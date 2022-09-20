import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        for (int i = 1; i <= Z; i++) {
            if((i%X == 0) && (i%Y == 0)) System.out.println("FizzBuzz");
            else if(i%X == 0) System.out.println("Fizz");
            else if(i%Y == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
