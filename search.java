import java.util.Scanner;

class newclass {

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

        System.out.println("Enter key");
        key = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (arr[i] == key) {
                flag = true;
                break;
            } else {
                flag = false;
            }

        }

        if (flag == true) {
            System.out.println("The key is present");
        } else {
            System.out.println("The key is not present");

        }

        sc.close();
    }

}