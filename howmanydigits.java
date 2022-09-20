import java.util.Scanner;

//public class howmanydigits {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<Integer> inputs = new ArrayList<Integer>();
//
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            inputs.add(n);
//        }
//        System.out.println(inputs);
//    }
//}

public class howmanydigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] dig = new double[1000001];
        for (int i = 1; i < 1000001; i++) {
            dig[i] = Math.log10(i) + dig[i - 1];
        }
        dig[0] = 1;
        dig[1] = 1;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println((int) Math.ceil(dig[n]));
        }

    }
}