import java.util.Scanner;

public class bublblesort {

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
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i] + "\n");

        }

        sc.close();

    }
}
