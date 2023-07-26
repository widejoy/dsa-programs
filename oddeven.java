import java.util.Scanner;

public class oddeven {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");

        }
        sc.close();
    }
}