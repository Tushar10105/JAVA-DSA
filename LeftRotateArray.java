import java.util.Scanner;

public class LeftRotateArray {
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) temp[i] = arr[i];
        for (int i = d; i < n; i++) arr[i - d] = arr[i];
        for (int i = 0; i < d; i++) arr[n - d + i] = temp[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter rotation count: ");
        int d = sc.nextInt();

        leftRotate(arr, d);

        System.out.println("Array after left rotation:");
        for (int num : arr) System.out.print(num + " ");

        sc.close();
    }
}
