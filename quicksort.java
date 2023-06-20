import java.util.Scanner;

public class quicksort {

    void quicksort_1(int array[], int start, int end) {

        if (end <= start)
            return;
        int pivot = partition(array, start, end);
        quicksort_1(array, start, pivot - 1);
        quicksort_1(array, pivot + 1, end);

    }

    int partition(int array[], int start, int end) {
        int i = start - 1;
        int pivot = end - 1;

        for (int j = start; j <= end - 1; j++) {

            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;

    }

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
        quicksort hello = new quicksort();
        hello.quicksort_1(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i] + "\n");

        }
        sc.close();

    }
}
