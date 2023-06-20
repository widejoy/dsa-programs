import java.util.Scanner;

public class insertrionsort {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter size  of array");

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {

            int temp = arr[i];
            int j = i - 1;
            while (j != -1 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        sc.close();
    }

}
