import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {

        int n, key;
        boolean flag = false;
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

        System.out.println("Enter Key");
        key = sc.nextInt();
        int l = n - 1;
        int f = 0;
        while (f <= l) {
            int mid = (l + f) / 2;
            if (arr[mid] == key) {
                flag = true;
                break;
            } else if (arr[mid] < key) {
                f = 1 + mid;
            }

            else {
                l = mid - 1;
            }
        }
        sc.close();
        if (flag == true) {
            System.out.println("The key is present");
        } else {
            System.out.println("The key is not present");

        }

    }
}
